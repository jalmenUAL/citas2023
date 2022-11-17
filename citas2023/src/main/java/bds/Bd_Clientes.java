package bds;

import java.io.Serializable;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cita;
import basededatos.CitaDAO;
import basededatos.Cliente;
import basededatos.ClienteDAO;
import basededatos.GestiondeCitasPersistentManager;

public class Bd_Clientes implements Serializable {

	public Cliente Cargar_Informacion_Cliente(int Cita) throws PersistentException {
		Cliente cl = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = CitaDAO.getCitaByORMID(Cita);
			cl = ClienteDAO.getClienteByORMID(c.getCliente().getID());

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cl;

	}

	public int Nuevo_Cliente(String Nombre, String Direccion, String Telefono) throws PersistentException {
		int id_cliente = -1;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cliente cl = ClienteDAO.createCliente();
			cl.setNombre(Nombre);
			cl.setDireccion(Direccion);
			cl.setTelefono(Telefono);
			ClienteDAO.save(cl);
			id_cliente = cl.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return id_cliente;
	}

	public List Cargar_Clientes() throws PersistentException {
		List clientes = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			clientes = ClienteDAO.queryCliente(null, null);

		} catch (Exception e) {
			t.rollback();
		}

		return clientes;
	}
}
