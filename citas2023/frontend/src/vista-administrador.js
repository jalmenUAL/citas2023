import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAdministrador extends PolymerElement {

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
<vaadin-vertical-layout style="width: 100%; height: 100%; " id="vaadinVerticalLayout"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);
