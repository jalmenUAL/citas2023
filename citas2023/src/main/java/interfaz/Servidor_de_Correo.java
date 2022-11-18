package interfaz;

import com.vaadin.flow.component.notification.Notification;

import bds.iServidor_de_Correo;

public class Servidor_de_Correo {
	/*public iServidor_de_Correo _iServidor_de_Correo;*/

	public void Enviar_Correo() {
		Notification.show("El correo ha sido enviado");
	}
}