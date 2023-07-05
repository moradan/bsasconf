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
            <tr id="${'id'.concat(orador.id)}">
                <td class="celda-nombre">
                    ${orador.nombre}
                </td>
                <td class="celda-apellido">
                    ${orador.apellido}
                </td>
                <td>
                    ${orador.fechaAlta}
                </td>
                <td>
                    <i class="btn btn-light bi bi-pencil-fill" data-id="${'id'.concat(orador.id)}" data-accion="editar"></i>
                </td>
                <td>
                    <i class="btn btn-light bi bi-trash-fill" data-id="${'id'.concat(orador.id)}" data-accion="borrar"></i>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<form id="formulario-datos" action="editarOrador">
    <input id="campo-nombre" name="campoNombre" value="" type="hidden"/>
    <input id="campo-apellido" name="campoApellido" value="" type="hidden"/>
    <input id="campo-bandera" name="campoBanderaEditar" value="" type="hidden"/>
</form>