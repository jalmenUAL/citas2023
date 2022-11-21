package basededatos;

import java.time.LocalDate;
import java.util.List;

public interface iUsuario {

	void Cita_Realizada(int ID);

	void Cita_Pospuesta(int ID, LocalDate fecha);

	List Cargar_Citas_Activas();
}
