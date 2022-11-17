package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.iAdministrador;
import vistas.VistaAdministrador;

public class Administrador extends VistaAdministrador {
	 
	public iAdministrador _iAdministrador;
	public Gestionar_Citas _gestionar_Citas = new Gestionar_Citas();

	 public Administrador() {
		 
		 Gestionar_Citas();
	 }
	 
	 public void Gestionar_Citas() {
		 this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_gestionar_Citas);
		}
	 
}