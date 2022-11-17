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

public class FechaDAO {
	public static Fecha loadFechaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadFechaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha getFechaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return getFechaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadFechaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha getFechaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return getFechaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Fecha) session.load(basededatos.Fecha.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha getFechaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Fecha) session.get(basededatos.Fecha.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fecha) session.load(basededatos.Fecha.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha getFechaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fecha) session.get(basededatos.Fecha.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFecha(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return queryFecha(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFecha(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return queryFecha(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha[] listFechaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return listFechaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha[] listFechaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return listFechaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFecha(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Fecha as Fecha");
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
	
	public static List queryFecha(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Fecha as Fecha");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fecha", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha[] listFechaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFecha(session, condition, orderBy);
			return (Fecha[]) list.toArray(new Fecha[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha[] listFechaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFecha(session, condition, orderBy, lockMode);
			return (Fecha[]) list.toArray(new Fecha[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadFechaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return loadFechaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fecha[] fechas = listFechaByQuery(session, condition, orderBy);
		if (fechas != null && fechas.length > 0)
			return fechas[0];
		else
			return null;
	}
	
	public static Fecha loadFechaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fecha[] fechas = listFechaByQuery(session, condition, orderBy, lockMode);
		if (fechas != null && fechas.length > 0)
			return fechas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFechaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return iterateFechaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFechaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GestiondeCitasPersistentManager.instance().getSession();
			return iterateFechaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFechaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Fecha as Fecha");
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
	
	public static java.util.Iterator iterateFechaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Fecha as Fecha");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fecha", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha createFecha() {
		return new basededatos.Fecha();
	}
	
	public static boolean save(basededatos.Fecha fecha) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().saveObject(fecha);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Fecha fecha) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().deleteObject(fecha);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Fecha fecha)throws PersistentException {
		try {
			if (fecha.getCita() != null) {
				fecha.getCita().setFecha(null);
			}
			
			if (fecha.getCliente() != null) {
				fecha.getCliente().fechas.remove(fecha);
			}
			
			return delete(fecha);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Fecha fecha, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (fecha.getCita() != null) {
				fecha.getCita().setFecha(null);
			}
			
			if (fecha.getCliente() != null) {
				fecha.getCliente().fechas.remove(fecha);
			}
			
			try {
				session.delete(fecha);
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
	
	public static boolean refresh(basededatos.Fecha fecha) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().getSession().refresh(fecha);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Fecha fecha) throws PersistentException {
		try {
			GestiondeCitasPersistentManager.instance().getSession().evict(fecha);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fecha loadFechaByCriteria(FechaCriteria fechaCriteria) {
		Fecha[] fechas = listFechaByCriteria(fechaCriteria);
		if(fechas == null || fechas.length == 0) {
			return null;
		}
		return fechas[0];
	}
	
	public static Fecha[] listFechaByCriteria(FechaCriteria fechaCriteria) {
		return fechaCriteria.listFecha();
	}
}
