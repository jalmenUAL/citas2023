import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-form-layout/vaadin-form-layout.js';
import '@vaadin/vaadin-form-layout/src/vaadin-form-layout.js';
import '@vaadin/vaadin-form-layout/vaadin-form-item.js';
import '@vaadin/vaadin-text-field/vaadin-text-field.js';

class VistaVerInformacionCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    width: 100%;
                }
            </style>
<vaadin-form-layout id="vaadinFormLayout" style="width: 100%; height: 100%;">
 <vaadin-form-layout id="vaadinFormLayout1" style="width: 100%;">
  <vaadin-form-item id="vaadinFormItem" style="width: 100%;">
   <label slot="label" id="label">Nombre </label>
   <vaadin-text-field class="full-width" required id="nombre" style="flex-grow: 0;" has-value></vaadin-text-field>
  </vaadin-form-item>
  <vaadin-form-item id="vaadinFormItem1" style="width: 100%;">
   <label slot="label" id="label1">Dirección </label>
   <vaadin-text-field class="full-width" required id="direccion" has-value></vaadin-text-field>
  </vaadin-form-item>
  <vaadin-form-item id="vaadinFormItem2" style="width: 100%;">
   <label slot="label" id="label2">Teléfono </label>
   <vaadin-text-field class="full-width" required id="telefono" has-value></vaadin-text-field>
  </vaadin-form-item>
 </vaadin-form-layout>
</vaadin-form-layout>
`;
    }

    static get is() {
        return 'vista-ver-informacion-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerInformacionCliente.is, VistaVerInformacionCliente);
