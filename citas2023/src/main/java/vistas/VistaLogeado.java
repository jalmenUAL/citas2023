package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-logeado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-logeado")
@JsModule("./src/vista-logeado.js")
public class VistaLogeado extends PolymerTemplate<VistaLogeado.VistaLogeadoModel> {

    
	@Id("Marco")
	private Element marco;
	@Id("Logout")
	private Button logout;
	@Id("Conenido")
	private Element conenido;

	/**
     * Creates a new VistaLogeado.
     */
    public VistaLogeado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaLogeado and vista-logeado
     */
    public interface VistaLogeadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getMarco() {
		return marco;
	}

	public void setMarco(Element marco) {
		this.marco = marco;
	}

	public Button getLogout() {
		return logout;
	}

	public void setLogout(Button logout) {
		this.logout = logout;
	}

	public Element getConenido() {
		return conenido;
	}

	public void setConenido(Element conenido) {
		this.conenido = conenido;
	}
}
