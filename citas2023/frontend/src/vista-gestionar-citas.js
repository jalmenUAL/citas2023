import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaGestionarCitas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
 
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 100%; background: #dfe3ee;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout class="sidebar" id="Menu" style="height: 100%;background: #8b9dc3;">
  <vaadin-button id="botonVerCitasRealizadas" style="align-self: stretch;" theme="primary">
    Ver Citas Realizadas 
  </vaadin-button>
  <vaadin-button id="botondardeAltaCita" style="align-self: stretch;" theme="primary">
    Dar de Alta a Cita 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto; background:#dfe3ee; height: 100%;" id="Ventana"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-gestionar-citas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaGestionarCitas.is, VistaGestionarCitas);
