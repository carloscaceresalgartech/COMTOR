/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.claro.comtor.matriz;

import com.co.claro.linenumber.matriz.ChangePassword;
import com.co.claro.linenumber.matriz.ChangePasswordVoiceIp;
import java.io.IOException;
import java.net.ProtocolException;

/**
 *
 * @author Carlos Caceres
 */
public class Incidencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.net.ConnectException,ProtocolException, IOException {
        // TODO code application logic here
        ChangePasswordVoiceIp c = new ChangePasswordVoiceIp();
        ChangePassword changePassword = c.changePassword("+576017459700");
        String numIncidencia = changePassword.getResponse();
       // String numIncidencia="241794";
        System.out.println("Procesando.....");
        delay(10000L);
        String response = c.changeStatusPassword(numIncidencia);
        if(response.equals("Finished")){
            System.out.println("OK");
        }
        else{
            System.out.println("timeout");
        }
        
    }

    public static void delay(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
