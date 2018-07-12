package managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class User {
	
	private String name;
	private String password;
	
//	public User(){
//		EntityManager m = JPAUtil.getEntityManager();
//	}
	
	public String login(){
		// logica de validacion
		// ....
		
		return "welcome";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
