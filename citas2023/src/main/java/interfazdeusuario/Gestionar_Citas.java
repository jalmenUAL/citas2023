package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	
	 
	public Administrador _administrador;
	public Dar_de_Alta_Cita _dar_de_Alta_Cita = new Dar_de_Alta_Cita();
	 
	public Dar_de_Baja_Cita_Realizada _dar_de_Baja_Cita_Realizada = new Dar_de_Baja_Cita_Realizada();
	

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