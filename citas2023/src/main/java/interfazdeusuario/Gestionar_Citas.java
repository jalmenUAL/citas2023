package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;

import vistas.VistaGestionarCitas;

public class Gestionar_Citas extends VistaGestionarCitas {
	
	 
	public Administrador _administrador;
	public Dar_de_Alta_Cita _dar_de_Alta_Cita = new Dar_de_Alta_Cita();
	public Ver_Todas_las_Citas _ver_Todas_las_Citas = new Ver_Todas_las_Citas();
	public Dar_de_Baja_Cita _dar_de_Baja_Cita = new Dar_de_Baja_Cita();
	

	public Gestionar_Citas() {
		
		Inicializar();
		
		_dar_de_Alta_Cita.getDarDeAta().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				_dar_de_Alta_Cita.Dar_de_Alta();
			}
		});
		 
		_dar_de_Baja_Cita.getDarBaja().addClickListener(new ComponentEventListener() {
			 

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				_dar_de_Baja_Cita.Dar_de_Baja();
			}
		});
		
	}

	void Inicializar() {
		Dar_de_Alta_Cita();
		Ver_Todas_las_Citas();
		Dar_de_Baja_Cita();
	}

	public void Dar_de_Alta_Cita() {
		this.getVaadinHorizontalLayout().add(_dar_de_Alta_Cita);
	}

	public void Ver_Todas_las_Citas() {
		this.getVaadinHorizontalLayout().add(_ver_Todas_las_Citas);
	}

	public void Dar_de_Baja_Cita() {
		this.getVaadinHorizontalLayout().add(_dar_de_Baja_Cita);
	}
}