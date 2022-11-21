package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

import basededatos.iNo_Logeado;
import proyecto_citas.MainView;
import vistas.VistaNologeado;

public class No_Logeado extends VistaNologeado {
	public iNo_Logeado _iNo_Logeado;
	public Login _login = new Login();

	public No_Logeado() {
		Login();
	}

	public void Login() {

		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_login);
	}
}