class SeleccionadorOrador {
    #botones = [];   
    #celdaNombre;
    #celdaApellido;
    #campoNombre;
    #campoApellido;
    #campoBandera;
    
    constructor() {
        this.#obtenerBotones();
        this.#obtenerCampos();
        this.#asignarListeners();
    }
    
    #obtenerBotones() {
        this.#botones = document.querySelectorAll(".btn");
    };
    
    #asignarListeners() {
        for (const boton of this.#botones) {
            boton.addEventListener("click", this.#onClick.bind(this));
        }
    };
    
    #onClick(event) {
        const elementoClicado = event.currentTarget;
        this.#campoBandera.value = elementoClicado.dataset.accion;
        const id = elementoClicado.dataset.id;
        this.#obtenerCeldas(`#${id}`);
        this.#copiarDatos();
        document.querySelector("#formulario-datos").submit();
    };
    
    #obtenerCampos() {
        this.#campoNombre = document.querySelector("#campo-nombre");
        this.#campoApellido = document.querySelector("#campo-apellido");
        this.#campoBandera = document.querySelector("#campo-bandera");
    };
    
    #obtenerCeldas(id) {
        this.#celdaNombre = document.querySelector(`${id}` + " .celda-nombre");
        this.#celdaApellido = document.querySelector(`${id}` + " .celda-apellido");
    };
    
    #copiarDatos() {
        this.#campoNombre.value = this.#celdaNombre.innerHTML;
        this.#campoApellido.value = this.#celdaApellido.innerHTML;
    };
};

const miSeleccionador = new SeleccionadorOrador();
