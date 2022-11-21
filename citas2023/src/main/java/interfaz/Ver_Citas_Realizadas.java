package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Bd_Principal;
import basededatos.Cita_Realizada;
import basededatos.iAdministrador;
import interfaz.Ver_Citas_Realizadas_item;

public class Ver_Citas_Realizadas extends Ver_Citas {
	public Gestionar_Citas _gestionar_Citas;
	//public   Vector<Ver_Citas_Realizadas_item> _item = new Vector<Ver_Citas_Realizadas_item>();
	
	iAdministrador adm = new Bd_Principal();
	
	public Ver_Citas_Realizadas() {
		
		this.getTitulo().setText("Citas Realizadas");
		this.getDarPorRealizadaCita().setVisible(false);
		this.getPosponerCita().setVisible(false);
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		cargar_citas_realizadas();
		
		this.getDarBaja().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Dar_de_Baja();
				cargar_citas_realizadas();
			}
		});
	}
	
	public void cargar_citas_realizadas() {
		 List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
		 this.getTabla().as(VerticalLayout.class).removeAll();
		 _item.clear();
			for (int i=0; i<cr.size();i++)
			{
				Ver_Citas_Realizadas_item vci = new Ver_Citas_Realizadas_item(cr.get(i));
				vci.getCliente().setValue(cr.get(i).getCliente().getNombre());
				vci.getAsunto().setValue(cr.get(i).getEs_para().getNombre());
				vci.getCorreo().setValue(cr.get(i).getCliente().getCorreo());
				vci.getDia().setValue(Integer.toString(cr.get(i).getFecha().getDia()));
				vci.getMes().setValue(Integer.toString(cr.get(i).getFecha().getMes()));
				vci.getAno().setValue(Integer.toString(cr.get(i).getFecha().getAnyo()));
				this.getTabla().as(VerticalLayout.class).add(vci);
				_item.add(vci);
				
			}
	}
	
	 
}