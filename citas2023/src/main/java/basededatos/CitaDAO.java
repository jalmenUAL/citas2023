/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Administrator(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CitaDAO {
	public static Cita loadCitaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadCitaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita getCitaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return getCitaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadCitaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita getCitaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return getCitaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cita) session.load(basededatos.Cita.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita getCitaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cita) session.get(basededatos.Cita.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cita) session.load(basededatos.Cita.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita getCitaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cita) session.get(basededatos.Cita.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCita(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return queryCita(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCita(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return queryCita(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita[] listCitaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return listCitaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita[] listCitaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return listCitaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCita(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cita as Cita");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCita(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cita as Cita");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cita", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita[] listCitaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCita(session, condition, orderBy);
			return (Cita[]) list.toArray(new Cita[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita[] listCitaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCita(session, condition, orderBy, lockMode);
			return (Cita[]) list.toArray(new Cita[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadCitaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadCitaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cita[] citas = listCitaByQuery(session, condition, orderBy);
		if (citas != null && citas.length > 0)
			return citas[0];
		else
			return null;
	}
	
	public static Cita loadCitaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cita[] citas = listCitaByQuery(session, condition, orderBy, lockMode);
		if (citas != null && citas.length > 0)
			return citas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCitaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return iterateCitaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCitaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return iterateCitaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCitaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cita as Cita");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCitaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cita as Cita");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cita", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita createCita() {
		return new basededatos.Cita();
	}
	
	public static boolean save(basededatos.Cita cita) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().saveObject(cita);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cita cita) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().deleteObject(cita);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cita cita)throws PersistentException {
		if (cita instanceof basededatos.Cita_Activa) {
			return basededatos.Cita_ActivaDAO.deleteAndDissociate((basededatos.Cita_Activa) cita);
		}
		
		if (cita instanceof basededatos.Cita_Realizada) {
			return basededatos.Cita_RealizadaDAO.deleteAndDissociate((basededatos.Cita_Realizada) cita);
		}
		
		try {
			if (cita.getEs_para() != null) {
				cita.getEs_para().de_la_cita.remove(cita);
			}
			
			if (cita.getFecha() != null) {
				cita.getFecha().setCita(null);
			}
			
			return delete(cita);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cita cita, org.orm.PersistentSession session)throws PersistentException {
		if (cita instanceof basededatos.Cita_Activa) {
			return basededatos.Cita_ActivaDAO.deleteAndDissociate((basededatos.Cita_Activa) cita, session);
		}
		
		if (cita instanceof basededatos.Cita_Realizada) {
			return basededatos.Cita_RealizadaDAO.deleteAndDissociate((basededatos.Cita_Realizada) cita, session);
		}
		
		try {
			if (cita.getEs_para() != null) {
				cita.getEs_para().de_la_cita.remove(cita);
			}
			
			if (cita.getFecha() != null) {
				cita.getFecha().setCita(null);
			}
			
			try {
				session.delete(cita);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Cita cita) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().getSession().refresh(cita);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cita cita) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().getSession().evict(cita);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cita loadCitaByCriteria(CitaCriteria citaCriteria) {
		Cita[] citas = listCitaByCriteria(citaCriteria);
		if(citas == null || citas.length == 0) {
			return null;
		}
		return citas[0];
	}
	
	public static Cita[] listCitaByCriteria(CitaCriteria citaCriteria) {
		return citaCriteria.listCita();
	}
}
