package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import bds.iNo_Logeado;

public class No_Logeado extends VistaNoLogeado {
	public iNo_Logeado _iNo_Logeado;
	public Login _login;

	 
	
	public void Login() {
		
		 this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_login);
	}
}