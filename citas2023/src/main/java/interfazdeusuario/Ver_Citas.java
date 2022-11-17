package interfazdeusuario;

 
 
import java.util.List;
import java.util.Optional;
import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Activa;
import basededatos.Cita_Realizada;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaVercitas;
import vistas.VistaVercitasitem;

public class Ver_Citas extends VistaVercitas  {
	 
	public Vector<Ver_Citas_item> _item = new Vector<Ver_Citas_item>();
	iAdministrador adm = new Bd_Principal();	 
	 

	public Ver_Citas() {
		 
		 
	}

	 
	
	
	 
}