package OSM10NBIClient;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//{"name":"test4","quotas":{"vnfds":1,"nsds":0,"slice_templates":0,"pduds":0,"ns_instances":0,"slice_instances":0,"vim_accounts":0,"wim_accounts":0,"sdn_controllers":0,"k8sclusters":0,"k8srepos":0,"osmrepos":1}}
public class ProjectCreateRequestPayload {

	String name;
	Boolean admin;
	String domain_name;
	List<Map<String, Integer>> quotas;
	
	public List<Map<String, Integer>> getQuotas() {
		return quotas;
	}

	public void setQuotas(List<Map<String, Integer>> quotas) {
		this.quotas = quotas;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDomain_name() {
		return domain_name;
	}
	
	public void setDomain_name(String domain_name) {
		this.domain_name = domain_name;
	}

	public String toJSON()
	{
		String jsonInString=null;
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return jsonInString;
	}
	
	
}
