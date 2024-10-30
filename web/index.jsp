<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Login Page</title>
</head>
<body>
    <div class="container mt-4 col-lg-4"> 
        <div class="card col-sm-10">
            <div class="card-body text-center">
                <form action="Controlador" method="post"> <!-- Acción del formulario -->
                    <div class="form-group text-center">
                        <h3>Login</h3>
                        <img src="img/LogoF.PNG" alt="Logo" width="170"/> <!-- Corregido width -->
                        <label>Bienvenido al Sistema</label>
                    </div>
                    <div class="form-group">
                        <label>Usuario:</label>
                        <input type="text" name="txtuser" class="form-control" required> <!-- Cambiado a txtuser -->
                    </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" name="txtpass" class="form-control" required> <!-- Cambiado a txtpass y tipo password -->
                    </div>
                    <input type="hidden" name="accion" value="Ingresar"> <!-- Campo oculto para la acción -->
                    <input type="submit" class="btn btn-primary btn-blog" value="Ingresar"> <!-- Cambiado value a 'Ingresar' -->
                </form>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
