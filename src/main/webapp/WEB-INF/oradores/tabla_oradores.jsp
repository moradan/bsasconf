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
                    <a class="btn btn-light bi bi-pencil-fill" href="${pageContext.request.contextPath}/editarBorrar?accion=editar&id=${orador.id}"></a>
                </td>
                <td>
                    <a class="btn btn-light bi bi-trash-fill" href="${pageContext.request.contextPath}/editarBorrar?accion=borrar&id=${orador.id}"></a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>