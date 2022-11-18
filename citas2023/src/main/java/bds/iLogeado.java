package bds;

import java.time.LocalDate;

public interface iLogeado {

	void Cita_Realizada(int ID);

	void Cita_Pospuesta(int ID, LocalDate fecha);

	 
}
