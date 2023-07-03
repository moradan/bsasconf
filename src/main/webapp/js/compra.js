const formulario = {
    valorTicket: 200,
    formulario: document.querySelector("form"),
    botonComprar: document.querySelector("#botonComprar"),
    botonReset: document.querySelector("#botonReset"),
    campoNombre: document.querySelector("#campoNombre"),
    campoApellido: document.querySelector("#campoApellido"),
    campoEmail: document.querySelector("#campoEmail"),
    campoCantidad: document.querySelector("#campoCantidad"),
    campoCategoria: document.querySelector("#campoCategoria"),
    campoTotal: document.querySelector("#campoTotal"),

    descuento: {
        estudiante: 0.8,
        trainee: 0.5,
        junior: 0.15
    },

    inicializar: function() {
        this.formulario.addEventListener("change", this.actualizarPrecio.bind(this));
        this.botonReset.onclick = this.limpiar.bind(this);
        window.addEventListener("pageshow", this.limpiar.bind(this));
        this.campoCategoria.onkeypress = this.evaluarTecla.bind(this);
        window.onkeydown = this.evaluarTecla.bind(this);
        this.limpiar();
    },

    evaluarTecla: function(evento) {
        switch (evento.key) {
            case "Enter":
                evento.preventDefault();
                this.botonComprar.click();
                break;
            case "Escape":
                evento.preventDefault();
                this.botonReset.click();
            default:
        }
    },

    actualizarPrecio: function() {
        const cantidad = this.campoCantidad.value;
        
        if (cantidad < 1) {
            this.campoCantidad.value = "";
            this.campoCantidad.focus();
        } else {
            const categoria = this.campoCategoria.value;
            const costoTotal = this.valorTicket * cantidad * (1 - this.descuento[categoria]);
            this.campoTotal.innerHTML = `$${costoTotal.toFixed(2)}`;
        }        
    },

    limpiar: function () {
        this.campoTotal.innerHTML = "";
        this.botonReset.click();
        this.campoNombre.focus();
    }
};

formulario.inicializar();