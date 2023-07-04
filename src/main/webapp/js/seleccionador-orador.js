class SeleccionadorOrador {
    #botones = [];   
    #columnaNombre;
    #columnaApellido;
    #campoNombre;
    #campoApellido;
    #banderaEditar;
    
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
        
    };
    
    #obtenerCampos() {
        
    };
    
    #obtenerCeldas() {
        
    };
    
    #copiarDatos() {
        
    };
};

const miSeleccionador = new SeleccionadorOrador();
