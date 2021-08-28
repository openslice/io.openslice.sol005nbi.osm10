package OSM10NBIClient;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//{"username":"ioannis","password":"123","projects":["admin","test"],"project_role_mappings":[{"project":"admin","role":"system_admin"},{"project":"test","role":"system_admin"}],"add_project_role_mappings":[{"project":"admin","role":"system_admin"},{"project":"test","role":"system_admin"}],"remove_project_role_mappings":[{"project":"admin","role":"system_admin"},{"project":"test","role":"system_admin"}]}
public class UserEditRequestPayload {

	private String username;
	private String password;
	private List<String> projects;
	private List<ProjectRoleMapping> project_role_mappings = null; 
	private List<ProjectRoleMapping> add_project_role_mappings = null; 
	private List<ProjectRoleMapping> remove_project_role_mappings = null; 
	
	
	public List<ProjectRoleMapping> getAdd_project_role_mappings() {
		return add_project_role_mappings;
	}

	public void setAdd_project_role_mappings(List<ProjectRoleMapping> add_project_role_mappings) {
		this.add_project_role_mappings = add_project_role_mappings;
	}

	public List<ProjectRoleMapping> getRemove_project_role_mappings() {
		return remove_project_role_mappings;
	}

	public void setRemove_project_role_mappings(List<ProjectRoleMapping> remove_project_role_mappings) {
		this.remove_project_role_mappings = remove_project_role_mappings;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ProjectRoleMapping> getProject_role_mappings() {
		return project_role_mappings;
	}

	public void setProject_role_mappings(List<ProjectRoleMapping> project_role_mappings) {
		this.project_role_mappings = project_role_mappings;
	}
		
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
