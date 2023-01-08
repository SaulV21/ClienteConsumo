
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _Dibujo_QNAME = new QName("http://sw/", "Dibujo");
    private final static QName _DibujoResponse_QNAME = new QName("http://sw/", "DibujoResponse");
    private final static QName _Diccionario_QNAME = new QName("http://sw/", "Diccionario");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sw/", "DiccionarioResponse");
    private final static QName _Nombre_QNAME = new QName("http://sw/", "Nombre");
    private final static QName _NombreResponse_QNAME = new QName("http://sw/", "NombreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dibujo }
     * 
     */
    public Dibujo createDibujo() {
        return new Dibujo();
    }

    /**
     * Create an instance of {@link DibujoResponse }
     * 
     */
    public DibujoResponse createDibujoResponse() {
        return new DibujoResponse();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link Nombre }
     * 
     */
    public Nombre createNombre() {
        return new Nombre();
    }

    /**
     * Create an instance of {@link NombreResponse }
     * 
     */
    public NombreResponse createNombreResponse() {
        return new NombreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dibujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dibujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Dibujo")
    public JAXBElement<Dibujo> createDibujo(Dibujo value) {
        return new JAXBElement<Dibujo>(_Dibujo_QNAME, Dibujo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DibujoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DibujoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DibujoResponse")
    public JAXBElement<DibujoResponse> createDibujoResponse(DibujoResponse value) {
        return new JAXBElement<DibujoResponse>(_DibujoResponse_QNAME, DibujoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "DiccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Nombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "Nombre")
    public JAXBElement<Nombre> createNombre(Nombre value) {
        return new JAXBElement<Nombre>(_Nombre_QNAME, Nombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "NombreResponse")
    public JAXBElement<NombreResponse> createNombreResponse(NombreResponse value) {
        return new JAXBElement<NombreResponse>(_NombreResponse_QNAME, NombreResponse.class, null, value);
    }

}
