/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm10
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package OSM10Util.OSM10ArchiveExtractor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import io.openslice.sol005nbi.OSMUtil.OSMVNFDExtractor;

public class OSM10VNFDExtractor implements OSMVNFDExtractor{

    private static int BUFFER_SIZE = 4 * 1024;

    private String VNFDescriptorFilePath;

	private String descriptorYAMLfile;	
	
	private ByteArrayOutputStream iconfilePath;	


	public OSM10VNFDExtractor(String filePath) {
        this.VNFDescriptorFilePath = filePath;
    }
    
    public Vnfd extractVnfdDescriptor() throws IOException {
    	Vnfd descriptor = null;
    	// Read the vnf descriptor file
    	//System.out.println("Get the file from "+"http://localhost:13000"+this.VNFDescriptorFilePath);
    	//try (InputStream in = new URL("http://localhost:13000"+this.VNFDescriptorFilePath).openStream();
        try (InputStream in = new FileInputStream(VNFDescriptorFilePath);
    		//unzip
            GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
    		//untar
            TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)){
            TarArchiveEntry entry = null;
            // Iterate through the files in the archive
            while ((entry = tarIn.getNextTarEntry()) != null) {              
                // If the file ends in .yaml
                if (entry.getName().endsWith(".yaml")) {

					System.out.println("INFO: Examining " + entry.getName() + " for vnfd tag..." );
					// Create a new file
					ByteArrayOutputStream file = new ByteArrayOutputStream();
					
					int count;
					byte data[] = new byte[BUFFER_SIZE];
					// Read in chunks of BUFFER SIZE
					while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						// Write in a separate file.
					    file.write(data, 0, count);
					}
					// Set the file as the yaml file
					this.descriptorYAMLfile = new String(file.toByteArray());
					descriptor = extractVnfdDescriptorFromYAMLFile(this.descriptorYAMLfile);					
                }
				// If the file is a png or a jpg
                if  ( entry.getName().endsWith(".png") || entry.getName().endsWith(".jpg")) {                    	
					this.iconfilePath = new ByteArrayOutputStream();
					//Copy the file to iconfilePath
					int count;
					byte data[] = new byte[BUFFER_SIZE];
					while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						this.iconfilePath.write(data, 0, count);
					}                	
                }
            }
        }

        return descriptor;
    }

    public void extractIcon() throws IOException {
        try (InputStream in = new FileInputStream(VNFDescriptorFilePath);
    		//unzip
            GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
    		//untar
            TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)){
            TarArchiveEntry entry = null;
            // Iterate through the files in the archive
            while ((entry = tarIn.getNextTarEntry()) != null) {              
                // If the file is a png or a jpg
                if  ( entry.getName().endsWith(".png") || entry.getName().endsWith(".jpg")) {                    	
					this.iconfilePath = new ByteArrayOutputStream();
					//Copy the file to iconfilePath
					int count;
					byte data[] = new byte[BUFFER_SIZE];
					while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						this.iconfilePath.write(data, 0, count);
					}                	
                }
            }
        }
    }

//    public VNFDescriptor extractDescriptor() throws IOException {
//        try (InputStream in = new FileInputStream(VNFDescriptorFile);
//             GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
//             TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)){
//            TarArchiveEntry entry, root = null;
//
//            while ((entry = tarIn.getNextTarEntry()) != null) {
//                if(root == null && entry.getName().indexOf("/") == entry.getName().length()-1) {
//                    root = entry;
//                    continue;
//                }
//
//                if(entry.getName().indexOf("/", root.getName().length()) == -1 &&
//                        entry.getName().endsWith(".yaml")) {
//                    ByteArrayOutputStream file = new ByteArrayOutputStream();
//
//                    int count;
//                    byte data[] = new byte[BUFFER_SIZE];
//
//                    while((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
//                        file.write(data, 0, count);
//                    }
//
//                    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
//                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//                    
//                    this.descriptorYAMLfile = new String(file.toByteArray());
//                    VNFTopLevelContainer container = mapper.readValue(file.toByteArray(), VNFTopLevelContainer.class);
//
//                	if (container != null) {
//                	    VNFDescriptor descriptor = container.catalog.vnfDescriptors.get(0);
//
//                	    try {
//                	        mapper = new ObjectMapper(new YAMLFactory());
//                	        mapper.readValue(file.toByteArray(), VNFTopLevelContainer.class);
//                            descriptor.unknownFields = false;
//                        } catch (JsonMappingException ex) {
//                	        ex.printStackTrace();
//                	        descriptor.unknownFields = true;
//                        }
//
//                		return descriptor;
//                	} else {
//                		return null;
//                	}
//
//                }
//            }
//        }
//
//        return null;
//    }

	public String getDescriptorYAMLfile() {
		return descriptorYAMLfile;
	}

	public void setDescriptorYAMLfile(String descriptorYAMLfile) {
		this.descriptorYAMLfile = descriptorYAMLfile;
	}


    public ByteArrayOutputStream getIconfilePath() {
		return iconfilePath;
	}

    public static Vnfd extractVnfdDescriptorFromYAMLFile(String descriptorYAMLfile) throws IOException {
    	Vnfd descriptor = null;
		// Set the file as the yaml file
		
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());					
		JsonNode tr = null;
		try {
			// If the file is not empty
			if ( !descriptorYAMLfile.equals("") ) {
				// Search in yaml for vnfd:vnfd
				tr = mapper.readTree( descriptorYAMLfile ).findValue("vnfd:vnfd");
				// If there isn't any, search for vnfd
				if ( tr == null ) {
			    	tr = mapper.readTree( descriptorYAMLfile ).findValue("vnfd");
		        }
		    }    
		}
		catch(Exception e)
		{
			System.out.println("Cannot read yaml file");
		}
		    					   
	    // If there is a node found
		if ( tr != null ) {      
			// Get the first element
			if (tr.get(0) != null){ 
				tr = tr.get(0);
			}
			// Convert it to string
		    String s = tr.toString();                     
		
		    //Replace rw-vnfd with empty string
			s = s.replaceAll("rw-vnfd:", ""); //some yaml files contain  rw-vnfd: prefix in every key which is not common in json
			//Replace vnfd with empty string
			s = s.replaceAll("vnfd:", ""); //some yaml files contain  nsd: prefix in every key which is not common in json
			System.out.println("Yaml file:"+s);
			//try {
			descriptor = mapper.readValue( s , Vnfd.class);
			//}catch (Exception e) {
			//	System.out.println("ERROR: " + entry.getName() + " cannot be read as Vnfd class! " + e.getMessage());        						
			//}                        	
		}else {
			System.out.println("ERROR: The yaml file does not contain vnfd tag! " );
		}
		return descriptor;
    }
}
