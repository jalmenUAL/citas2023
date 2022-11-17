package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-nuevoasunto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevoasunto")
@JsModule("./src/vista-nuevoasunto.js")
public class VistaNuevoasunto extends PolymerTemplate<VistaNuevoasunto.VistaNuevoasuntoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nuevoAsunto")
	private TextField nuevoAsunto;

	/**
     * Creates a new VistaNuevoasunto.
     */
    public VistaNuevoasunto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNuevoasunto and vista-nuevoasunto
     */
    public interface VistaNuevoasuntoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getNuevoAsunto() {
		return nuevoAsunto;
	}

	public void setNuevoAsunto(TextField nuevoAsunto) {
		this.nuevoAsunto = nuevoAsunto;
	}
}
