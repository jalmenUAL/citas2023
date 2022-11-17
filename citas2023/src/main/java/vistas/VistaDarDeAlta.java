package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import vistas.VistaPonerAsunto;
import com.vaadin.flow.component.polymertemplate.Id;
import vistas.VistaPonerCliente;
import vistas.VistaPonerFecha;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-dar-de-alta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar-de-alta")
@JsModule("./src/vista-dar-de-alta.js")
public class VistaDarDeAlta extends PolymerTemplate<VistaDarDeAlta.VistaDarDeAltaModel> {

     
	@Id("darDeAta")
	private Button darDeAta;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
     * Creates a new VistaDarDeAlta.
     */
    public VistaDarDeAlta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDarDeAlta and vista-dar-de-alta
     */
    public interface VistaDarDeAltaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	 

	public Button getDarDeAta() {
		return darDeAta;
	}

	public void setDarDeAta(Button darDeAta) {
		this.darDeAta = darDeAta;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
}
