/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.claro.comtor.matriz;

import com.co.claro.linenumber.matriz.IOException_Exception;
import com.co.claro.linenumber.matriz.ProtocolException_Exception;
import com.co.claro.linenumber.matriz.Resultado;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Caceres
 */
@WebService(serviceName = "RegistroVoiceIp")
public class RegistroVoiceIp {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public List<Resultado> matrizVoiceIp(@WebParam(name = "serial") String serial) throws IOException_Exception, ProtocolException_Exception {
        return new MatrizVoiceIp().voiceIpMatriz(serial);
    }
}
