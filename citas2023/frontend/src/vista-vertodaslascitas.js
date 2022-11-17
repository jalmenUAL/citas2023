import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVertodaslascitas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="tablaactivas" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="tablarealizadas" style="align-self: stretch;"></vaadin-vertical-layout>
 <vaadin-button theme="primary" id="darPorRealizadaCita" style="flex-grow: 0; align-self: stretch;">
   Dar Por Realizada 
 </vaadin-button>
 <vaadin-button theme="primary" id="posponerCita" style="align-self: stretch;">
   Posponer Cita 
 </vaadin-button>
 <vaadin-button theme="primary" id="cambiarFecha" style="align-self: stretch;">
   Cambiar Fecha 
 </vaadin-button>
 <vaadin-date-picker id="nuevaFecha" style="align-self: stretch;"></vaadin-date-picker>
 <vaadin-button id="darBaja" style="align-self: stretch;">
   Dar de Baja 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vertodaslascitas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVertodaslascitas.is, VistaVertodaslascitas);
