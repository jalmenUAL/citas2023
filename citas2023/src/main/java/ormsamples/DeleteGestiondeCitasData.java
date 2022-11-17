/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteGestiondeCitasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cita lbasededatosCita = basededatos.CitaDAO.loadCitaByQuery(null, null);
			// Delete the persistent object
			basededatos.CitaDAO.delete(lbasededatosCita);
			basededatos.Cita_Activa lbasededatosCita_Activa = basededatos.Cita_ActivaDAO.loadCita_ActivaByQuery(null, null);
			// Delete the persistent object
			basededatos.Cita_ActivaDAO.delete(lbasededatosCita_Activa);
			basededatos.Cita_Realizada lbasededatosCita_Realizada = basededatos.Cita_RealizadaDAO.loadCita_RealizadaByQuery(null, null);
			// Delete the persistent object
			basededatos.Cita_RealizadaDAO.delete(lbasededatosCita_Realizada);
			basededatos.Asunto lbasededatosAsunto = basededatos.AsuntoDAO.loadAsuntoByQuery(null, null);
			// Delete the persistent object
			basededatos.AsuntoDAO.delete(lbasededatosAsunto);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			basededatos.ClienteDAO.delete(lbasededatosCliente);
			basededatos.Fecha lbasededatosFecha = basededatos.FechaDAO.loadFechaByQuery(null, null);
			// Delete the persistent object
			basededatos.FechaDAO.delete(lbasededatosFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGestiondeCitasData deleteGestiondeCitasData = new DeleteGestiondeCitasData();
			try {
				deleteGestiondeCitasData.deleteTestData();
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
