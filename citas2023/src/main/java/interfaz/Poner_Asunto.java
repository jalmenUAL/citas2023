package interfaz;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Asunto;
import basededatos.Bd_Principal;
import basededatos.Cliente;
import basededatos.iAdministrador;
import vistas.VistaPonerAsunto;

public class Poner_Asunto extends VistaPonerAsunto {
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Nuevo_Asunto _nuevo_Asunto = new Nuevo_Asunto();

	Boolean _asunto = false;
	iAdministrador adm = new Bd_Principal();
	List<Asunto> as = adm.Cargar_Asuntos();

	public Poner_Asunto() {

		this.getSeleccionAsunto().setItems(as);
		this.getSeleccionAsunto().setItemLabelGenerator(Asunto::getNombre);
		this.getBotonNuevoAsunto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Nuevo_Asunto();
			}
		});
	}

	public void Nuevo_Asunto() {
		_nuevo_Asunto.getNuevoAsunto().clear();
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_nuevo_Asunto);
		_asunto = true;
	}
}