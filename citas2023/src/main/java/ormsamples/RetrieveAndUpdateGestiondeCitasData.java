/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGestiondeCitasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cita lbasededatosCita = basededatos.CitaDAO.loadCitaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CitaDAO.save(lbasededatosCita);
			basededatos.Cita_Activa lbasededatosCita_Activa = basededatos.Cita_ActivaDAO.loadCita_ActivaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Cita_ActivaDAO.save(lbasededatosCita_Activa);
			basededatos.Cita_Realizada lbasededatosCita_Realizada = basededatos.Cita_RealizadaDAO.loadCita_RealizadaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Cita_RealizadaDAO.save(lbasededatosCita_Realizada);
			basededatos.Asunto lbasededatosAsunto = basededatos.AsuntoDAO.loadAsuntoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AsuntoDAO.save(lbasededatosAsunto);
			basededatos.Cliente lbasededatosCliente = basededatos.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ClienteDAO.save(lbasededatosCliente);
			basededatos.Fecha lbasededatosFecha = basededatos.FechaDAO.loadFechaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.FechaDAO.save(lbasededatosFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cita by CitaCriteria");
		basededatos.CitaCriteria lbasededatosCitaCriteria = new basededatos.CitaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCitaCriteria.ID.eq();
		System.out.println(lbasededatosCitaCriteria.uniqueCita());
		
		System.out.println("Retrieving Cita_Activa by Cita_ActivaCriteria");
		basededatos.Cita_ActivaCriteria lbasededatosCita_ActivaCriteria = new basededatos.Cita_ActivaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCita_ActivaCriteria.ID.eq();
		System.out.println(lbasededatosCita_ActivaCriteria.uniqueCita_Activa());
		
		System.out.println("Retrieving Cita_Realizada by Cita_RealizadaCriteria");
		basededatos.Cita_RealizadaCriteria lbasededatosCita_RealizadaCriteria = new basededatos.Cita_RealizadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCita_RealizadaCriteria.ID.eq();
		System.out.println(lbasededatosCita_RealizadaCriteria.uniqueCita_Realizada());
		
		System.out.println("Retrieving Asunto by AsuntoCriteria");
		basededatos.AsuntoCriteria lbasededatosAsuntoCriteria = new basededatos.AsuntoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAsuntoCriteria.ID.eq();
		System.out.println(lbasededatosAsuntoCriteria.uniqueAsunto());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		basededatos.ClienteCriteria lbasededatosClienteCriteria = new basededatos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosClienteCriteria.ID.eq();
		System.out.println(lbasededatosClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Fecha by FechaCriteria");
		basededatos.FechaCriteria lbasededatosFechaCriteria = new basededatos.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosFechaCriteria.ID.eq();
		System.out.println(lbasededatosFechaCriteria.uniqueFecha());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGestiondeCitasData retrieveAndUpdateGestiondeCitasData = new RetrieveAndUpdateGestiondeCitasData();
			try {
				retrieveAndUpdateGestiondeCitasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGestiondeCitasData.retrieveByCriteria();
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
