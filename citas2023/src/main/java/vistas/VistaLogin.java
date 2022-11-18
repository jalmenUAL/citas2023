package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-login")
@JsModule("./src/vista-login.js")
public class VistaLogin extends PolymerTemplate<VistaLogin.VistaLoginModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("login")
	private FormLayout login;
	@Id("usuario")
	private TextField usuario;
	@Id("password")
	private PasswordField password;
	@Id("botonlogin")
	private Button botonlogin;

	/**
     * Creates a new VistaLogin.
     */
    public VistaLogin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaLogin and vista-login
     */
    public interface VistaLoginModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public FormLayout getLogin() {
		return login;
	}

	public void setLogin(FormLayout login) {
		this.login = login;
	}

	public TextField getUsuario() {
		return usuario;
	}

	public void setUsuario(TextField usuario) {
		this.usuario = usuario;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}

	public Button getBotonlogin() {
		return botonlogin;
	}

	public void setBotonlogin(Button botonlogin) {
		this.botonlogin = botonlogin;
	}
}
