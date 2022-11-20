package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Bd_Principal;
import basededatos.iLogeado;
import vistas.VistaLogeado;

public class Logeado extends VistaLogeado {
	public iLogeado _iLogeado = new Bd_Principal();
	
	public Logeado() {
		this.getLogout().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Logout();
			}});
	}
	
	public void Logout() {
		this.getConenido().as(VerticalLayout.class).removeAll();		
	}
}