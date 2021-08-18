
package Modelo;

import wservices.Alumno;


public class Alumno_cli {

    public Alumno_cli() {
    }

    public  java.util.List<wservices.Alumno> lista() {
        wservices.Servicios_Service service = new wservices.Servicios_Service();
        wservices.Servicios port = service.getServiciosPort();
        return port.lista();
    }

    public String agregar(java.lang.String nombre, java.lang.String apellido, java.lang.String ciudad, java.lang.String cargo, java.lang.String estado) {
        wservices.Servicios_Service service = new wservices.Servicios_Service();
        wservices.Servicios port = service.getServiciosPort();
        return port.agregar(nombre, apellido, ciudad, cargo, estado);
    }

    public Alumno listarID(int id) {
        wservices.Servicios_Service service = new wservices.Servicios_Service();
        wservices.Servicios port = service.getServiciosPort();
        return port.listarID(id);
    }

    public String editar(java.lang.String nombre, java.lang.String apellido, java.lang.String ciudad, java.lang.String cargo, java.lang.String estado, int id) {
        wservices.Servicios_Service service = new wservices.Servicios_Service();
        wservices.Servicios port = service.getServiciosPort();
        return port.editar(nombre, apellido, ciudad, cargo, estado, id);
    }

    public Alumno eliminar(int id) {
        wservices.Servicios_Service service = new wservices.Servicios_Service();
        wservices.Servicios port = service.getServiciosPort();
        return port.eliminar(id);
    }
    
    
    
    
}
