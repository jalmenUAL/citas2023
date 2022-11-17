package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-poner-fecha template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-poner-fecha")
@JsModule("./src/vista-poner-fecha.js")
public class VistaPonerFecha extends PolymerTemplate<VistaPonerFecha.VistaPonerFechaModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("fechaCita")
	private DatePicker fechaCita;

	/**
     * Creates a new VistaPonerFecha.
     */
    public VistaPonerFecha() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPonerFecha and vista-poner-fecha
     */
    public interface VistaPonerFechaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public DatePicker getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(DatePicker fechaCita) {
		this.fechaCita = fechaCita;
	}
}
