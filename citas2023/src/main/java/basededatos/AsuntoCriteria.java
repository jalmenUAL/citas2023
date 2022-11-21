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

public class AsuntoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final CollectionExpression de_la_cita;

	public AsuntoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		de_la_cita = new CollectionExpression("ORM_de_la_cita", this);
	}

	public AsuntoCriteria(PersistentSession session) {
		this(session.createCriteria(Asunto.class));
	}

	public AsuntoCriteria() throws PersistentException {
		this(GestiondeCitasPersistentManager.instance().getSession());
	}

	public CitaCriteria createDe_la_citaCriteria() {
		return new CitaCriteria(createCriteria("ORM_de_la_cita"));
	}

	public Asunto uniqueAsunto() {
		return (Asunto) super.uniqueResult();
	}

	public Asunto[] listAsunto() {
		java.util.List list = super.list();
		return (Asunto[]) list.toArray(new Asunto[list.size()]);
	}
}
