


<%@page import="wservices.Alumno"%>
<%@page import="Modelo.Alumno_cli"%>
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
                    <h5>Editar Alumno</h5>
                </div>
                <%
                    int id=Integer.parseInt((String)request.getAttribute("iduser"));
                 Alumno_cli alu= new Alumno_cli();
                 Alumno alumno=alu.listarID(id); 
                %>
                <div class="card-body">
                    <form action="Controlador">
                         <label>Codigo</label>
                         <input type="text" value="<%=alumno.getIdAlumno() %>" name="id" readonly="true" class="form-control">
                        <label>Nombres</label>
                        <input type="text" name="nombre" class="form-control" value="<%=alumno.getNomnreAlumno()%>">
                        <label>Apellidos</label>
                        <input type="text" name="apellido" class="form-control" value="<%=alumno.getApellidoAlumno()%>">
                        <label>Ciudad</label>
                        <input type="text" name="ciudad" class="form-control" value="<%=alumno.getCiudadAlumno()%>">
                        <label>Cargo</label>
                        <input type="text" name="cargo" class="form-control" value="<%=alumno.getCargoAlumno()%>">
                        <label>Estado</label>
                        <select name="estado" class="form-control"selected="<%=alumno.getEstadoAlumno()%>">
                            <option value="activo">Activo</option>
                        
                            <option value="inactivo">Inactivo</option>
                        </select>
                        <input type="submit" name="accion" value="editar">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
