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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FechaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression dia;
	public final IntegerExpression mes;
	public final IntegerExpression anyo;
	public final IntegerExpression citaId;
	public final AssociationExpression cita;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	
	public FechaDetachedCriteria() {
		super(basededatos.Fecha.class, basededatos.FechaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dia = new IntegerExpression("dia", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		anyo = new IntegerExpression("anyo", this.getDetachedCriteria());
		citaId = new IntegerExpression("cita.null", this.getDetachedCriteria());
		cita = new AssociationExpression("cita", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
	}
	
	public FechaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.FechaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dia = new IntegerExpression("dia", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		anyo = new IntegerExpression("anyo", this.getDetachedCriteria());
		citaId = new IntegerExpression("cita.null", this.getDetachedCriteria());
		cita = new AssociationExpression("cita", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
	}
	
	public CitaDetachedCriteria createCitaCriteria() {
		return new CitaDetachedCriteria(createCriteria("cita"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public Fecha uniqueFecha(PersistentSession session) {
		return (Fecha) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fecha[] listFecha(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fecha[]) list.toArray(new Fecha[list.size()]);
	}
}

