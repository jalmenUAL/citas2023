import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaDarDeAlta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    width: 100%;
                 }
            </style>
<vaadin-vertical-layout style="width: 100%; background:#dfe3ee;" id="vaadinVerticalLayout">
 <label style="font-size: 1.875em; font-weight: bold; align-self: stretch;">Dar de Alta Cita</label>
 <vaadin-vertical-layout theme="spacing" id="datos_cita" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-button id="darDeAta" style="align-self: stretch;" theme=" primary success">
   Dar de Alta Cita 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-de-alta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarDeAlta.is, VistaDarDeAlta);
