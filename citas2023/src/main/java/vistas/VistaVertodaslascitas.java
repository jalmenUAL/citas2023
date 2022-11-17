package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * A Designer generated component for the vista-vertodaslascitas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vertodaslascitas")
@JsModule("./src/vista-vertodaslascitas.js")
public class VistaVertodaslascitas extends PolymerTemplate<VistaVertodaslascitas.VistaVertodaslascitasModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
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
	@Id("tablaactivas")
	private Element tablaactivas;
	@Id("tablarealizadas")
	private Element tablarealizadas;

	/**
     * Creates a new VistaVertodaslascitas.
     */
    public VistaVertodaslascitas() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVertodaslascitas and vista-vertodaslascitas
     */
    public interface VistaVertodaslascitasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
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

	public Element getTablaactivas() {
		return tablaactivas;
	}

	public void setTablaactivas(Element tablaactivas) {
		this.tablaactivas = tablaactivas;
	}

	public Element getTablarealizadas() {
		return tablarealizadas;
	}

	public void setTablarealizadas(Element tablarealizadas) {
		this.tablarealizadas = tablarealizadas;
	}
}
