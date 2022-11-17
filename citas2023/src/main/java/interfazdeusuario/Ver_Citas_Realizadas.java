package interfazdeusuario;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Realizada;
import vistas.VistaVercitasitem;

public class Ver_Citas_Realizadas extends Ver_Citas {
	public Ver_Todas_las_Citas _ver_Todas_las_Citas;
	public Vector<Ver_Citas_Realizadas_item> _item = new Vector<Ver_Citas_Realizadas_item>();
	
	public void cargar_citas_realizadas() {
		 List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
			
			for (int i=0; i<cr.size();i++)
			{
				VistaVercitasitem vci = new VistaVercitasitem();
				vci.getCliente().setValue(cr.get(i).getCliente().getNombre());
				vci.getAsunto().setValue(cr.get(i).getEs_para().getNombre());
				vci.getDia().setValue(Integer.toString(cr.get(i).getFecha().getDia()));
				vci.getCliente().setValue(cr.get(i).getCliente().getNombre());
				this.getTabla().as(VerticalLayout.class).add(vci);
				
			}
	}
}