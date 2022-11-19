package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaVercitasitem;

public class Ver_Citas_item extends VistaVercitasitem {
	/*private event _seleccionar;*/
	public Ver_Citas _ver_Citas;
	public Ver_Informacion_Cliente _ver_Informacion_Cliente = new Ver_Informacion_Cliente();

	 
	Cita cita;	
	public Ver_Citas_item(Cita c){
		cita = c;		
		this.getVerInformacion().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				Ver_Informacion_Cliente();
				mostrar_informacion();			
			}});
	}
	
	public void mostrar_informacion() {
		Dialog dialog = new Dialog();
		dialog.add(_ver_Informacion_Cliente);
		Button OkButton = new Button("Cerrar", e -> {dialog.close();});
		dialog.add(OkButton);
		dialog.open();
		 
	}
	
	public void Ver_Informacion_Cliente() {
		_ver_Informacion_Cliente.getNombre().setValue(cita.getCliente().getNombre());
		_ver_Informacion_Cliente.getDireccion().setValue(cita.getCliente().getDireccion());
		_ver_Informacion_Cliente.getTelefono().setValue(cita.getCliente().getTelefono());	
	}
	
	public void Seleccionar() {	 
	}
}