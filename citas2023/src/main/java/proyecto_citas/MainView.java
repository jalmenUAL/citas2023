package proyecto_citas;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

 
import interfaz.Administrador;
import interfaz.No_Logeado;
import interfaz.Usuario;
 

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
	
	 
	
    public MainView() {
    	
    	No_Logeado nl = new No_Logeado();
    	
        add(nl);
        
        nl._login.getBotonlogin().addClickListener(new ComponentEventListener() {

			@Override
			public void onComponentEvent(ComponentEvent event) {
				// TODO Auto-generated method stub
				
				if (nl._login.getUsuario().getValue().equals("admin"))
				{
					Administrador gc = new Administrador();	
					removeAll();
					
					gc.getElement().setProperty("width", "100%");
					add(gc);
					
					gc.getLogout().addClickListener(new ComponentEventListener() {

						@Override
						public void onComponentEvent(ComponentEvent event) {
							// TODO Auto-generated method stub
							removeAll();
							add(nl); 
						}});
				}
				else {
					Usuario gc = new Usuario();
					removeAll();
					
					gc.getElement().setProperty("width", "100%");
					add(gc);
					
					gc.getLogout().addClickListener(new ComponentEventListener() {

						@Override
						public void onComponentEvent(ComponentEvent event) {
							// TODO Auto-generated method stub
							removeAll();
							add(nl); 
						}});
				}
				
			}
        	
        });
    	
        
        
    	 	
    }

}
