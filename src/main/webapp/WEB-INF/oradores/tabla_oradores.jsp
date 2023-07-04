<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<table class="table">
    <thead>
        <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Fecha de Alta</th>
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
                    <i class="btn btn-light bi bi-pencil-fill"></i>
                </td>
                <td>
                    <i class="btn btn-light bi bi-trash-fill"></i>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>