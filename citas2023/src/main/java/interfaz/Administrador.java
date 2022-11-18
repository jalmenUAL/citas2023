package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.iAdministrador;

public class Administrador extends Logeado {
	public iAdministrador _iAdministrador;
	public Gestionar_Citas _gestionar_Citas;

	public Administrador() {
		 
		 Gestionar_Citas();
	 }
	 
	 public void Gestionar_Citas() {
		 this.getConenido().as(VerticalLayout.class).removeAll();
		 this.getConenido().as(VerticalLayout.class).add(_gestionar_Citas);
		}
}