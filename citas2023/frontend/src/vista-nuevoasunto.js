import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaNuevoasunto extends PolymerElement {

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
 <vaadin-text-field label="Asunto" placeholder="Introduzca el nuevo asunto" id="nuevoAsunto" style="align-self: stretch;"></vaadin-text-field>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-nuevoasunto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaNuevoasunto.is, VistaNuevoasunto);
