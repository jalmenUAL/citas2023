package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Asunto;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-poner-asunto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-poner-asunto")
@JsModule("./src/vista-poner-asunto.js")
public class VistaPonerAsunto extends PolymerTemplate<VistaPonerAsunto.VistaPonerAsuntoModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("seleccionAsunto")
	private ComboBox<Asunto> seleccionAsunto;
	@Id("BotonNuevoAsunto")
	private Button botonNuevoAsunto;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaPonerAsunto.
     */
    public VistaPonerAsunto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPonerAsunto and vista-poner-asunto
     */
    public interface VistaPonerAsuntoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public ComboBox<Asunto> getSeleccionAsunto() {
		return seleccionAsunto;
	}

	public void setSeleccionAsunto(ComboBox<Asunto> seleccionAsunto) {
		this.seleccionAsunto = seleccionAsunto;
	}

	public Button getBotonNuevoAsunto() {
		return botonNuevoAsunto;
	}

	public void setBotonNuevoAsunto(Button botonNuevoAsunto) {
		this.botonNuevoAsunto = botonNuevoAsunto;
	}

	 
}
