package interfaz;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Bd_Principal;
import basededatos.Cliente;
import basededatos.iAdministrador;
import vistas.VistaPonerCliente;

public class Poner_Cliente extends VistaPonerCliente {
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Nuevo_Cliente _nuevo_Cliente = new Nuevo_Cliente();
	
	Boolean _cliente = false;
	iAdministrador adm = new Bd_Principal();
	List<Cliente> cl = adm.Cargar_Clientes();

	public Poner_Cliente() { 
		this.getSeleccionCliente().setItems(cl);
		this.getSeleccionCliente().setItemLabelGenerator(Cliente::getNombre);
		this.getBotonNuevoCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Nuevo_Cliente();
			}
		});
	}
	public void Nuevo_Cliente() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_nuevo_Cliente);
		_cliente = true;
	}

	 

	 
}