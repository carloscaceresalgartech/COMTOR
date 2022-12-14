/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.co.claro.linenumber.matriz;

import static com.claro.comtor.matriz.Incidencia.delay;
import com.claro.comtor.matriz.MatrizVoiceIp;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
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

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "matrizvoiceip")
    public List<Resultado> matrizVoiceIp(@WebParam(name = "serial") String serial) throws ProtocolException, IOException {
        List<Resultado> matrizV = new ArrayList<>();
        MatrizVoiceIp matriz = new MatrizVoiceIp();
        List<String> lineas = matriz.getLineNumber(serial);
        System.out.println("*****************************************************");
        for (String linea : lineas) {
            Resultado r = matriz.registroVoiceIp(linea);
            if (!r.getImpi().equalsIgnoreCase("No existe")) {
                System.out.println("s" + r.toString());
                matrizV.add(r);
            }
        }
        System.out.println("*****************************************************");
        return matrizV;
    }

    @WebMethod(operationName = "changepassword")
    public String changePassword(@WebParam(name = "data") String data) throws ProtocolException, IOException {
              ChangePasswordVoiceIp c = new ChangePasswordVoiceIp();
        ChangePassword changePassword = c.changePassword(data);
        String numIncidencia = changePassword.getResponse();
       // String numIncidencia="241794";
        System.out.println("Procesando.....");
        delay(10000L);
        String response = c.changeStatusPassword(numIncidencia);
        if(response.equals("Finished")){
            return "OK";
        }
        else{
            return "ERROR";
        }
    }

}
