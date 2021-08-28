package OSM10NBIClient;

public class ProjectRoleMapping {
	private String project;
	private String role;

	public ProjectRoleMapping(String project, String role) {
		// TODO Auto-generated constructor stub
		this.project=project;
		this.role=role;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
