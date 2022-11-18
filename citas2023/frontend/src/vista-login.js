import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaLogin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-form-layout id="login" style="align-self: center;">
  <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" id="usuario"></vaadin-text-field>
  <vaadin-password-field id="password"></vaadin-password-field>
  <vaadin-button id="botonlogin">
   Login
  </vaadin-button>
 </vaadin-form-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-login';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaLogin.is, VistaLogin);
