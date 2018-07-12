package managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Empleado;
import util.JPAUtil;


@ManagedBean
@SessionScoped
public class EmpleadoManagedBean {
	
	private Empleado empleado = new Empleado();

	public String guardar(){
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		manager.persist(empleado);
		tx.commit();
		
		
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, 
				new FacesMessage("registro guardado",
						"empleado guardado correctamente"));
		
		empleado = new Empleado();
		
		return null;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
}
