package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.Bd_Principal;
import bds.iLogeado;
import vistas.VistaLogeado;

public class Logeado extends VistaLogeado {
	public iLogeado _iLogeado = new Bd_Principal();
	 

	public void Logout() {
		this.getConenido().as(VerticalLayout.class).removeAll();
		
	}
}