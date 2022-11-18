import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPonerCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
background:#ffe4c4;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <label id="label" style="align-self: stretch;">Cliente</label>
 <vaadin-combo-box id="seleccionCliente" style="align-self: stretch;"></vaadin-combo-box>
 <vaadin-button theme="primary" id="BotonNuevoCliente" style="align-self: stretch;">
   Nuevo Cliente 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-poner-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPonerCliente.is, VistaPonerCliente);
