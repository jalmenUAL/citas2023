package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.checkbox.Checkbox;

import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-vercitasitem template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-vercitasitem")
@JsModule("./src/vista-vercitasitem.js")
public class VistaVercitasitem extends PolymerTemplate<VistaVercitasitem.VistaVercitasitemModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("cliente")
	private TextField cliente;
	@Id("mes")
	private TextField mes;
	@Id("asunto")
	private TextField asunto;
	 
	@Id("dia")
	private TextField dia;
	@Id("ano")
	private TextField ano;
	@Id("VerInformacion")
	private Button verInformacion;
	@Id("seleccionar")
	private Checkbox seleccionar;

	/**
     * Creates a new VistaVercitasitem.
     */
    public VistaVercitasitem() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaVercitasitem and vista-vercitasitem
     */
    public interface VistaVercitasitemModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public TextField getCliente() {
		return cliente;
	}

	public void setCliente(TextField cliente) {
		this.cliente = cliente;
	}

	public TextField getMes() {
		return mes;
	}

	public void setMes(TextField mes) {
		this.mes = mes;
	}

	public TextField getAsunto() {
		return asunto;
	}

	public void setAsunto(TextField asunto) {
		this.asunto = asunto;
	}

	 

	public TextField getDia() {
		return dia;
	}

	public void setDia(TextField dia) {
		this.dia = dia;
	}

	public TextField getAno() {
		return ano;
	}

	public void setAno(TextField ano) {
		this.ano = ano;
	}

	public Button getVerInformacion() {
		return verInformacion;
	}

	public void setVerInformacion(Button verInformacion) {
		this.verInformacion = verInformacion;
	}

	public Checkbox getSeleccionar() {
		return seleccionar;
	}

	public void setSeleccionar(Checkbox seleccionar) {
		this.seleccionar = seleccionar;
	}
}
