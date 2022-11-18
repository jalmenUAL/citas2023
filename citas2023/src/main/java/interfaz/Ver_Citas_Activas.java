package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Activa;
import interfazdeusuario.Ver_Citas_Activas_item;

public class Ver_Citas_Activas extends Ver_Citas {
	/*private event _posponer_Cita;
	private event _dar_por_realizada_Cita;*/
	public Usuario _usuario;
	public Vector<Ver_Citas_Activas_item> _item = new Vector<Ver_Citas_Activas_item>();
	
	Ver_Citas_Activas_item vci;

	public void Posponer_Cita() {
		throw new UnsupportedOperationException();
	}

	public void Dar_por_realizada_Cita() {
		throw new UnsupportedOperationException();
	}
	
	public void cargar_citas_activas() {
		
		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		
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
}