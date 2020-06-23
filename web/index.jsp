<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <div class="container col-lg-3">
            <form action="Controlador">
                <div class="form-group" align="center">
                    <img src="img/cater.jpg" height="80" width="80"/> 
                    <br/>
                    <h1><strong>Bienvenido</strong></h1>
                </div>
                <div class="form-group">
                    <label>Correo:</label>
                    <input class="form-control" type="email" name="txtcorreo" placeholder="Ingrese su correo">
                </div>
                <div class="form-group">
                    <label > Contraseña:</label>
                    <input class="form-control" type="password" name="txtcontr" placeholder="Ingrese su contraseña">
                </div>
                <input class="btn btn-warning btn-block" type="submit" name="Accion" value="Ingresar">
            </form>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        
    </body>
</html>
    