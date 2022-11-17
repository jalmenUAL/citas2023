package interfazdeusuario;

import java.util.Optional;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Cita_Activa;
import bds.Bd_Principal;
import bds.iUsuario;

public class Actualizar_Citas extends Ver_Citas_Activas {
	 
	/*CODE GENERATION
	private event _dar_por_realizada_Cita;
	private event _posponer_Cita;
	public usuario _usuario;*/
	
	iUsuario usu = new Bd_Principal();
	
	public Actualizar_Citas() {
		
				
		Inicializar();

		this.getDarPorRealizadaCita().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Dar_por_realizada_Cita();
				
			}
		});

		this.getPosponerCita().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				PosponerCita();
				
			}
		});

		this.getCambiarFecha().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				cambiarFecha();
				
			}
		});
		
	}

	/*NEW*/
	public void Inicializar() {
		 
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		this.getDarBaja().setVisible(false);
		this.getPosponerCita().setVisible(true);
		this.getDarPorRealizadaCita().setVisible(true);
	}

	void  Dar_por_realizada_Cita() {

		        for (int i=0;i < this._item.size();i++)
		        {
		        Integer id;
				id = this._item.elementAt(i).cita.getID();
				usu.Cita_Realizada(id);
		        }
				Inicializar();
		 
	};

	void PosponerCita() {
			this.getCambiarFecha().setVisible(true);
			this.getNuevaFecha().setVisible(true); 
	}

	/*NEW*/
	void cambiarFecha() {

		
		for (int i=0;i < this._item.size();i++)
        {
		Integer id;
		id = this._item.elementAt(i).cita.getID();
		usu.Cita_Pospuesta(id, this.getNuevaFecha().getValue());
        }
			
			Inicializar();
			this.getCambiarFecha().setVisible(false);
			this.getNuevaFecha().setVisible(false);
		 
	}

}