package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaPonerAsunto;

public class Poner_Asunto extends VistaPonerAsunto {
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Nuevo_Asunto _nuevo_Asunto;

	public void Nuevo_Asunto() {
		throw new UnsupportedOperationException();
	}
	
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
}