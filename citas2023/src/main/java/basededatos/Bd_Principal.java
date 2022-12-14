package basededatos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import org.orm.PersistentException;

public class Bd_Principal implements iAdministrador, iUsuario, iNo_Logeado, iLogeado,  Serializable {

	Bd_Citas citas = new Bd_Citas();
	Bd_Asuntos asuntos = new Bd_Asuntos();
	Bd_Clientes clientes = new Bd_Clientes();

	 

	 

	public void Crear_Cita(LocalDate fecha, int Cliente, int Asunto) {
		try {
			citas.Crear_Cita(fecha, Cliente, Asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Baja_Cita(int ID) {
		try {
			citas.Baja_Cita(ID);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 

	 

	public void Crear_Cita_Nuevo_Asunto(LocalDate fecha, String Asunto, int Cliente) {

		try {
			int Id_asunto = asuntos.Crear_Asunto(Asunto);
			citas.Crear_Cita(fecha, Cliente, Id_asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Crear_Cita_Nuevo_Cliente(LocalDate fecha, String Nombre, String Direccion, String Telefono, int Asunto, String Correo) {

		try {
			int Id_cliente = clientes.Nuevo_Cliente(Nombre, Direccion, Telefono, Correo);
			citas.Crear_Cita(fecha, Id_cliente, Asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Crear_Cita_Asunto_Cliente_Nuevos(LocalDate fecha, String Asunto, String Nombre, String Direccion,
			String Telefono, String Correo) {
		int Id_asunto;
		try {
			Id_asunto = asuntos.Crear_Asunto(Asunto);
			int Id_cliente = clientes.Nuevo_Cliente(Nombre, Direccion, Telefono, Correo);
			citas.Crear_Cita(fecha, Id_cliente, Id_asunto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List Cargar_Clientes() {
		List cls = null;
		try {
			cls = this.clientes.Cargar_Clientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cls;
	}

	public List Cargar_Asuntos() {
		List asuntos = null;
		try {
			asuntos = this.asuntos.Cargar_Asuntos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return asuntos;
	}

	public void Cita_Realizada(int ID) {
		try {
			citas.Cita_Realizada(ID);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Cita_Pospuesta(int ID, LocalDate fecha) {
		try {
			citas.Cita_Pospuesta(ID, fecha);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 
	public List Cargar_Citas_Activas() {
		List citas_activas = null;
		try {
			citas_activas = citas.Cargar_Citas_Activas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citas_activas;
	}

	public List Cargar_Citas_Realizadas() {
		List citas_realizadas = null;
		try {
			citas_realizadas = citas.Cargar_Citas_Realizadas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citas_realizadas;
	}



	 

	 
}
