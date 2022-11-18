package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	public Administrador _administrador;
	public Dar_de_Alta_Cita _dar_de_Alta_Cita;
	public Ver_Citas_Realizadas _ver_Citas_Realizadas;

	 

	public void Ver_Citas_Realizadas() {
		throw new UnsupportedOperationException();
	}
	
public Gestionar_Citas() {
		
		Inicializar();
		
		_dar_de_Alta_Cita.getDarDeAta().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				_dar_de_Alta_Cita.Dar_de_Alta();
			}
		});
		 
		_dar_de_Baja_Cita_Realizada.getDarBaja().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				_dar_de_Baja_Cita_Realizada.Dar_de_Baja();
			}
		});
		
	}

	void Inicializar() {
		this.getElement().setProperty("width", "100%");
		 
		Dar_de_Alta_Cita();
		Dar_de_Baja_Cita_Realizada();
	}

	public void Dar_de_Alta_Cita() {
		this.getVaadinHorizontalLayout().add(_dar_de_Alta_Cita);
	}

	 

	public void Dar_de_Baja_Cita_Realizada() {
		this.getVaadinHorizontalLayout().add(_dar_de_Baja_Cita_Realizada);
	}
}