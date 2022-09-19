/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.co.claro.linenumber.matriz;

import com.co.claro.linenumber.matriz.Resultado;
import com.co.claro.linenumber.matriz.MatrizTelefonia;
import java.io.IOException;
import java.net.ProtocolException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Caceres
 */
@WebService(serviceName = "WebServiceMatrizTelefonia")
public class WebServiceMatrizTelefonia {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "matriztelefonia")
    public Resultado resultado(@WebParam(name = "data") String data) throws ProtocolException, IOException {
       MatrizTelefonia matriz = new MatrizTelefonia();
       return matriz.getMatrizTelefonia(data);
    }
}
