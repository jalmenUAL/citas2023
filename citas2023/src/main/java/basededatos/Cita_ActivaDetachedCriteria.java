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

public class Cita_ActivaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression es_paraId;
	public final AssociationExpression es_para;
	public final IntegerExpression fechaId;
	public final AssociationExpression fecha;
	
	public Cita_ActivaDetachedCriteria() {
		super(basededatos.Cita_Activa.class, basededatos.Cita_ActivaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		es_paraId = new IntegerExpression("es_para.ID", this.getDetachedCriteria());
		es_para = new AssociationExpression("es_para", this.getDetachedCriteria());
		fechaId = new IntegerExpression("fecha.null", this.getDetachedCriteria());
		fecha = new AssociationExpression("fecha", this.getDetachedCriteria());
	}
	
	public Cita_ActivaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Cita_ActivaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		es_paraId = new IntegerExpression("es_para.ID", this.getDetachedCriteria());
		es_para = new AssociationExpression("es_para", this.getDetachedCriteria());
		fechaId = new IntegerExpression("fecha.null", this.getDetachedCriteria());
		fecha = new AssociationExpression("fecha", this.getDetachedCriteria());
	}
	
	public AsuntoDetachedCriteria createEs_paraCriteria() {
		return new AsuntoDetachedCriteria(createCriteria("es_para"));
	}
	
	public FechaDetachedCriteria createFechaCriteria() {
		return new FechaDetachedCriteria(createCriteria("fecha"));
	}
	
	public Cita_Activa uniqueCita_Activa(PersistentSession session) {
		return (Cita_Activa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cita_Activa[] listCita_Activa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cita_Activa[]) list.toArray(new Cita_Activa[list.size()]);
	}
}

