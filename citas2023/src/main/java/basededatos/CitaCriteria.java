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

public class CitaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression es_paraId;
	public final AssociationExpression es_para;
	public final IntegerExpression fechaId;
	public final AssociationExpression fecha;
	
	public CitaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		es_paraId = new IntegerExpression("es_para.ID", this);
		es_para = new AssociationExpression("es_para", this);
		fechaId = new IntegerExpression("fecha.null", this);
		fecha = new AssociationExpression("fecha", this);
	}
	
	public CitaCriteria(PersistentSession session) {
		this(session.createCriteria(Cita.class));
	}
	
	public CitaCriteria() throws PersistentException {
		this(GestiondeCitasPersistentManager.instance().getSession());
	}
	
	public AsuntoCriteria createEs_paraCriteria() {
		return new AsuntoCriteria(createCriteria("es_para"));
	}
	
	public FechaCriteria createFechaCriteria() {
		return new FechaCriteria(createCriteria("fecha"));
	}
	
	public Cita uniqueCita() {
		return (Cita) super.uniqueResult();
	}
	
	public Cita[] listCita() {
		java.util.List list = super.list();
		return (Cita[]) list.toArray(new Cita[list.size()]);
	}
}

