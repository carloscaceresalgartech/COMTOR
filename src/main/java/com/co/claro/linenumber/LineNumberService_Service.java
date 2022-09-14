
package com.co.claro.linenumber;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LineNumberService", targetNamespace = "http://linenumber.claro.co.com/", wsdlLocation = "http://localhost:8080/WSACS/LineNumberService?WSDL")
public class LineNumberService_Service
    extends Service
{

    private final static URL LINENUMBERSERVICE_WSDL_LOCATION;
    private final static WebServiceException LINENUMBERSERVICE_EXCEPTION;
    private final static QName LINENUMBERSERVICE_QNAME = new QName("http://linenumber.claro.co.com/", "LineNumberService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSACS/LineNumberService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LINENUMBERSERVICE_WSDL_LOCATION = url;
        LINENUMBERSERVICE_EXCEPTION = e;
    }

    public LineNumberService_Service() {
        super(__getWsdlLocation(), LINENUMBERSERVICE_QNAME);
    }

    public LineNumberService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LINENUMBERSERVICE_QNAME, features);
    }

    public LineNumberService_Service(URL wsdlLocation) {
        super(wsdlLocation, LINENUMBERSERVICE_QNAME);
    }

    public LineNumberService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LINENUMBERSERVICE_QNAME, features);
    }

    public LineNumberService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LineNumberService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LineNumberService
     */
    @WebEndpoint(name = "LineNumberServicePort")
    public LineNumberService getLineNumberServicePort() {
        return super.getPort(new QName("http://linenumber.claro.co.com/", "LineNumberServicePort"), LineNumberService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LineNumberService
     */
    @WebEndpoint(name = "LineNumberServicePort")
    public LineNumberService getLineNumberServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://linenumber.claro.co.com/", "LineNumberServicePort"), LineNumberService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LINENUMBERSERVICE_EXCEPTION!= null) {
            throw LINENUMBERSERVICE_EXCEPTION;
        }
        return LINENUMBERSERVICE_WSDL_LOCATION;
    }

}
