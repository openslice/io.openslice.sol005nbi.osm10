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
package OSM10Util.examples;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile;

import OSM10Util.OSM10ArchiveExtractor.OSM10NSExtractor;
import OSM10Util.OSM10ArchiveExtractor.OSM10VNFDExtractor;
import OSM10Util.OSM10NSReq.OSM10NSRequirements;
import OSM10Util.OSM10VNFReq.OSM10VNFRequirements;



public class Example {
	//private static URL cirrosVnfUrl;
	//private static URL hackfest1VnfUrl;
	//private static URL hackfest2VnfUrl;
	//private static URL pingPongNsUrl;
    private static URL hackfestMultiVduUrl;
    private static URL hackfestMultiVduNSUrl;

    public static void main(String[] args) throws IOException {
    	hackfestMultiVduUrl = new URL("http://localhost/osm/hackfest_multivdu_vnf.tar.gz");
    	hackfestMultiVduNSUrl = new URL("http://localhost/osm/hackfest_multivdu_ns.tar.gz");

        File hackfestMultiVduFile = File.createTempFile("hackfest_multivdu_vnf", ".tar.gz");
        File hackfestMultiVduNSFile = File.createTempFile("hackfest_multivdu_ns", ".tar.gz");
        //File pingPongNsFile = File.createTempFile("ping_pong_ns", ".tar.gz");

        hackfestMultiVduFile.deleteOnExit();
        hackfestMultiVduNSFile.deleteOnExit();

        System.out.println("Downloading VNF");

        FileUtils.copyURLToFile(hackfestMultiVduUrl, hackfestMultiVduFile);
        FileUtils.copyURLToFile(hackfestMultiVduNSUrl, hackfestMultiVduNSFile);

        System.out.println("Calculating requirements...");

        OSM10VNFDExtractor vnfHackfestMultiVduExtract = new OSM10VNFDExtractor(hackfestMultiVduFile.getPath());
    	Vnfd vnfHackfestMultiVduDescriptor = vnfHackfestMultiVduExtract.extractVnfdDescriptor();
        System.out.println(vnfHackfestMultiVduDescriptor.toString());
        OSM10VNFRequirements vnfHackfestMultiVduRequirements = new OSM10VNFRequirements(vnfHackfestMultiVduDescriptor);
        System.out.println(vnfHackfestMultiVduRequirements.toHTML());
        OSM10NSExtractor nsExtractor = new OSM10NSExtractor(hackfestMultiVduNSFile);
        Nsd hackfestMultiVduNSDescriptor = nsExtractor.extractNsDescriptor();
        OSM10NSRequirements hackfestMultiVduNSRequirements = new OSM10NSRequirements(hackfestMultiVduNSDescriptor);

		for (Df v : hackfestMultiVduNSDescriptor.getDf().values()) {
			for( VnfProfile q : v.getVnfProfile().values())
			{
				System.out.println("setMemberVNFIndex: "+Integer.parseInt(q.getId()));
				System.out.println("setVNFDIdRef: "+(String) q.getVnfdId());
			}
		}        
    }
}
