package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.iUsuario;
import vistas.VistaUsuario;

public class Usuario extends VistaUsuario {
	
	public iUsuario _iusuario;
	public Actualizar_Citas _actualizar_Citas = new Actualizar_Citas();
	public Usuario() {
		 Actualizar_Citas();
		 
	 }

	public void Actualizar_Citas() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_actualizar_Citas);
	}

	 
	
}
