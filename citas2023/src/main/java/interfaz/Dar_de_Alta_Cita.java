package interfaz;

import java.time.LocalDate;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Asunto;
import basededatos.Bd_Principal;
import basededatos.Cliente;
import basededatos.iAdministrador;
import vistas.VistaDarDeAlta;

public class Dar_de_Alta_Cita extends VistaDarDeAlta {
	/*private event _dar_de_Alta;*/
	public Gestionar_Citas _gestionar_Citas;
	public Poner_Fecha _poner_Fecha = new Poner_Fecha();
	public Poner_Asunto _poner_Asunto = new Poner_Asunto();
	public Poner_Cliente _poner_Cliente = new Poner_Cliente();
	public Servidor_de_Correo _servidor_de_Correo = new Servidor_de_Correo();

	iAdministrador adm = new Bd_Principal();

	public void Enviar_Correo(String Correo, LocalDate Date, String Asunto) {
		_servidor_de_Correo.Enviar_Correo(Correo,Date,Asunto);
	}
	
	public Dar_de_Alta_Cita() {
		
		Poner_Fecha();
		Poner_Asunto();
		Poner_Cliente();
		_poner_Cliente.getSeleccionCliente().setItems(adm.Cargar_Clientes());
		_poner_Asunto.getSeleccionAsunto().setItems(adm.Cargar_Asuntos());

		this.getDarDeAta().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {			
				 Dar_de_Alta();
				 
				 _poner_Cliente.getSeleccionCliente().setItems(adm.Cargar_Clientes());
					_poner_Asunto.getSeleccionAsunto().setItems(adm.Cargar_Asuntos());
				
			}
		});	 
	}
	
	public void Poner_Fecha() {
		_poner_Fecha.getFechaCita().clear();
		this.getDatos_cita().as(VerticalLayout.class).add(_poner_Fecha);
	}

	public void Poner_Asunto() {
		this.getDatos_cita().as(VerticalLayout.class).add(_poner_Asunto);
	}

	public void Poner_Cliente() {
		this.getDatos_cita().as(VerticalLayout.class).add(_poner_Cliente);
	}

	public void Dar_de_Alta() {
		if (_poner_Cliente._cliente) {
			if (_poner_Asunto._asunto) {			
				adm.Crear_Cita_Asunto_Cliente_Nuevos(_poner_Fecha.getFechaCita().getValue(), _poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue(),
						_poner_Cliente._nuevo_Cliente.getNuevoCliente().getValue(), _poner_Cliente._nuevo_Cliente.getDireccion().getValue(),
						_poner_Cliente._nuevo_Cliente.getTelefono().getValue(), _poner_Cliente._nuevo_Cliente.getCorreo().getValue());
				 
				_poner_Asunto._asunto = false;
				_poner_Cliente._cliente = false;
				_poner_Asunto.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_poner_Asunto._nuevo_Asunto);
				 _poner_Cliente.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_poner_Cliente._nuevo_Cliente);
				 Enviar_Correo(_poner_Cliente._nuevo_Cliente.getCorreo().getValue(),_poner_Fecha.getFechaCita().getValue(),_poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue());

			} else {	
				if (_poner_Asunto.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
				else {
					if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
					else {
				Asunto asunto = _poner_Asunto.getSeleccionAsunto().getValue();
				adm.Crear_Cita_Nuevo_Cliente(_poner_Fecha.getFechaCita().getValue(), _poner_Cliente._nuevo_Cliente.getNuevoCliente().getValue(),
						_poner_Cliente._nuevo_Cliente.getDireccion().getValue(), _poner_Cliente._nuevo_Cliente.getTelefono().getValue(), asunto.getORMID(),_poner_Cliente._nuevo_Cliente.getCorreo().getValue());		
				_poner_Cliente._cliente = false;
				 _poner_Cliente.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_poner_Cliente._nuevo_Cliente);
				 Enviar_Correo(_poner_Cliente._nuevo_Cliente.getCorreo().getValue(),_poner_Fecha.getFechaCita().getValue(),_poner_Asunto.getSeleccionAsunto().getValue().getNombre());

				}
				}
			}
		} else {
			if (_poner_Asunto._asunto) {
				if (_poner_Cliente.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				
					else {
						if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Cliente cliente = _poner_Cliente.getSeleccionCliente().getValue();
				adm.Crear_Cita_Nuevo_Asunto(_poner_Fecha.getFechaCita().getValue(),_poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue(),
						cliente.getORMID());
				_poner_Asunto._asunto = false;
				_poner_Asunto.getVaadinVerticalLayout().as(VerticalLayout.class).remove(_poner_Asunto._nuevo_Asunto);
				 Enviar_Correo(_poner_Cliente._nuevo_Cliente.getCorreo().getValue(),_poner_Fecha.getFechaCita().getValue(),_poner_Asunto._nuevo_Asunto.getNuevoAsunto().getValue());

				}
					}
			} 
			else {
				if (_poner_Cliente.getSeleccionCliente().getValue()==null) {Notification.show("Por favor, selecciona un cliente");}
				else 
					if (_poner_Asunto.getSeleccionAsunto().getValue()==null) {Notification.show("Por favor, selecciona un asunto");}
					else 
						if (_poner_Fecha.getFechaCita().getValue()==null) {Notification.show("Por favor, selecciona una fecha");}
						else {
				Asunto asunto = _poner_Asunto.getSeleccionAsunto().getValue();
				Cliente cliente = _poner_Cliente.getSeleccionCliente().getValue();
				adm.Crear_Cita(_poner_Fecha.getFechaCita().getValue(), cliente.getORMID(), asunto.getORMID());
				 Enviar_Correo(_poner_Cliente._nuevo_Cliente.getCorreo().getValue(),_poner_Fecha.getFechaCita().getValue(),_poner_Asunto.getSeleccionAsunto().getValue().getNombre());
 
					}

			}
		}
		_poner_Fecha.getFechaCita().clear();
	}
}