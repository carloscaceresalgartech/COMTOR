/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.claro.comtor.matriz;

import com.co.claro.linenumber.matriz.IOException_Exception;
import com.co.claro.linenumber.matriz.ProtocolException_Exception;
import com.co.claro.linenumber.matriz.Resultado;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Caceres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 /*
      
       registroVoiceIp(serial);
   */
     String serial = "ZTENQAJK9402500";
     List<String> lineas = getLineNumber(serial);
     List<Resultado> informacion = new ArrayList<>();
     for(String linea:lineas){
          System.out.println(linea);
      /*   try {
             System.out.println(linea);
             informacion.add(registroVoiceIp(linea));
         } catch (IOException_Exception ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ProtocolException_Exception ex) {
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
         }
*/
     }   
    }
    
    public static Resultado registroVoiceIp(String data) throws IOException_Exception, ProtocolException_Exception{
               
            com.co.claro.linenumber.matriz.WebServiceMatrizTelefonia_Service service = new com.co.claro.linenumber.matriz.WebServiceMatrizTelefonia_Service();
            com.co.claro.linenumber.matriz.WebServiceMatrizTelefonia port = service.getWebServiceMatrizTelefoniaPort();
            // TODO initialize WS operation arguments here
            // TODO process result here
            com.co.claro.linenumber.matriz.Resultado result = port.matriztelefonia(data);
            System.out.println("Result = "+result.toString());
            return result;
       }
    
    public static java.util.List<java.lang.String> getLineNumber(String serial){
        
            com.co.claro.linenumber.LineNumberService_Service service = new com.co.claro.linenumber.LineNumberService_Service();
            com.co.claro.linenumber.LineNumberService port = service.getLineNumberServicePort();
            // TODO initialize WS operation arguments here
             // TODO process result here
            java.util.List<java.lang.String> result = port.getLineNumbers(serial);
            System.out.println("Result = "+result);
            return result;
        
    }
    
}
