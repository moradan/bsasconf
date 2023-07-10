<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="${pageContext.request.contextPath}/login" method="post" class="container-fluid px-0">
    <input type="hidden" name="destino" value="${origen}"/>
    <section class="row g-0 mb-3">
        <div class="col-lg-5">
            <label class="mb-1" for="campo-usuario">Usuario</label>
            <input class="form-control mb-3" type="text" id="campo-usuario" name="campoUsuario" autofocus/>
            <label class="mb-1" for="campo-password">Password</label>
            <input class="form-control mb-3" type="password" id="campo-password" name="campoPassword"/>
        </div>
    </section>
    <c:if test="${huboError}">
        <section id="mensaje-error" class="row g-0 mb-3">
            <div class="col-12">
                <p class="text-danger text-bg-light">
                    El nombre de usuario o la contraseña no son correctos.
                </p>
            </div>
        </section>
    </c:if>
    <section class="row gx-3 mb-3">
        <div class="col-6 col-md-2">
            <input onclick="history.back();" class="btn btn-success form-control" type="button" value="Volver"/>
        </div>
        <div class="col-6 col-md-2">
            <input class="btn btn-success form-control" type="submit" value="Ingresar"/>
        </div>
    </section>
</form>