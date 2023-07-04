<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<table class="table">
    <thead class="mb-1">
        <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Fecha de Alta</th>
            <th scope="col"></th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listaOradores}" var="orador">
            <tr>
                <td>
                    ${orador.nombre}
                </td>
                <td>
                    ${orador.apellido}
                </td>
                <td>
                    ${orador.fechaAlta}
                </td>
                <td>
                    <i id="boton-editar" class="btn btn-light bi bi-pencil-fill"></i>
                </td>
                <td>
                    <i id="boton-borrar" class="btn btn-light bi bi-trash-fill"></i>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<form id="formulario-datos">
    <input id="campo-nombre" name="campoNombre" value="" type="hidden"/>
    <input id="campo-apellido" name="campoApellido" value="" type="hidden"/>
    <input id="bandera-editar" name="banderaEditar" value="true" type="hidden"/>
</form>