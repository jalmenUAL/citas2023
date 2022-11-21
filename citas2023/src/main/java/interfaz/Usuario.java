package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import basededatos.iUsuario;

public class Usuario extends Logeado {
	/* public iUsuario _iUsuario; */
	public Ver_Citas_Activas _ver_Citas_Activas = new Ver_Citas_Activas();

	public Usuario() {
		Ver_Citas_Activas();
	}

	public void Ver_Citas_Activas() {
		this.getConenido().as(VerticalLayout.class).add(_ver_Citas_Activas);
	}

}