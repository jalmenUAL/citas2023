import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;background:#ffe4c4;	" id="Marco">
 <vaadin-button id="Logout" style="align-self: flex-end;">
   Logout 
 </vaadin-button>
 <vaadin-vertical-layout id="Conenido" style="width: 100%; height: 100%; flex-grow: 1;"></vaadin-vertical-layout>
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
