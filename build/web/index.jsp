

<%@page import="java.util.List"%>
<%@page import="wservices.Alumno"%>
<%@page import="Modelo.Alumno_cli"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <div class="container" mt-4>
            <div class="card">
                <div class="card-header">
                    <a href="Controlador?accion=agregar" class="btn btn-primary">Nuevo Alumno</a>
                </div>
                <div class="card-body">
                    <table border="1" class="table table-hover">
                        <thead>
                            <tr>
                               <th>Nombres</th>
                                <th>Apellidos</th>
                                <th>Ciudad</th>
                                <th>Cargo</th>
                                <th>Estado</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                                Alumno_cli acli= new Alumno_cli();
                                List<Alumno> datos= acli.lista();
                                for(Alumno u:datos){
                                    
                                
                                %>
                            <tr>
                             
                                <td><%= u.getApellidoAlumno() %></td>
                                <td><%= u.getNomnreAlumno() %></td>
                                <td><%= u.getCiudadAlumno() %></td>
                                <td><%= u.getCargoAlumno() %></td>
                                <td><%= u.getEstadoAlumno() %></td>
                                <td>
                                    <a href="Controlador?accion=actualizar&id=<%= u.getIdAlumno() %>" class="btn btn-warnig">Editar</a>
                                    <a href="Controlador?accion=eliminar&id=<%=u.getIdAlumno()%>" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>

                </div>
            </div>
          </div>
    </body>
</html>
