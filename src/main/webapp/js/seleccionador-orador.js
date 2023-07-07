class SeleccionadorOrador {
    #botones = [];
    #campoId = document.querySelector("#campo-id");
    #campoBandera = document.querySelector("#campo-bandera")
    
    constructor() {
        this.#obtenerBotones();
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
        
        const id = elementoClicado.dataset.id;
        const accion = elementoClicado.dataset.accion;
        
        this.#campoId.value = id.substring(2);
        this.#campoBandera.value = accion;
        
        document.querySelector("#formulario-datos").submit();
    };
};

const miSeleccionador = new SeleccionadorOrador();
