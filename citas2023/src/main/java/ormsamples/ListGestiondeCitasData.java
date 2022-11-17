/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListGestiondeCitasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cita...");
		basededatos.Cita[] basededatosCitas = basededatos.CitaDAO.listCitaByQuery(null, null);
		int length = Math.min(basededatosCitas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCitas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cita_Activa...");
		basededatos.Cita_Activa[] basededatosCita_Activas = basededatos.Cita_ActivaDAO.listCita_ActivaByQuery(null, null);
		length = Math.min(basededatosCita_Activas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCita_Activas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cita_Realizada...");
		basededatos.Cita_Realizada[] basededatosCita_Realizadas = basededatos.Cita_RealizadaDAO.listCita_RealizadaByQuery(null, null);
		length = Math.min(basededatosCita_Realizadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCita_Realizadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asunto...");
		basededatos.Asunto[] basededatosAsuntos = basededatos.AsuntoDAO.listAsuntoByQuery(null, null);
		length = Math.min(basededatosAsuntos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAsuntos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		basededatos.Cliente[] basededatosClientes = basededatos.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(basededatosClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fecha...");
		basededatos.Fecha[] basededatosFechas = basededatos.FechaDAO.listFechaByQuery(null, null);
		length = Math.min(basededatosFechas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosFechas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cita by Criteria...");
		basededatos.CitaCriteria lbasededatosCitaCriteria = new basededatos.CitaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCitaCriteria.ID.eq();
		lbasededatosCitaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cita[] basededatosCitas = lbasededatosCitaCriteria.listCita();
		int length =basededatosCitas== null ? 0 : Math.min(basededatosCitas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCitas[i]);
		}
		System.out.println(length + " Cita record(s) retrieved."); 
		
		System.out.println("Listing Cita_Activa by Criteria...");
		basededatos.Cita_ActivaCriteria lbasededatosCita_ActivaCriteria = new basededatos.Cita_ActivaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCita_ActivaCriteria.ID.eq();
		lbasededatosCita_ActivaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cita_Activa[] basededatosCita_Activas = lbasededatosCita_ActivaCriteria.listCita_Activa();
		length =basededatosCita_Activas== null ? 0 : Math.min(basededatosCita_Activas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCita_Activas[i]);
		}
		System.out.println(length + " Cita_Activa record(s) retrieved."); 
		
		System.out.println("Listing Cita_Realizada by Criteria...");
		basededatos.Cita_RealizadaCriteria lbasededatosCita_RealizadaCriteria = new basededatos.Cita_RealizadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCita_RealizadaCriteria.ID.eq();
		lbasededatosCita_RealizadaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cita_Realizada[] basededatosCita_Realizadas = lbasededatosCita_RealizadaCriteria.listCita_Realizada();
		length =basededatosCita_Realizadas== null ? 0 : Math.min(basededatosCita_Realizadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCita_Realizadas[i]);
		}
		System.out.println(length + " Cita_Realizada record(s) retrieved."); 
		
		System.out.println("Listing Asunto by Criteria...");
		basededatos.AsuntoCriteria lbasededatosAsuntoCriteria = new basededatos.AsuntoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAsuntoCriteria.ID.eq();
		lbasededatosAsuntoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Asunto[] basededatosAsuntos = lbasededatosAsuntoCriteria.listAsunto();
		length =basededatosAsuntos== null ? 0 : Math.min(basededatosAsuntos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAsuntos[i]);
		}
		System.out.println(length + " Asunto record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		basededatos.ClienteCriteria lbasededatosClienteCriteria = new basededatos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosClienteCriteria.ID.eq();
		lbasededatosClienteCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cliente[] basededatosClientes = lbasededatosClienteCriteria.listCliente();
		length =basededatosClientes== null ? 0 : Math.min(basededatosClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Fecha by Criteria...");
		basededatos.FechaCriteria lbasededatosFechaCriteria = new basededatos.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosFechaCriteria.ID.eq();
		lbasededatosFechaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Fecha[] basededatosFechas = lbasededatosFechaCriteria.listFecha();
		length =basededatosFechas== null ? 0 : Math.min(basededatosFechas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosFechas[i]);
		}
		System.out.println(length + " Fecha record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGestiondeCitasData listGestiondeCitasData = new ListGestiondeCitasData();
			try {
				listGestiondeCitasData.listTestData();
				//listGestiondeCitasData.listByCriteria();
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
