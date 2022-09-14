
package com.co.claro.linenumber.matriz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="call_out_right_group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultado", propOrder = {
    "callOutRightGroup",
    "impi",
    "lineNumber",
    "status"
})
public class Resultado {

    @XmlElement(name = "call_out_right_group")
    protected String callOutRightGroup;
    protected String impi;
    protected String lineNumber;
    protected String status;

    /**
     * Obtiene el valor de la propiedad callOutRightGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallOutRightGroup() {
        return callOutRightGroup;
    }

    /**
     * Define el valor de la propiedad callOutRightGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallOutRightGroup(String value) {
        this.callOutRightGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad impi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpi() {
        return impi;
    }

    /**
     * Define el valor de la propiedad impi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpi(String value) {
        this.impi = value;
    }

    /**
     * Obtiene el valor de la propiedad lineNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Define el valor de la propiedad lineNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
