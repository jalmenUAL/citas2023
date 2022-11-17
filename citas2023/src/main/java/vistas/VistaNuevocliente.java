package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vista-nuevocliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevocliente")
@JsModule("./src/vista-nuevocliente.js")
public class VistaNuevocliente extends PolymerTemplate<VistaNuevocliente.VistaNuevoclienteModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nuevoNombre")
	private TextField nuevoCliente;
	@Id("Direccion")
	private TextField direccion;
	@Id("Telefono")
	private TextField telefono;

	/**
     * Creates a new VistaNuevocliente.
     */
    public VistaNuevocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNuevocliente and vista-nuevocliente
     */
    public interface VistaNuevoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(TextField nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public TextField getDireccion() {
		return direccion;
	}

	public void setDireccion(TextField direccion) {
		this.direccion = direccion;
	}

	public TextField getTelefono() {
		return telefono;
	}

	public void setTelefono(TextField telefono) {
		this.telefono = telefono;
	}
}
