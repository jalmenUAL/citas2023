package interfazdeusuario;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cita_Activa;
import vistas.VistaVercitasitem;

public class Ver_Citas_Activas extends Ver_Citas {
	public Ver_Todas_las_Citas _ver_Todas_las_Citas;
	public Vector<Ver_Citas_Activas_item> _item = new Vector<Ver_Citas_Activas_item>();
	
public void cargar_citas_activas() {
	
	List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
	
	for (int i=0; i<ca.size();i++)
	{
		Ver_Citas_Activas_item vci = new Ver_Citas_Activas_item(ca.get(i));
		vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
		vci.getAsunto().setValue(ca.get(i).getEs_para().getNombre());
		vci.getDia().setValue(Integer.toString(ca.get(i).getFecha().getDia()));
		vci.getCliente().setValue(ca.get(i).getCliente().getNombre());
		this.getTabla().as(VerticalLayout.class).add(vci);
		_item.add(vci);
	}
}
}