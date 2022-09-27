
package com.co.claro.linenumber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.co.claro.linenumber package. 
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

    private final static QName _GetLineNumbers_QNAME = new QName("http://linenumber.claro.co.com/", "getLineNumbers");
    private final static QName _GetLineNumbersResponse_QNAME = new QName("http://linenumber.claro.co.com/", "getLineNumbersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.co.claro.linenumber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLineNumbersResponse }
     * 
     */
    public GetLineNumbersResponse createGetLineNumbersResponse() {
        return new GetLineNumbersResponse();
    }

    /**
     * Create an instance of {@link GetLineNumbers }
     * 
     */
    public GetLineNumbers createGetLineNumbers() {
        return new GetLineNumbers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://linenumber.claro.co.com/", name = "getLineNumbers")
    public JAXBElement<GetLineNumbers> createGetLineNumbers(GetLineNumbers value) {
        return new JAXBElement<GetLineNumbers>(_GetLineNumbers_QNAME, GetLineNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://linenumber.claro.co.com/", name = "getLineNumbersResponse")
    public JAXBElement<GetLineNumbersResponse> createGetLineNumbersResponse(GetLineNumbersResponse value) {
        return new JAXBElement<GetLineNumbersResponse>(_GetLineNumbersResponse_QNAME, GetLineNumbersResponse.class, null, value);
    }

}
