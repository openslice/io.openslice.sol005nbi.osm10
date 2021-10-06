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
package OSM10Util.OSM10VNFReq;

import java.util.Formatter;
import java.util.Map;

import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDescKey;

public class OSM10VNFRequirements {
    public Vnfd descriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;
    
    public OSM10VNFRequirements()
    {}
    
    public OSM10VNFRequirements(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd vnfHackfestMultiVduDescriptor) {
		  this.descriptor = vnfHackfestMultiVduDescriptor;
		
		  this.memoryMB = 0;
		  this.storageGB = 0;
		  this.vcpuCount = 0;
		  this.vmCount = 0;
		  Map<VirtualComputeDescKey, VirtualComputeDesc> virtualComputeDescMap = vnfHackfestMultiVduDescriptor.getVirtualComputeDesc();
		  if ( virtualComputeDescMap != null) {
			  for(VirtualComputeDesc tmp : virtualComputeDescMap.values())
			  {
				  this.memoryMB = tmp.getVirtualMemory().getSize().intValue();
				  this.vcpuCount = tmp.getVirtualCpu().getNumVirtualCpu().intValue();
				  this.vmCount++;
			  }
			  Map<VirtualStorageDescKey, VirtualStorageDesc> virtualStorageDescMap = vnfHackfestMultiVduDescriptor.getVirtualStorageDesc();
			  for(VirtualStorageDesc tmp : virtualStorageDescMap.values())
			  {
				  this.storageGB = tmp.getSizeOfStorage().intValue();
			  }	   
		  } 
		   
	}

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", descriptor.getProductName());
        fmt.format("<b>%s: </b>%s<br>", "Vendor", descriptor.getProvider() );
        fmt.format("<b>%s: </b>%s<br>", "Version", descriptor.getVersion() );
        fmt.format("<b>%s: </b>%s<br>", "Description", descriptor.getProductInfoDescription());
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "VNFRequirements{" +
                "vnfName=" + descriptor.getProductName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
