
package wservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alumno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido_alumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cargo_alumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudad_alumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado_alumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_Alumno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomnre_alumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alumno", propOrder = {
    "apellidoAlumno",
    "cargoAlumno",
    "ciudadAlumno",
    "estadoAlumno",
    "idAlumno",
    "nomnreAlumno"
})
public class Alumno {

    @XmlElement(name = "apellido_alumno")
    protected String apellidoAlumno;
    @XmlElement(name = "cargo_alumno")
    protected String cargoAlumno;
    @XmlElement(name = "ciudad_alumno")
    protected String ciudadAlumno;
    @XmlElement(name = "estado_alumno")
    protected String estadoAlumno;
    @XmlElement(name = "id_Alumno")
    protected int idAlumno;
    @XmlElement(name = "nomnre_alumno")
    protected String nomnreAlumno;

    /**
     * Obtiene el valor de la propiedad apellidoAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    /**
     * Define el valor de la propiedad apellidoAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoAlumno(String value) {
        this.apellidoAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoAlumno() {
        return cargoAlumno;
    }

    /**
     * Define el valor de la propiedad cargoAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoAlumno(String value) {
        this.cargoAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadAlumno() {
        return ciudadAlumno;
    }

    /**
     * Define el valor de la propiedad ciudadAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadAlumno(String value) {
        this.ciudadAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoAlumno() {
        return estadoAlumno;
    }

    /**
     * Define el valor de la propiedad estadoAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoAlumno(String value) {
        this.estadoAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad idAlumno.
     * 
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * Define el valor de la propiedad idAlumno.
     * 
     */
    public void setIdAlumno(int value) {
        this.idAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad nomnreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomnreAlumno() {
        return nomnreAlumno;
    }

    /**
     * Define el valor de la propiedad nomnreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomnreAlumno(String value) {
        this.nomnreAlumno = value;
    }

}
