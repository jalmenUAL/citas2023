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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cliente")
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLIENTE_FECHAS) {
			return ORM_fechas;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CLIENTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CLIENTE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Direccion", nullable=true, length=255)	
	private String direccion;
	
	@Column(name="Telefono", nullable=true, length=255)	
	private String telefono;
	
	@OneToMany(mappedBy="cliente", targetEntity=basededatos.Fecha.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_fechas = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public basededatos.Cita[] getCitas() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = fechas.getIterator();lIter.hasNext();) {
			lValues.add(((basededatos.Fecha)lIter.next()).getCita());
		}
		return (basededatos.Cita[])lValues.toArray(new basededatos.Cita[lValues.size()]);
	}
	
	public void removeCita(basededatos.Cita aCita) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getCita().equals(aCita)) {
				fechas.remove(lFechas[i]);
			}
		}
	}
	
	public void addCita(basededatos.Fecha aFecha, basededatos.Cita aCita) {
		aFecha.setCita(aCita);
		fechas.add(aFecha);
	}
	
	public basededatos.Fecha getFechaByCita(basededatos.Cita aCita) {
		basededatos.Fecha[] lFechas = fechas.toArray();
		for(int i = 0; i < lFechas.length; i++) {
			if(lFechas[i].getCita().equals(aCita)) {
				return lFechas[i];
			}
		}
		return null;
	}
	
	private void setORM_Fechas(java.util.Set value) {
		this.ORM_fechas = value;
	}
	
	private java.util.Set getORM_Fechas() {
		return ORM_fechas;
	}
	
	@Transient	
	public final basededatos.FechaSetCollection fechas = new basededatos.FechaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_FECHAS, ORMConstants.KEY_FECHA_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
