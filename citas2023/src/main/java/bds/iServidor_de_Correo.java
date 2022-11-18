package bds;

import java.time.LocalDate;

public interface iServidor_de_Correo {

	void Cita_Realizada(int ID);

	void Cita_Pospuesta(int ID, LocalDate fecha);

	 
}
