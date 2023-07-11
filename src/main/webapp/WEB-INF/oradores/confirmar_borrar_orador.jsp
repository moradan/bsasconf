<main class="container-fluid mt-5 pt-5">
    <section class="row g-0 mb-5 justify-content-center">
        <div class="col-10 col-md-6 col-lg-4">
            <div class="row g-3 mb-3">
                <div class="card shadow">
                    <div class="card-body">
                        <h1 class="card-title fs-5 fw-bold mb-3">
                            ¿Desea borrar este orador?
                        </h1>
                        <p class="card-text fw-bold">
                            ${oradorObjetivo.nombre} ${oradorObjetivo.apellido}
                        </p>
                        <p class="card-text">
                            Con su charla: ${oradorObjetivo.charla}
                        </p>
                        <p class="card-text">
                            Fecha de alta: ${oradorObjetivo.fechaAlta}
                        </p>
                    </div>
                </div>
            </div>
            <div class="row g-3 mb-3">
                <div class="col-6">
                    <a class="btn btn-danger form-control" href="${pageContext.request.contextPath}/listarOradores">Conservar Orador</a>
                </div>
                <div class="col-6">
                    <a class="btn btn-success form-control" href="${pageContext.request.contextPath}/borrar?id=${oradorObjetivo.id}" >Borrar Orador</a>
                </div>
            </div>
        </div>
    </section>
</main>
