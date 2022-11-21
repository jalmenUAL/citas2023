package basededatos;

import java.time.LocalDate;
import java.util.List;

public interface iAdministrador {

	void Crear_Cita(LocalDate fecha, int Cliente, int Asunto);
	
	void Baja_Cita(int ID);

	void Crear_Cita_Nuevo_Asunto(LocalDate fecha, String Asunto, int Cliente);

	void Crear_Cita_Nuevo_Cliente(LocalDate fecha, String Nombre, String Direccion, String Telefono, int Asunto, String Correo);

	void Crear_Cita_Asunto_Cliente_Nuevos(LocalDate localDate, String Asunto, String Nombre, String Direccion, String Telefono, String Correo);

	List Cargar_Citas_Realizadas();

	List Cargar_Citas_Activas();

	List Cargar_Clientes();

	List Cargar_Asuntos();

	 
	
}
