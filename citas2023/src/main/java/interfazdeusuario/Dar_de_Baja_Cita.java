package interfazdeusuario;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Cita_Activa;
import bds.Bd_Principal;
import bds.iAdministrador;
 

 

public class Dar_de_Baja_Cita extends Ver_Todas_las_Citas {
	
	/* CODE GENERATION private event _dar_de_Baja;*/
	iAdministrador adm = new Bd_Principal();
	public Gestionar_Citas _gestionar_Citas;

	public Dar_de_Baja_Cita() {
		 
		Inicializar();
		this.getDarBaja().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				Dar_de_Baja();
				
			}
		});
		
		
	}

	public void Inicializar() {
		super.Inicializar();
		this.getPosponerCita().setVisible(false);
		this.getDarPorRealizadaCita().setVisible(false);
		this.getCambiarFecha().setVisible(false);
		this.getNuevaFecha().setVisible(false);
		this.getDarBaja().setVisible(true);
		
	}

	void Dar_de_Baja() {
		 
		for (int i=0;i < this._ver_Citas_Activas._item.size();i++)
        {
				Integer id = this._ver_Citas_Activas._item.elementAt(i).cita.getID();

				adm.Baja_Cita_Activa(id);
        }

		 
	}

	 
}