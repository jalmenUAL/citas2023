package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cliente;
import vistas.VistaPonerCliente;

public class Poner_Cliente extends VistaPonerCliente {
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Nuevo_Cliente _nuevo_Cliente;

	public void Nuevo_Cliente() {
		throw new UnsupportedOperationException();
	}
	
	public Poner_Cliente() { 
		Inicializar();
		this.getBotonNuevoCliente().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoCliente();
			}
		});
	}

	void Inicializar() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_nuevo_Cliente);
		_nuevo_Cliente.setVisible(false);
		this.getSeleccionCliente().setItems(cl);
		this.getSeleccionCliente().setItemLabelGenerator(Cliente::getNombre);
	}

	void nuevoCliente() {
		_nuevo_Cliente.setVisible(false);
		_cliente = true;
	}
}