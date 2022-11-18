package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-gestionar-citas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-gestionar-citas")
@JsModule("./src/vista-gestionar-citas.js")
public class VistaGestionarCitas extends PolymerTemplate<VistaGestionarCitas.VistaGestionarCitasModel> {

     
	 
	 
	private Element vaadinVerticalLayout;
	@Id("botonVerCitasRealizadas")
	private Button botonVerCitasRealizadas;
	@Id("botondardeAltaCita")
	private Button botondardeAltaCita;
	 
	@Id("Menu")
	private Element menu;
	@Id("Ventana")
	private Element ventana;

	/**
     * Creates a new VistaGestionarCitas.
     */
    public VistaGestionarCitas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaGestionarCitas and vista-gestionar-citas
     */
    public interface VistaGestionarCitasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBotonVerCitasRealizadas() {
		return botonVerCitasRealizadas;
	}

	public void setBotonVerCitasRealizadas(Button botonVerCitasRealizadas) {
		this.botonVerCitasRealizadas = botonVerCitasRealizadas;
	}

	public Button getBotondardeAltaCita() {
		return botondardeAltaCita;
	}

	public void setBotondardeAltaCita(Button botondardeAltaCita) {
		this.botondardeAltaCita = botondardeAltaCita;
	}

	public Element getMenu() {
		return menu;
	}

	public void setMenu(Element menu) {
		this.menu = menu;
	}

	public Element getVentana() {
		return ventana;
	}

	public void setVentana(Element ventana) {
		this.ventana = ventana;
	}

	 

	 
}
