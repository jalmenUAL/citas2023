import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';

class VistaPonerFecha extends PolymerElement {

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
 <label id="label" style="align-self: stretch;">Fecha</label>
 <vaadin-date-picker id="fechaCita" style="align-self: stretch;"></vaadin-date-picker>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-poner-fecha';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPonerFecha.is, VistaPonerFecha);
