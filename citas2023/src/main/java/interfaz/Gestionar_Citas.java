package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	public Administrador _administrador;
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Ver_Citas_Realizadas _ver_Citas_Realizadas;

	public Gestionar_Citas() {
		
		Dar_de_Alta_Cita();
		Ver_Citas_Realizadas();
		
		_dar_de_Alta_Cita.getDarDeAta().addClickListener(new ComponentEventListener() {
			 
			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				_dar_de_Alta_Cita.Dar_de_Alta();
			}
		});
		
	}

	public void Ver_Citas_Realizadas() {
		this.getVaadinHorizontalLayout().add(_ver_Citas_Realizadas);
	}
	
	public void Dar_de_Alta_Cita() {
		this.getVaadinHorizontalLayout().add(_dar_de_Alta_Cita);
	}

	 

	 
}