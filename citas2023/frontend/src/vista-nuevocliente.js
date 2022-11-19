import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaNuevocliente extends PolymerElement {

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
 <vaadin-text-field label="Nombre" placeholder="Introduzca el nombre" id="nuevoNombre" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-text-field label="Dirección" placeholder="Introduzca la dirección" id="Direccion" style="align-self: stretch;"></vaadin-text-field>
 <vaadin-text-field label="Teléfono" placeholder="Introduzca el teléfono" id="Telefono" style="align-self: stretch;"></vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-nuevocliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaNuevocliente.is, VistaNuevocliente);
