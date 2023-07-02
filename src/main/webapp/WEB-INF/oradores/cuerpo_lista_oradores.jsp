<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<main class="row g-0 mt-5 mb-5 justify-content-center">
    <div class="col-11 col-md-10 col-lg-8 col-xl-7">
        
        <jsp:include page="./titulo_lista_oradores.jsp"/>
    
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
                            <i id="orador.id" class="bi bi-pencil-fill"></i>
                        </td>
                        <td>
                            <i id="orador.id" class="bi bi-trash-fill"></i>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</main>