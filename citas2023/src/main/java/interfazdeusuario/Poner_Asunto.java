package interfazdeusuario;

import java.util.List;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Asunto;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaPonerAsunto;

public class Poner_Asunto extends VistaPonerAsunto {
	
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Nuevo_Asunto _nuevo_Asunto = new Nuevo_Asunto();
	
	
	
	Boolean _asunto = false;
	iAdministrador adm = new Bd_Principal();
	List<Asunto> as = adm.Cargar_Asuntos();
	 

	public Poner_Asunto() {
		Inicializar();
		this.getBotonNuevoAsunto().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				nuevoAsunto();
			}
		});
	}
		
		 
	

	void Inicializar() {
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_nuevo_Asunto);
		_nuevo_Asunto.setVisible(false);	 
		this.getSeleccionAsunto().setItems(as);
		this.getSeleccionAsunto().setItemLabelGenerator(Asunto::getNombre);
		
	}

	void nuevoAsunto() {
		_nuevo_Asunto.setVisible(true);
		_asunto = true;
	}

	 
}