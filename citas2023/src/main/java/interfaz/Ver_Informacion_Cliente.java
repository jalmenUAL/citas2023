package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaVerInformacionCliente;

public class Ver_Informacion_Cliente extends VistaVerInformacionCliente {
	public Ver_Citas_item _ver_Citas;
	
	public Ver_Informacion_Cliente() {
		 
		this.getVaadinButton().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				 cerrar();
				  
			}
		});
		
	}

	 

	void cerrar() {
		setVisible(false);
	}
}