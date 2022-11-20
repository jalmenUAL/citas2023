package basededatos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Bd_Citas implements Serializable {

	public void Cita_Realizada(int ID) throws PersistentException {

		Fecha fe = null;
		Asunto as = null;
		Cliente cl = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cita_Activa c = Cita_ActivaDAO.getCita_ActivaByORMID(ID);
			fe = c.getFecha();
			as = c.getEs_para();
			cl = c.getCliente();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Baja_Cita_Activa(ID);

		Crear_Cita_Realizada(fe.getAnyo(), fe.getMes(), fe.getDia(), cl.getID(), as.getID());
		GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Cita_Pospuesta(int ID, LocalDate fecha) throws PersistentException {
		Asunto as = null;
		Cliente cl = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cita_Activa c = Cita_ActivaDAO.getCita_ActivaByORMID(ID);

			as = c.getEs_para();
			cl = c.getCliente();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		Baja_Cita_Activa(ID);

		Crear_Cita(fecha, cl.getID(), as.getID());
		GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Crear_Cita(LocalDate fecha, int Cliente, int Asunto) throws PersistentException {
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cl = ClienteDAO.getClienteByORMID(Cliente);
			Asunto as = AsuntoDAO.getAsuntoByORMID(Asunto);
			Fecha f = FechaDAO.createFecha();
			Cita_Activa Cita_Activa = Cita_ActivaDAO.createCita_Activa();
			Calendar cal = Calendar.getInstance();
			Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
			cal.setTime(date);
			f.setDia(cal.get(Calendar.DAY_OF_MONTH));
			f.setMes(cal.get(Calendar.MONTH));
			f.setAnyo(cal.get(Calendar.YEAR));
			f.setCliente(cl);
			f.setCita(Cita_Activa);
			Cita_Activa.setEs_para(as);
			Cita_Activa.setFecha(f);
			FechaDAO.save(f);
			Cita_ActivaDAO.save(Cita_Activa);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void Crear_Cita_Realizada(int a, int m, int d, int Cliente, int Asunto) throws PersistentException {
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cliente cl = ClienteDAO.getClienteByORMID(Cliente);
			Asunto as = AsuntoDAO.getAsuntoByORMID(Asunto);
			Fecha f = FechaDAO.createFecha();
			basededatos.Cita_Realizada Cita_Realizada = Cita_RealizadaDAO.createCita_Realizada();
			Calendar cal = new GregorianCalendar(a, m, d);
			f.setDia(cal.get(Calendar.DAY_OF_MONTH));
			f.setMes(cal.get(Calendar.MONTH));
			f.setAnyo(cal.get(Calendar.YEAR));
			f.setCliente(cl);
			f.setCita(Cita_Realizada);
			Cita_Realizada.setEs_para(as);
			Cita_Realizada.setFecha(f);
			FechaDAO.save(f);
			Cita_RealizadaDAO.save(Cita_Realizada);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}
	
	public void Baja_Cita(int ID) throws PersistentException {
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = CitaDAO.loadCitaByORMID(ID);
			Fecha f = FechaDAO.loadFechaByORMID(c.getFecha().getID());
			FechaDAO.delete(f);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		PersistentTransaction t2 = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita ca = CitaDAO.loadCitaByORMID(ID);
			Cita c = CitaDAO.loadCitaByORMID(ID);
			CitaDAO.delete(ca);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	public void Baja_Cita_Activa(int ID) throws PersistentException {
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = CitaDAO.loadCitaByORMID(ID);

			Fecha f = FechaDAO.loadFechaByORMID(c.getFecha().getID());
			FechaDAO.delete(f);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		PersistentTransaction t2 = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita_Activa ca = Cita_ActivaDAO.loadCita_ActivaByORMID(ID);
			Cita c = CitaDAO.loadCitaByORMID(ID);
			Cita_ActivaDAO.delete(ca);
			CitaDAO.delete(c);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		GestiondeCitasPersistentManager.instance().disposePersistentManager();

	}

	
	 

	public List Cargar_Citas_Activas() throws PersistentException {
		List<Cita_Activa> citas_act = null;

		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas_act = Cita_ActivaDAO.queryCita_Activa(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return citas_act;
	}

	public List Cargar_Citas_Realizadas() throws PersistentException {
		List citas_rel = null;

		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas_rel = Cita_RealizadaDAO.queryCita_Realizada(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return citas_rel;
	}

}
