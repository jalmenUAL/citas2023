package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-ver-informacion-cliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver-informacion-cliente")
@JsModule("./src/vista-ver-informacion-cliente.js")
public class VistaVerInformacionCliente extends PolymerTemplate<VistaVerInformacionCliente.VistaVerInformacionClienteModel> {

    @Id("vaadinFormItem")
	private FormItem vaadinFormItem;
	@Id("vaadinFormLayout")
	private FormLayout vaadinFormLayout;
	@Id("vaadinFormLayout1")
	private FormLayout vaadinFormLayout1;
	@Id("label")
	private Label label;
	@Id("nombre")
	private TextField nombre;
	@Id("vaadinFormItem1")
	private FormItem vaadinFormItem1;
	@Id("label1")
	private Label label1;
	@Id("direccion")
	private TextField direccion;
	@Id("vaadinFormItem2")
	private FormItem vaadinFormItem2;
	@Id("label2")
	private Label label2;
	@Id("telefono")
	private TextField telefono;
	@Id("vaadinButton")
	private Button vaadinButton;
	/**
     * Creates a new VistaVerInformacionCliente.
     */
    public VistaVerInformacionCliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVerInformacionCliente and vista-ver-informacion-cliente
     */
    public interface VistaVerInformacionClienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public TextField getNombre() {
		return nombre;
	}

	public void setNombre(TextField nombre) {
		this.nombre = nombre;
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

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}
}
