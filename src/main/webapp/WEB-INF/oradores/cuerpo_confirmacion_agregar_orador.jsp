<!-- import para hacer uso de jakarta standard tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Cuerpo principal de la confirmacion de la compra donde se muestran los datos de los tiquets -->
<main class="container-fluid mt-5 mb-5 pt-3 pt-md-5">
    <!-- centrar contenido -->
    <div class="row g-0 justify-content-center">
        <div class="col-12 col-md-10 col-lg-8 col-xl-7">
            <!-- tarjeta que representa la confirmacion -->
            <section class="card shadow mb-5">
                <div class="card-body p-5">
                    <div class="card-title fs-2 fw-bold text-uppercase text-center">
                        Los datos del orador se registraron con <span class="text-success">éxito</span>.
                    </div>
                    <div class="card-text fs-6 fw-bold text-center mb-3">
                        <p>
                            Nombre: ${param.campoNombre} ${param.campoApellido}                         
                        </p>
                        <p>
                            Con su charla: ${param.campoCharla}
                        </p>
                        <p>
                            Fecha de alta: ${fechaAlta}
                        </p>
                    </div>
                </div>
            </section>
            
            <!-- botones -->
            <div class="col-12">
                <c:choose>
                    <c:when test="${id==0}">
                        <a class="btn btn-success form-control" href="./index.jsp#anotarse">Ok</a>
                    </c:when>
                    <c:otherwise>
                        <a class="btn btn-success form-control" href="./listarOradores">Ok</a>
                    </c:otherwise>
                </c:choose>    
            </div>
        </div>
    </div>
</main>
