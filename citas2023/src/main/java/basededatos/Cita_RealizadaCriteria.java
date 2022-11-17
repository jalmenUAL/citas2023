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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Cita_RealizadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression es_paraId;
	public final AssociationExpression es_para;
	public final IntegerExpression fechaId;
	public final AssociationExpression fecha;
	
	public Cita_RealizadaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		es_paraId = new IntegerExpression("es_para.ID", this);
		es_para = new AssociationExpression("es_para", this);
		fechaId = new IntegerExpression("fecha.null", this);
		fecha = new AssociationExpression("fecha", this);
	}
	
	public Cita_RealizadaCriteria(PersistentSession session) {
		this(session.createCriteria(Cita_Realizada.class));
	}
	
	public Cita_RealizadaCriteria() throws PersistentException {
		this(GestiondeCitasPersistentManager.instance().getSession());
	}
	
	public AsuntoCriteria createEs_paraCriteria() {
		return new AsuntoCriteria(createCriteria("es_para"));
	}
	
	public FechaCriteria createFechaCriteria() {
		return new FechaCriteria(createCriteria("fecha"));
	}
	
	public Cita_Realizada uniqueCita_Realizada() {
		return (Cita_Realizada) super.uniqueResult();
	}
	
	public Cita_Realizada[] listCita_Realizada() {
		java.util.List list = super.list();
		return (Cita_Realizada[]) list.toArray(new Cita_Realizada[list.size()]);
	}
}

