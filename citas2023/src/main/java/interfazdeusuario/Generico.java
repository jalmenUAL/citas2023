package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.iGenerico;
import vistas.VistaGenerico;

public class Generico  extends VistaGenerico {

	public iGenerico _iGenerico;
	public Login _login = new Login();
	
	
	
	
	public Generico() {
		
		Inicializar();
		  
	}
	
	public void Inicializar() {
		Login();
	}
	
	public void Login() {
	
		 this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_login);
	}
	
	
}