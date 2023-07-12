<form id="formulario_orador" action="${param.accion}">
    <input type="hidden" name="id" value="${oradorObjetivo.id}"/>
    <input type="hidden" name="fechaAlta" value="${oradorObjetivo.fechaAlta}"/>
    <div class="row">
        <div class="col-12 col-md-6 mb-2">
            <input type="text" class="form-control" name="campoNombre" id="campo-nombre" placeholder="Nombre" value="${oradorObjetivo.nombre}" required>
        </div>
        <div class="col-12 col-md-6 mb-2">
            <input type="text" class="form-control col-12 col-md-6 mb-2" name="campoApellido" id="campo-apellido" placeholder="Apellido" value="${oradorObjetivo.apellido}" required>
        </div>
    </div>
    <div class="row">
        <div class="col-12 mb-2">
            <textarea class="form-control mb-2" name="campoCharla" id="campo-charla" cols="30" rows="6" placeholder="¿De qué se trata su charla?" required>${oradorObjetivo.charla}</textarea>
        </div>
    </div>
</form>