package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;

import basededatos.Cita_Activa;
import basededatos.Cita_Realizada;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid.Column;

/**
 * A Designer generated component for the vista-vercitas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercitas")
@JsModule("./src/vista-vercitas.js")
public class VistaVercitas extends PolymerTemplate<VistaVercitas.VistaVercitasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	 
	 
	 


	@Id("tabla")
	private Element tabla;
	 

	 
	/**
     * Creates a new VistaVercitas.
     */
    public VistaVercitas() {
        // You can initialise any data required for the connected UI components here.
      	
    }

    /**
     * This model binds properties between VistaVercitas and vista-vercitas
     */
   
    public interface VistaVercitasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	 

	public Element getTabla() {
		return tabla;
	}

	public void setTabla(Element tabla) {
		this.tabla = tabla;
	}

	 
}
