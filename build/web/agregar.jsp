

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" mt-4 col-lg-4>
            <div class="card">
                <div class="card-header">
                    <h5>Agregar Nuevo Alumno:</h5>
                </div>
                <div class="card-body">
                    <form action="Controlador">
                        <label>Nombres</label>
                        <input type="text" name="nombre" class="form-control">
                        <label>Apellidos</label>
                        <input type="text" name="apellido" class="form-control">
                        <label>Ciudad</label>
                        <input type="text" name="ciudad" class="form-control">
                        <label>Cargo</label>
                        <input type="text" name="cargo" class="form-control">
                        <label>Estado</label>
                        <select name="estado" class="form-control">
                            <option value="activo">Activo</option>
                        
                            <option value="inactivo">Inactivo</option>
                        </select>
                        <input type="submit" name="accion" value="guarda">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
