package OSM10NBIClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdKey;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.NsdBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.NsdBuilder;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Vnfd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.VnfdBuilder;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import OSM10NBIClient.NSInstantiateInstanceRequestPayload.NInterface;
import OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vdu;
import OSM10Util.OSM10VNFReq.OSM10VNFRequirements;
import io.openslice.sol005nbi.OSMClient;

public class OSM10NBIClientT {
	
	public static void main(String args[]) {
	    OSM10Client OSM10Client = new OSM10Client("https://10.10.10.41:9999","admin","admin","admin");
		String body="{\"username\":\"ioannis\",\"domain_name\":\"test\",\"password\":\"123\",\"projects\":[\"admin\",\"test\"],\"project_role_mappings\":[{\"project\":\"admin\",\"role\":\"system_admin\"},{\"project\":\"test\",\"role\":\"system_admin\"}]}";
		//{"username":"ioannis","domain_name":"test","password":"123","projects":["admin","test"],"project_role_mappings":[{"project":"admin","role":"system_admin"},{"project":"test","role":"system_admin"}]}
		//String body = payload;

//		//PROJECT CREATE
//		ProjectCreateRequestPayload payloadCreateProject = new ProjectCreateRequestPayload();
//		payloadCreateProject.setName("test5");
//		payloadCreateProject.setAdmin(true);
//		payloadCreateProject.setDomain_name("test");
//		OSM10Client.createProject(payloadCreateProject.toJSON());
		
//		//PROJECT EDIT
//		ProjectEditRequestPayload payloadEditProject = new ProjectEditRequestPayload();
//		payloadEditProject.setAdmin(false);
//		payloadEditProject.setName("test6");
//		OSM10Client.editProject("521ff1e9-f980-475f-9266-c428de028f37",payloadEditProject.toJSON());
		
		//OSM10Client.getProjectDeleteResponse("b127ae37-b39a-4c3e-abe8-8ffb2b4bd61f");
		
//	    //USER CREATE
//		UserCreateRequestPayload payloadNewUser = new UserCreateRequestPayload();
//		payloadNewUser.setUsername("ioannis3");
//		payloadNewUser.setDomain_name("test");
//		payloadNewUser.setPassword("123");
//		List<String> tmpProjects = new ArrayList<String>();
//		tmpProjects.add("admin");
//		tmpProjects.add("test");
//		payloadNewUser.setProjects(tmpProjects);
//		ProjectRoleMapping prm = new ProjectRoleMapping("admin","system_admin");
//		List<ProjectRoleMapping> prml = new ArrayList<ProjectRoleMapping>();
//		prml.add(prm);
//		prm = new ProjectRoleMapping("test","system_admin");
//		prml.add(prm);
//		payloadNewUser.setProject_role_mappings(prml);
//		//System.out.println("Payload "+payloadNewUser.toJSON());
//	    OSM10Client.createUser(payloadNewUser.toJSON());
	    
	    //USER EDIT
//		UserEditRequestPayload payloadEditUser = new UserEditRequestPayload();
//		//payloadEditUser.setUsername("ioannis3");
//		payloadEditUser.setPassword("123");
//		List<String> tmpProjectsEdit = new ArrayList<String>();
//		tmpProjectsEdit.add("admin");
//		tmpProjectsEdit.add("test");
//		tmpProjectsEdit.add("test2");
//		payloadEditUser.setProjects(tmpProjectsEdit);
//		List<ProjectRoleMapping> prmlEdit = new ArrayList<ProjectRoleMapping>();
//		prmlEdit.add(new ProjectRoleMapping("admin","system_admin"));
//		prmlEdit.add(new ProjectRoleMapping("test","project_user"));
//		prmlEdit.add(new ProjectRoleMapping("test2","project_user"));
//		payloadEditUser.setProject_role_mappings(prmlEdit);		
////		List<ProjectRoleMapping> prmlEdit2 = new ArrayList<ProjectRoleMapping>();
////		prmlEdit2.add(new ProjectRoleMapping("test2","system_admin"));
////		payloadEditUser.setAdd_project_role_mappings(prmlEdit2);
////		System.out.println("Payload "+payloadEditUser.toJSON());	    
//		OSM10Client.editUser("1914ec5b-af9a-4f32-8806-b6aa29b302f2",payloadEditUser.toJSON());
		
		
//		//VIM CREATE
//	    VIMCreateRequestPayload payloadNewVIM = new VIMCreateRequestPayload();
//		payloadNewVIM.setName("CloudVille3");
//		payloadNewVIM.setVim_type("openstack");
//		payloadNewVIM.setVim_url("http://10.80.0.11:5000/v3/");
//		payloadNewVIM.setVim_tenant_name("OSMFIVE");
//		payloadNewVIM.setVim_user("osmfivevim");
//		payloadNewVIM.setVim_password("osmfivevim5g#");
//	    OSM10Client.createVim(payloadNewVIM.toJSON());
		ResponseEntity<String> vims_list_entity = OSM10Client.getVIMs();
		if (vims_list_entity == null || vims_list_entity.getStatusCode().is4xxClientError()
				|| vims_list_entity.getStatusCode().is5xxServerError()) {
			System.out.println("VIMs List Get Request failed. Status Code:" + vims_list_entity.getStatusCode().toString()
					+ ", Payload:" + vims_list_entity.getBody().toString());
		} else {
			// NS action starts
			System.out.println("Got VIM list "+vims_list_entity.getBody());
		}			
		
		try {
			ResponseEntity<String> vnfd_package_content = OSM10Client.getVNFDPackageContent("5261da07-b38f-4115-863c-1465893bd8d3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONArray tmp = OSM10Client.getAllNSInstanceInfo();
		System.out.println(tmp.toString());		
//	    
//		//VIM EDIT
//		VIMEditRequestPayload payloadEditVIM = new VIMEditRequestPayload();
//		payloadEditVIM.setName("CloudVille");
//		payloadEditVIM.setVim_url("http://10.80.0.11:5000/v3/");
//		payloadEditVIM.setVim_type("Openstack");
//		payloadEditVIM.setDatacenter("datacenter");
//		payloadEditVIM.setDescription("description");
//		payloadEditVIM.setVim_password("osmfivevim5g#");
//		payloadEditVIM.setVim_user("OSMFIVE");
//		String vim_id = "6d080e3b-cbd1-4c4e-a114-9c556c285eb4";		
//	    OSM10Client.editVim(vim_id,payloadEditVIM.toJSON());

	    
//	    System.out.println("************************");
//	    System.out.println("Getting Users");
//	    System.out.println("************************");
//	    OSM10Client.getUsers();
//	    System.out.println("************************");
//	    System.out.println("Getting VNFPackages");
//	    System.out.println("************************");
//	    OSM10Client.getVNFPackages();		
//	    System.out.println("************************");
//	    System.out.println("Getting VNFDs");
//	    System.out.println("************************");
//		Vnfd[] vnfds = OSM10Client.getVNFDs();
//		if(vnfds!=null)
//		{
//			for (Vnfd v : vnfds) {
//				System.out.println("=== LIST VNFDs POJO object response: " + v.toString());			
//				System.out.println("=== LIST VNFDs POJO object id: " + v.getId() + ", Name: " + v.getProductName());
//				Vnfd tmp_vnfd = OSM10Client.getVNFDbyID(v.getId());
//				System.out.println("=== LIST VNFDs POJO object id: " + tmp_vnfd.getId() + ", Name: " + tmp_vnfd.getProductName());			
//			}
//		}
//	    System.out.println("************************");
//	    System.out.println("Getting NSDescriptors");
//	    System.out.println("************************");
//	    OSM10Client.getNSDescriptors();		
//	    System.out.println("************************");
//	    System.out.println("Getting NSDs");
//	    System.out.println("************************");
//		Nsd[] nsds = OSM10Client.getNSDs();
//		for (Nsd v : nsds) {
//			System.out.println("=== LIST NSDs POJO object response: " + v.toString());
//			System.out.println("=== LIST NSDs POJO object id: " + v.getId() + ", Name: " + v.getName());			
//			Nsd tmp_nsd = OSM10Client.getNSDbyID(v.getId());
//			System.out.println("=== LIST NSDs POJO object id: " + tmp_nsd.getId() + ", Name: " + tmp_nsd.getName());			
//		}
//		System.out.println("Working Directory = " +System.getProperty("user.dir"));
//		
//		//Create VNFD
//	    System.out.println("************************");
//	    System.out.println("Creating VNF Instance");
//	    System.out.println("************************");
//		ResponseEntity<String> response = null;
//		response = OSM10Client.createVNFDPackage();
//		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
//			System.out.println("VNFD Package Creation failed.");
//			return;				
//		}
//		else
//		{
//			JSONObject obj = new JSONObject(response.getBody());
//			String vnfd_id = obj.getString("id");
//			System.out.println(response.getStatusCode()+" replied. The new VNFD Package id is :" + vnfd_id);
//		    System.out.println("Uploading VNF Package from URL");
//		    System.out.println("************************");
//		    String vnfd_package_path = "http://localhost/osm/hackfest_multivdu_vnf.tar.gz";
//			try {
//				response = OSM10Client.uploadVNFDPackageContent(vnfd_id, vnfd_package_path);
//				if (response == null || response.getStatusCode().is4xxClientError()
//						|| response.getStatusCode().is5xxServerError()) {
//					System.out.println("Upload of VNFD Package Content failed. Deleting VNFD Package."+response.getBody());
//					// Delete the package from the OSM
//					OSM10Client.deleteVNFDPackage(vnfd_id);
//					return;
//				}
//				else
//				{
//					System.out.println("VNFD Package uploaded successfully");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
////	    System.out.println("************************");
////	    System.out.println("Uploading VNF Zip from local file");
////	    System.out.println("************************");
////		String vnfd_zip_path = "./src/main/resources/temp/cirros_vnf.tar.gz";
////		try 
////		{
////			OSM10Client.uploadVNFDZip(vnfd_id, vnfd_zip_path);
////		}
////		catch(IOException e)
////		{
////			System.out.println(e.getMessage());
////			return;
////		}

//	    System.out.println("Uploading NSD Package from URL");
//	    System.out.println("************************");
//	    String nsd_package_path = "http://localhost/osm/hackfest_multivdu_ns.tar.gz";
//	    String nsd_id = null;
//		response = OSM10Client.createNSDPackage();
//		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
//			System.out.println("NSD Package Creation failed.");
//			return;				
//		}
//		else
//		{
//			JSONObject obj = new JSONObject(response.getBody());
//			nsd_id = obj.getString("id");
//			System.out.println(response.getStatusCode()+" replied. The new NSD Package id is :" + nsd_id);
//		    System.out.println("Uploading NS Package from URL");
//		    System.out.println("************************");
//			try {
//				response = OSM10Client.uploadNSDPackageContent(nsd_id, nsd_package_path);
//				if (response == null || response.getStatusCode().is4xxClientError()
//						|| response.getStatusCode().is5xxServerError()) {
//					System.out.println("Upload of NSD Package Content failed. Deleting NSD Package.");
//					// Delete the package from the OSM
//					OSM10Client.deleteVNFDPackage(nsd_id);
//					return;
//				}
//				else
//				{
//					System.out.println("NSD Package uploaded successfully");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		//Create NSD
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip from local file");
//	    System.out.println("************************");
//	    System.out.println("************************");
//	    System.out.println("Creating NSD Instance");
//	    System.out.println("************************");
//		String nsd_id = OSM10Client.createNSDPackage();
//		// TODO Handle failure acquiring a vnfd_id
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip");
//	    System.out.println("************************");
//		String nsd_zip_path = "C:/EP/OSMDEVOPS/OSMvFIVE_NSDs/cirros_2vnf_ns_b.tar.gz";
//		OSM10Client.uploadNSDZip(nsd_id, nsd_zip_path);		
//
//		//Create NS Instance
//	    System.out.println("************************");
//	    System.out.println("Creating NS Instance");
//	    System.out.println("************************");
//		String vim_id="033797cd-cc1e-4727-b9a6-9f7024c92c6e";
//		String ns_instance_id = OSM10Client.createNSInstance("test",vim_id, nsd_id);
//		if(ns_instance_id!=null)
//		{
//			OSM10Client.InstantiateNSInstance(ns_instance_id);
//		}
//		pressAnyKeyToContinue();
//		if(ns_instance_id!=null)
//		{
//			OSM10Client.deleteNSInstance(ns_instance_id);
//		}
	    	    
	}
//		@Nullable Map<ConstituentVnfdKey, ConstituentVnfd> constituentVnfds = OSM10Client.getNSDbyID(nsd_id).getConstituentVnfd();
//		NSCreateInstanceRequestPayload nscreateinstancerequestpayload = new NSCreateInstanceRequestPayload();
//		nscreateinstancerequestpayload.setNsName("test");
//		nscreateinstancerequestpayload.setVimAccountId("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//		nscreateinstancerequestpayload.setWimAccountId(false);
//		// Here we need to get the ExperimentOnBoardDescriptor based on the Experiment.
//		// An Experiment might have multiple OnBoardDescriptors if it is OnBoarded to multiple OSM MANOs.
//		// We temporarily select the first (and most probably the only one). 
//		// Otherwise the user needs to define the OSM MANO where the Experiment is OnBoarded in order to instantiate.
//		nscreateinstancerequestpayload.setNsdId(nsd_id);
//		Integer count = 0;
//		for(ConstituentVnfd constituenVnfd : constituentVnfds.values())
//		{
//			OSM10NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nscreateinstancerequestpayload.new VnF();  
//			count=count+1;
//			vnf_tmp.setMemberVnFIndex(count.toString());
//			if(count!=2)
//				vnf_tmp.setVimAccount("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//			else
//			{
//				vnf_tmp.setVimAccount("8571aa95-4c17-4d87-a865-c98126dd0241");
//				OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vdu vdu_tmp = nscreateinstancerequestpayload.new Vdu();
//				vdu_tmp.setId("cirros_vnfd-VM");
//				OSM10NBIClient.NSInstantiateInstanceRequestPayload.NInterface interface_tmp = nscreateinstancerequestpayload.new NInterface();
//				interface_tmp.setName("eth0");
//				interface_tmp.setFloating_ip_required(true);
//				vdu_tmp.setInterfaceObj(new ArrayList<NInterface>());
//				vdu_tmp.getInterfaceObj().add(interface_tmp);
//				vnf_tmp.setVdu(new ArrayList<Vdu>());
//				vnf_tmp.getVdu().add(vdu_tmp);
//			}			
//			nscreateinstancerequestpayload.getVnf().add(vnf_tmp);			
//		}
//		{
//			OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp = nscreateinstancerequestpayload.new Vld();  
//			vld_tmp.setName("cirros_3vnf_nsd_vld1");
//			
////			IpProfileParamsBuilder ipprofileparamsbuilder = new IpProfileParamsBuilder();			
////			ipprofileparamsbuilder.setIpVersion(IpVersion.Ipv4);
////			ipprofileparamsbuilder.setSubnetAddress(new IpPrefix(new Ipv4Prefix("192.168.100.0/24")));
////			ipprofileparamsbuilder.setGatewayAddress(new IpAddress(new Ipv4Address("0.0.0.0")));
////			List<DnsServer> dnsserverlist = new ArrayList<DnsServer>();
////			DnsServerBuilder dnsserverbuilder = new DnsServerBuilder();
////			dnsserverbuilder.setAddress(new IpAddress(new Ipv4Address("8.8.8.8")));			
////			dnsserverlist.add(dnsserverbuilder.build());			
////			ipprofileparamsbuilder.setDnsServer(dnsserverlist);
////			IpProfileParams ipprofileparams_tmp = ipprofileparamsbuilder.build();
////			vld_tmp.setIpProfile(ipprofileparams_tmp);
//			
//			//vld_tmp.setVimNetworkName("OSMFIVE_selfservice01");
//			LinkedHashMap<String,String> tmp=new LinkedHashMap<>();
//			tmp.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSMFIVE_selfservice01");			
//			tmp.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSMFIVE_selfservice01");
//			vld_tmp.setVimNetworkName(tmp);
//			nscreateinstancerequestpayload.getVld().add(vld_tmp);
//			
//			OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp2 = nscreateinstancerequestpayload.new Vld();  
//			vld_tmp2.setName("cirros_3vnf_nsd_vld2");
//			//vld_tmp2.setVimNetworkName("OSM_mgmt_net");
//			LinkedHashMap<String,String> tmp2=new LinkedHashMap<>();
//			tmp2.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSM_mgmt_net");
//			tmp2.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSM_mgmt_net");			
//			vld_tmp2.setVimNetworkName(tmp2);
//			nscreateinstancerequestpayload.getVld().add(vld_tmp2);
//		}
//		//String tmptmp="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\"65a644b1-6079-44ba-a227-34577079928b\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"3\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\":[{\"name\":\"cirros_3vnf_nsd_vld1\",\"vim-network-name\":\"OSMFIVE_selfservice01\"},{\"name\":\"cirros_3vnf_nsd_vld2\",\"vim-network-name\":\"OSM_mgmt_net\"}]}";
//		// Get Experiment ID and VIM ID and create NS Instance.
//		System.out.println("NS Instance creation payload : " + nscreateinstancerequestpayload.toJSON());
//		ResponseEntity<String> ns_instance_creation_entity = OSM10Client.createNSInstance(nscreateinstancerequestpayload.toJSON());
//		//String	test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\", \"vdu\":[ {\"id\": \"mgmtVM\", \"interface\": [{\"name\": \"mgmtVM-eth0\", \"floating-ip-required\": true }]} ]},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\": [ {\"name\": \"mgmtnet\", \"vim-network-name\": \"OSMFIVE_selfservice01\"}]}";			
//		//String	test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\": [ {\"name\": \"mgmtnet\", \"vim-network-name\": \"OSMFIVE_selfservice01\"}]}";	
//		//System.out.println("NS Instance creation payload : " + test_payload);
//		//ResponseEntity<String> ns_instance_creation_entity = OSM10Client.createNSInstance(test_payload);
//		// The NS Instance ID is set
//
//		// NS instance creation
//		if (ns_instance_creation_entity == null || ns_instance_creation_entity.getStatusCode().is4xxClientError()
//				|| ns_instance_creation_entity.getStatusCode().is5xxServerError()) {
//			// NS instance creation failed
//			System.out.println("NS Instance creation failed with response: "+ ns_instance_creation_entity.getBody().toString());
//		} else {
//			// String nsr_id =
//			JSONObject ns_instance_creation_entity_json_obj = new JSONObject(ns_instance_creation_entity.getBody());
//			System.out.println("NS creation succeded with "+ns_instance_creation_entity.getBody());
//			String nsd_instance_id = ns_instance_creation_entity_json_obj.getString("id");
//			// Instantiate NS Instance
//			NSInstantiateInstanceRequestPayload nsrequestpayload = new NSInstantiateInstanceRequestPayload();
//			nsrequestpayload.setNsName("test");
//			nsrequestpayload.setVimAccountId("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//			nsrequestpayload.setWimAccountId(false);
//			nsrequestpayload.setNsdId(nsd_id);
//			count = 0;
//			for(ConstituentVnfd constituenVnfd : constituentVnfds.values())
//			{
//				OSM10NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nsrequestpayload.new VnF();  
//				count=count+1;
//				vnf_tmp.setMemberVnFIndex(count.toString());
//				if(count!=2)
//					vnf_tmp.setVimAccount("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//				else
//				{
//					vnf_tmp.setVimAccount("8571aa95-4c17-4d87-a865-c98126dd0241");
//					OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vdu vdu_tmp = nscreateinstancerequestpayload.new Vdu();
//					vdu_tmp.setId("cirros_vnfd-VM");
//					OSM10NBIClient.NSInstantiateInstanceRequestPayload.NInterface interface_tmp = nscreateinstancerequestpayload.new NInterface();
//					interface_tmp.setName("eth0");
//					interface_tmp.setFloating_ip_required(true);
//					vdu_tmp.setInterfaceObj(new ArrayList<NInterface>());
//					vdu_tmp.getInterfaceObj().add(interface_tmp);
//					vnf_tmp.setVdu(new ArrayList<Vdu>());
//					vnf_tmp.getVdu().add(vdu_tmp);
//				}
//				nsrequestpayload.getVnf().add(vnf_tmp);			
//			}
//			{
//				OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp = nsrequestpayload.new Vld();  
//				vld_tmp.setName("cirros_3vnf_nsd_vld1");
//				
////				IpProfileParamsBuilder ipprofileparamsbuilder = new IpProfileParamsBuilder();			
////				ipprofileparamsbuilder.setIpVersion(IpVersion.Ipv4);
////				ipprofileparamsbuilder.setSubnetAddress(new IpPrefix(new Ipv4Prefix("192.168.100.0/24")));
////				ipprofileparamsbuilder.setGatewayAddress(new IpAddress(new Ipv4Address("0.0.0.0")));
////				List<DnsServer> dnsserverlist = new ArrayList<DnsServer>();
////				DnsServerBuilder dnsserverbuilder = new DnsServerBuilder();
////				dnsserverbuilder.setAddress(new IpAddress(new Ipv4Address("8.8.8.8")));			
////				dnsserverlist.add(dnsserverbuilder.build());			
////				ipprofileparamsbuilder.setDnsServer(dnsserverlist);
////				IpProfileParams ipprofileparams_tmp = ipprofileparamsbuilder.build();
////				vld_tmp.setIpProfile(ipprofileparams_tmp);
//				
//				//vld_tmp.setVimNetworkName("OSMFIVE_selfservice01");
//				LinkedHashMap<String,String> tmp=new LinkedHashMap<>();
//				tmp.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSMFIVE_selfservice01");			
//				tmp.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSMFIVE_selfservice01");
//				vld_tmp.setVimNetworkName(tmp);
//				nsrequestpayload.getVld().add(vld_tmp);
//				
//				OSM10NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp2 = nsrequestpayload.new Vld();  
//				vld_tmp2.setName("cirros_3vnf_nsd_vld2");
//				//vld_tmp2.setVimNetworkName("OSM_mgmt_net");
//				LinkedHashMap<String,String> tmp2=new LinkedHashMap<>();
//				tmp2.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSM_mgmt_net");
//				tmp2.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSM_mgmt_net");			
//				vld_tmp2.setVimNetworkName(tmp2);
//				nsrequestpayload.getVld().add(vld_tmp2);
//			}
//			System.out.println("NS Instantiation payload : " + nsrequestpayload.toJSON());
//
//			
//			//String test_payload={"nsName":"test","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36","nsdId":"acc18b58-1b82-40e8-8c35-2bfcc8293cdf","vnf":[{"member-vnf-index":"1","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36", vdu:[ {id: mgmtVM, interface: [{name: "mgmtVM-eth0", floating-ip-required: true }]} ], vld: [ {name: mgmtnet, vim-network-name: "OSMFIVE_selfservice01"} ]},{"member-vnf-index":"2","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36"}]};
//			//String test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\"acc18b58-1b82-40e8-8c35-2bfcc8293cdf\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\", vdu:[ {id: mgmtVM, interface: [{name: \"mgmtVM-eth0\", floating-ip-required: true }]} ], vld: [ {name: mgmtnet, vim-network-name: \"OSMFIVE_selfservice01\"} ]},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}]}";
//			//String test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\"}";
//			//ResponseEntity<String> instantiate_ns_instance_entity = OSM10Client.instantiateNSInstance(nsd_instance_id, test_payload);
//			// Here we need the feedback
//			ResponseEntity<String> instantiate_ns_instance_entity = OSM10Client.instantiateNSInstance(nsd_instance_id, nsrequestpayload.toJSON());
//			if (instantiate_ns_instance_entity == null || instantiate_ns_instance_entity.getStatusCode().is4xxClientError() || instantiate_ns_instance_entity.getStatusCode().is5xxServerError()) {
//				System.out.println("NS Instantiation failed. Status Code:"
//						+ instantiate_ns_instance_entity.getStatusCode().toString() + ", Payload:"
//						+ ns_instance_creation_entity.getBody().toString());
//			} else {
//				// NS Instantiation starts
//				System.out.println("NS Instantiation of NS with id" + nsd_instance_id + " started.");
//				// Save the changes to DeploymentDescriptor
//			}
//		}
//		
//		
//	}
////	public OSM10Client() {	
////		// Properties file path.
////		String filePath = "osm4.properties.xml";
////		Properties prop = new Properties();
////		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath)) {
////			 
////			// Loading the properties.
////			prop.loadFromXML(inputStream);
//// 
////			// Getting properties
////			this.manoApiEndpoint = prop.getProperty("osm4.apiEndPoint");
////			this.manoUsername = prop.getProperty("osm4.username");
////			this.manoPassword = prop.getProperty("osm4.password");
////			this.manoProjectId = prop.getProperty("osm4.projectId");			
////		} catch (IOException ex) {
////			logger.error("Problem while reading properties file !");
////			ex.printStackTrace();
////		} 		
////		
////		OSM10ClientInit();
////	}
//	

}
