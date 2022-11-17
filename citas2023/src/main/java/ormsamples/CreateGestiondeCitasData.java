/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateGestiondeCitasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cita lbasededatosCita = basededatos.CitaDAO.createCita();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fecha, es_para
			basededatos.CitaDAO.save(lbasededatosCita);
			basededatos.Cita_Activa lbasededatosCita_Activa = basededatos.Cita_ActivaDAO.createCita_Activa();
			// Initialize the properties of the persistent object here
			basededatos.Cita_ActivaDAO.save(lbasededatosCita_Activa);
			basededatos.Cita_Realizada lbasededatosCita_Realizada = basededatos.Cita_RealizadaDAO.createCita_Realizada();
			// Initialize the properties of the persistent object here
			basededatos.Cita_RealizadaDAO.save(lbasededatosCita_Realizada);
			basededatos.Asunto lbasededatosAsunto = basededatos.AsuntoDAO.createAsunto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : de_la_cita
			basededatos.AsuntoDAO.save(lbasededatosAsunto);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fechas
			basededatos.ClienteDAO.save(lbasededatosCliente);
			basededatos.Fecha lbasededatosFecha = basededatos.FechaDAO.createFecha();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, cita, anyo, mes, dia
			basededatos.FechaDAO.save(lbasededatosFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGestiondeCitasData createGestiondeCitasData = new CreateGestiondeCitasData();
			try {
				createGestiondeCitasData.createTestData();
			}
			finally {
				basededatos.GestiondeCitasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
