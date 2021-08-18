
package wservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Agregar_QNAME = new QName("http://services.ws/", "Agregar");
    private final static QName _AgregarResponse_QNAME = new QName("http://services.ws/", "AgregarResponse");
    private final static QName _ListarID_QNAME = new QName("http://services.ws/", "ListarID");
    private final static QName _ListarIDResponse_QNAME = new QName("http://services.ws/", "ListarIDResponse");
    private final static QName _Editar_QNAME = new QName("http://services.ws/", "editar");
    private final static QName _EditarResponse_QNAME = new QName("http://services.ws/", "editarResponse");
    private final static QName _Eliminar_QNAME = new QName("http://services.ws/", "eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://services.ws/", "eliminarResponse");
    private final static QName _Lista_QNAME = new QName("http://services.ws/", "lista");
    private final static QName _ListaResponse_QNAME = new QName("http://services.ws/", "listaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link ListarID }
     * 
     */
    public ListarID createListarID() {
        return new ListarID();
    }

    /**
     * Create an instance of {@link ListarIDResponse }
     * 
     */
    public ListarIDResponse createListarIDResponse() {
        return new ListarIDResponse();
    }

    /**
     * Create an instance of {@link Editar }
     * 
     */
    public Editar createEditar() {
        return new Editar();
    }

    /**
     * Create an instance of {@link EditarResponse }
     * 
     */
    public EditarResponse createEditarResponse() {
        return new EditarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Lista }
     * 
     */
    public Lista createLista() {
        return new Lista();
    }

    /**
     * Create an instance of {@link ListaResponse }
     * 
     */
    public ListaResponse createListaResponse() {
        return new ListaResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "Agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "AgregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "ListarID")
    public JAXBElement<ListarID> createListarID(ListarID value) {
        return new JAXBElement<ListarID>(_ListarID_QNAME, ListarID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "ListarIDResponse")
    public JAXBElement<ListarIDResponse> createListarIDResponse(ListarIDResponse value) {
        return new JAXBElement<ListarIDResponse>(_ListarIDResponse_QNAME, ListarIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "editar")
    public JAXBElement<Editar> createEditar(Editar value) {
        return new JAXBElement<Editar>(_Editar_QNAME, Editar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "editarResponse")
    public JAXBElement<EditarResponse> createEditarResponse(EditarResponse value) {
        return new JAXBElement<EditarResponse>(_EditarResponse_QNAME, EditarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "eliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "lista")
    public JAXBElement<Lista> createLista(Lista value) {
        return new JAXBElement<Lista>(_Lista_QNAME, Lista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.ws/", name = "listaResponse")
    public JAXBElement<ListaResponse> createListaResponse(ListaResponse value) {
        return new JAXBElement<ListaResponse>(_ListaResponse_QNAME, ListaResponse.class, null, value);
    }

}
