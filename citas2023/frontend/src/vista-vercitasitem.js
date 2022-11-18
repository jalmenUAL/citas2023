import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

class VistaVercitasitem extends PolymerElement {

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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-text-field label="Cliente" placeholder="Placeholder" style="flex-grow: 1;" id="cliente"></vaadin-text-field>
  <vaadin-text-field label="Día" placeholder="Placeholder" style="flex-grow: 1;" id="dia"></vaadin-text-field>
  <vaadin-text-field label="Mes" placeholder="Placeholder" style="flex-grow: 1;" id="mes"></vaadin-text-field>
  <vaadin-text-field label="Año" placeholder="Placeholder" style="flex-grow: 1;" id="ano"></vaadin-text-field>
  <vaadin-text-field label="Asunto" placeholder="Placeholder" style="flex-grow: 1;" id="asunto"></vaadin-text-field>
  <vaadin-button id="VerInformacion" style="align-self: center;">
    Ver Informacion del Cliente 
  </vaadin-button>
  <vaadin-checkbox id="seleccionar" style="align-self: center;"></vaadin-checkbox>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercitasitem';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercitasitem.is, VistaVercitasitem);
