package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.html.Label;
 

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





	@Id("darPorRealizadaCita")
	private Button darPorRealizadaCita;





	@Id("posponerCita")
	private Button posponerCita;





	@Id("cambiarFecha")
	private Button cambiarFecha;





	@Id("nuevaFecha")
	private DatePicker nuevaFecha;





	@Id("darBaja")
	private Button darBaja;





	@Id("titulo")
	private Label titulo;
	 

	 
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

	public Button getDarPorRealizadaCita() {
		return darPorRealizadaCita;
	}

	public void setDarPorRealizadaCita(Button darPorRealizadaCita) {
		this.darPorRealizadaCita = darPorRealizadaCita;
	}

	public Button getPosponerCita() {
		return posponerCita;
	}

	public void setPosponerCita(Button posponerCita) {
		this.posponerCita = posponerCita;
	}

	public Button getCambiarFecha() {
		return cambiarFecha;
	}

	public void setCambiarFecha(Button cambiarFecha) {
		this.cambiarFecha = cambiarFecha;
	}

	public DatePicker getNuevaFecha() {
		return nuevaFecha;
	}

	public void setNuevaFecha(DatePicker nuevaFecha) {
		this.nuevaFecha = nuevaFecha;
	}

	public Button getDarBaja() {
		return darBaja;
	}

	public void setDarBaja(Button darBaja) {
		this.darBaja = darBaja;
	}

	public Label getTitulo() {
		return titulo;
	}

	public void setTitulo(Label titulo) {
		this.titulo = titulo;
	}

	 
}
