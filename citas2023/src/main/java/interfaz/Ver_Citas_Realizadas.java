package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Realizada;
import bds.Bd_Principal;
import bds.iAdministrador;
import interfazdeusuario.Ver_Citas_Realizadas_item;

public class Ver_Citas_Realizadas extends Ver_Citas {
	public Gestionar_Citas _gestionar_Citas;
	public Vector<Ver_Citas_Realizadas_item> _item = new Vector<Ver_Citas_Realizadas_item>();
	
	iAdministrador adm = new Bd_Principal();
	
	public Ver_Citas_Realizadas() {
		this.getDarPorRealizadaCita().setVisible(false);
		this.getPosponerCita().setVisible(false);
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		cargar_citas_realizadas();
	}
	
	public void cargar_citas_realizadas() {
		 List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
			
			for (int i=0; i<cr.size();i++)
			{
				Ver_Citas_Realizadas_item vci = new Ver_Citas_Realizadas_item(cr.get(i));
				vci.getCliente().setValue(cr.get(i).getCliente().getNombre());
				vci.getAsunto().setValue(cr.get(i).getEs_para().getNombre());
				vci.getDia().setValue(Integer.toString(cr.get(i).getFecha().getDia()));
				vci.getCliente().setValue(cr.get(i).getCliente().getNombre());
				this.getTabla().as(VerticalLayout.class).add(vci);
				_item.add(vci);
				
			}
	}
}