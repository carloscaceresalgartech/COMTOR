/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.claro.comtor.matriz;

import com.co.claro.linenumber.matriz.ChangePassword;
import com.co.claro.linenumber.matriz.ChangePasswordVoiceIp;
import java.io.IOException;

/**
 *
 * @author Carlos Caceres
 */
public class MainLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     /*           MatrizVoiceIp matriz = new MatrizVoiceIp();
        List<String> lineas = matriz.getLineNumber("MG6008NW2P1901000078");
        System.out.println("*****************************************************");
        for(String linea:lineas ){
              Resultado r = matriz.registroVoiceIp(linea);
              if(!r.getImpi().equalsIgnoreCase("No existe")){
                System.out.println("s"+r.toString());
              }   
        }      
       System.out.println("*****************************************************");
        //ChangePasswordVoiceIp c = new ChangePasswordVoiceIp();
       */
     ChangePasswordVoiceIp c = new ChangePasswordVoiceIp();
     ChangePassword changePassword = c.changePassword("+576017459700");
     System.out.println(changePassword.toString());     
     String numIncidencia = changePassword.getResponse();
     System.out.println(numIncidencia);
    }

}
