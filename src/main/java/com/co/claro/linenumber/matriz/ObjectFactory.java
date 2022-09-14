
package com.co.claro.linenumber.matriz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.co.claro.linenumber.matriz package. 
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

    private final static QName _ProtocolException_QNAME = new QName("http://matriz.linenumber.claro.co.com/", "ProtocolException");
    private final static QName _Matriztelefonia_QNAME = new QName("http://matriz.linenumber.claro.co.com/", "matriztelefonia");
    private final static QName _MatriztelefoniaResponse_QNAME = new QName("http://matriz.linenumber.claro.co.com/", "matriztelefoniaResponse");
    private final static QName _IOException_QNAME = new QName("http://matriz.linenumber.claro.co.com/", "IOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.co.claro.linenumber.matriz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtocolException }
     * 
     */
    public ProtocolException createProtocolException() {
        return new ProtocolException();
    }

    /**
     * Create an instance of {@link Matriztelefonia }
     * 
     */
    public Matriztelefonia createMatriztelefonia() {
        return new Matriztelefonia();
    }

    /**
     * Create an instance of {@link MatriztelefoniaResponse }
     * 
     */
    public MatriztelefoniaResponse createMatriztelefoniaResponse() {
        return new MatriztelefoniaResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Resultado }
     * 
     */
    public Resultado createResultado() {
        return new Resultado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.linenumber.claro.co.com/", name = "ProtocolException")
    public JAXBElement<ProtocolException> createProtocolException(ProtocolException value) {
        return new JAXBElement<ProtocolException>(_ProtocolException_QNAME, ProtocolException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Matriztelefonia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.linenumber.claro.co.com/", name = "matriztelefonia")
    public JAXBElement<Matriztelefonia> createMatriztelefonia(Matriztelefonia value) {
        return new JAXBElement<Matriztelefonia>(_Matriztelefonia_QNAME, Matriztelefonia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatriztelefoniaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.linenumber.claro.co.com/", name = "matriztelefoniaResponse")
    public JAXBElement<MatriztelefoniaResponse> createMatriztelefoniaResponse(MatriztelefoniaResponse value) {
        return new JAXBElement<MatriztelefoniaResponse>(_MatriztelefoniaResponse_QNAME, MatriztelefoniaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://matriz.linenumber.claro.co.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

}
