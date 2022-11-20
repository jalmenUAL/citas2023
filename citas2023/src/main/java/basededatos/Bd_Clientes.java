package basededatos;

import java.io.Serializable;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Bd_Clientes implements Serializable {

	 

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
