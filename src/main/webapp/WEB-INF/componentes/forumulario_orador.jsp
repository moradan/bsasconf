<form class="container-fluid" action="agregarActualizar">
    <input type="hidden" id="campo-id" name="campoId" value="${oradorObjetivo.id}"/>
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
    <div class="row text-start">
        <p class="fs-6 mb-3 text-secondary-emphasis">Recuerda incluir un tí­tulo para tu charla.</p>
    </div>
    <div class="row text-center">
        <div class="col-12">
            <button type="submit" class="btn btn-success w-100">Guardar</a>
        </div>
    </div>
</form>