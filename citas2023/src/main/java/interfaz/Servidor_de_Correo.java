package interfaz;

import java.time.LocalDate;

import com.vaadin.flow.component.notification.Notification;

public class Servidor_de_Correo {
	/* public iServidor_de_Correo _iServidor_de_Correo; */

	public void Enviar_Correo(String correo, LocalDate fecha, String Asunto) {
		Notification.show("El correo ha sido enviado a :" + correo + " fecha: " + fecha + " Asunto: " + Asunto);
	}
}