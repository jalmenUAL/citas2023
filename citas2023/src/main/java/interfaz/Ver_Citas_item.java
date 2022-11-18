package interfaz;

import basededatos.Cita;
import basededatos.Cliente;
import bds.Bd_Principal;
import bds.iAdministrador;
import vistas.VistaVercitasitem;

public class Ver_Citas_item extends VistaVercitasitem {
	/*private event _seleccionar;*/
	public Ver_Citas _ver_Citas;
	public Ver_Informacion_Cliente _ver_Informacion_Cliente = new Ver_Informacion_Cliente();

	iAdministrador adm = new Bd_Principal();
	Cita cita;
	 

	public void Seleccionar() {
		 
	}
	
 
	
	public Ver_Citas_item(Cita c){
		cita = c;
	}
	
	public void Ver_Informacion_Cliente() {
		Integer id = cita.getID();
		Cliente cli = adm.Cargar_Informacion_Cliente(id);
		_ver_Informacion_Cliente.getNombre().setValue(cli.getNombre());
		_ver_Informacion_Cliente.getDireccion().setValue(cli.getDireccion());
		_ver_Informacion_Cliente.getTelefono().setValue(cli.getTelefono());
	}
}