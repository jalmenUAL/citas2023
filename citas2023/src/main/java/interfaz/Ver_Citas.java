package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Bd_Principal;
import basededatos.iAdministrador;
import basededatos.iUsuario;
import vistas.VistaVercitas;

public class Ver_Citas extends VistaVercitas {
	/*private event _dar_de_Baja;*/
	public Vector<Ver_Citas_item> _item = new Vector<Ver_Citas_item>();

	iAdministrador adm = new Bd_Principal();
	
	
	
	public void Dar_de_Baja() {
		
	
		Boolean baja = false;
		for (int i=0;i < this._item.size();i++)
        {
				Integer id = this._item.elementAt(i).cita.getID();
				if (this._item.elementAt(i).getSeleccionar().getValue().booleanValue())
							{ 
							adm.Baja_Cita(id);
							baja = true;
							}
        }
		if (baja) {
		Notification.show("Citas dadas de baja satisfactoriamente");}
		else Notification.show("No hay ninguna cita a la que dar de baja");
	}
}