import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaLogeado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
 
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;background:#dfe3ee;	" id="Marco">
 <vaadin-button id="Logout" style="align-self: flex-end;">
  <iron-icon icon="vaadin:sign-out-alt" id="ironIcon"></iron-icon>
 </vaadin-button>
 <vaadin-vertical-layout id="Conenido" style="width: 100%; height: 100%; flex-grow: 1;background:#dfe3ee;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-logeado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaLogeado.is, VistaLogeado);
