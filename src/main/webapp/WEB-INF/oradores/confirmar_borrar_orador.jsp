<main class="container-fluid mt-5 pt-5">
    <section class="row g-0 mb-5 justify-content-center">
        <div class="col-10 col-md-6 col-lg-4">
            <div class="row g-3 mb-3">
                <div class="card">
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
            <form class="row g-3 mb-3" action="borrar">
                <input type="hidden" name="campoId" value="${oradorObjetivo.id}">
                <div class="col-6">
                    <button class="btn btn-danger form-control" onclick="history.back()" type="button">Conservar Orador</button>
                </div>
                <div class="col-6">
                    <button class="btn btn-success form-control" type="submit" value="Borrar Orador">Borrar Orador</button>
                </div>
            </form>
        </div>
    </section>
</main>
