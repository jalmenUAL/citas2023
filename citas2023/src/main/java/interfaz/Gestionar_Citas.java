package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	public Administrador _administrador;
	public Dar_de_Alta_Cita _dar_de_Alta_Cita = new Dar_de_Alta_Cita();
	public Ver_Citas_Realizadas _ver_Citas_Realizadas = new Ver_Citas_Realizadas();

	public Gestionar_Citas() {
		
		this.getBotondardeAltaCita().addClickListener(new ComponentEventListener() {
			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Dar_de_Alta_Cita();
			}
		});
		this.getBotonVerCitasRealizadas().addClickListener(new ComponentEventListener() {
			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Ver_Citas_Realizadas();
			}
		});
		
	}

	public void Ver_Citas_Realizadas() {
		//_ver_Citas_Realizadas.getVaadinVerticalLayout().setProperty("width","100%");
		this.getVentana().as(VerticalLayout.class).removeAll();
		this.getVentana().as(VerticalLayout.class).add(_ver_Citas_Realizadas);
	}
	
	public void Dar_de_Alta_Cita() {
		//_dar_de_Alta_Cita.getVaadinVerticalLayout().setProperty("width","100%");
		this.getVentana().as(VerticalLayout.class).removeAll();
		this.getVentana().as(VerticalLayout.class).add(_dar_de_Alta_Cita);
	}

	 

	 
}