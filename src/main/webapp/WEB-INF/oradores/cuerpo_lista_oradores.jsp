<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<main id="lista-oradores" class="destino-nav row g-0 mt-5 mb-5 justify-content-center">
    <div class="col-11 col-md-10 col-lg-8 col-xl-7">
        <c:choose>
            <c:when test="${listaOradores.size() == 0}">
                <h1 class="pt-5 text-center">No hay oradores inscriptos aun</h1>
            </c:when>
            <c:otherwise>
                <jsp:include page="./titulo_lista_oradores.jsp"/>
    
                <jsp:include page="./tabla_oradores.jsp"/>
             </c:otherwise>
        </c:choose>
    </div>
</main>