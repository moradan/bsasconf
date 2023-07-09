<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<form id="formulario_orador" action="agregarActualizar">
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
</form>