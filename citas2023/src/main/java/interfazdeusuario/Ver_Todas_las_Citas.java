package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVertodaslascitas;

public class Ver_Todas_las_Citas extends VistaVertodaslascitas {
	public Gestionar_Citas _gestionar_Citas;
	public Ver_Citas_Activas _ver_Citas_Activas = new Ver_Citas_Activas();
	public Ver_Citas_Realizadas _ver_Citas_Realizadas = new Ver_Citas_Realizadas();
	
	public Ver_Todas_las_Citas(){
		Inicializar();
	}

	public void Inicializar() {
		_ver_Citas_Activas.cargar_citas_activas();
		_ver_Citas_Realizadas.cargar_citas_realizadas();
		Ver_Citas_Activas();
		Ver_Citas_Realizadas();
	}
	
	public void Ver_Citas_Activas() {
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_Citas_Activas);
	}

	public void Ver_Citas_Realizadas() {
		
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_ver_Citas_Realizadas);
	}
}