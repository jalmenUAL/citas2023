package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Activa;
import bds.Bd_Principal;
import bds.iAdministrador;
import bds.iUsuario;
import interfazdeusuario.Ver_Citas_Activas_item;

public class Ver_Citas_Activas extends Ver_Citas {
	/*private event _posponer_Cita;
	private event _dar_por_realizada_Cita;*/
	public Usuario _usuario;
	public Vector<Ver_Citas_Activas_item> _item = new Vector<Ver_Citas_Activas_item>();
	
	Ver_Citas_Activas_item vci;
	iAdministrador adm = new Bd_Principal();
	iUsuario usu = new Bd_Principal(); /* RARO*/
	
	public Ver_Citas_Activas() {
		 
		cargar_citas_activas();
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		this.getDarPorRealizadaCita().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Dar_por_realizada_Cita();				
			}
		});
		this.getPosponerCita().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Posponer_Cita();				
			}
		});

		this.getCambiarFecha().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				cambiarFecha();			
			}
		});
		
	}
	
	public void Posponer_Cita() {
		this.getCambiarFecha().setVisible(true);
		this.getNuevaFecha().setVisible(true);
	}

	public void Dar_por_realizada_Cita() {
		for (int i=0;i < this._item.size();i++)
        {
			if (this._item.elementAt(i).getSeleccionar().getValue().booleanValue())
				{	Integer id;
					id = this._item.elementAt(i).cita.getID();
					usu.Cita_Realizada(id);
				}
        }
		cargar_citas_activas();
	}
	
	public void cargar_citas_activas() {
		
		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		this.getTabla().as(VerticalLayout.class).removeAll();
		_item.clear();
		
		for (int i=0; i<ca.size();i++)
		{
			vci = new Ver_Citas_Activas_item(ca.get(i));
			vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
			vci.getAsunto().setValue(ca.get(i).getEs_para().getNombre());
			vci.getDia().setValue(Integer.toString(ca.get(i).getFecha().getDia()));
			vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
			this.getTabla().as(VerticalLayout.class).add(vci);
			_item.add(vci);
		}
	}
	void cambiarFecha() {
	
		for (int i=0;i < this._item.size();i++)
        {
		if (this._item.elementAt(i).getSeleccionar().getValue().booleanValue()) 
				{
					Integer id;
					id = this._item.elementAt(i).cita.getID();
					usu.Cita_Pospuesta(id, this.getNuevaFecha().getValue());
				}
        }	
		 cargar_citas_activas();
	     this.getCambiarFecha().setVisible(false);
		 this.getNuevaFecha().setVisible(false);
		 
	}
}