package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import bds.Bd_Principal;
import bds.iAdministrador;

public class Administrador extends Logeado {
	public iAdministrador _iAdministrador = new Bd_Principal();
	public Gestionar_Citas _gestionar_Citas = new Gestionar_Citas();

	public Administrador() {
		 
		 Gestionar_Citas();
	 }
	 
	 public void Gestionar_Citas() {
		 
		 this.getConenido().as(VerticalLayout.class).add(_gestionar_Citas);
		}
}