/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.co.claro.linenumber.matriz;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
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
        MatrizTelefonia matriz = new MatrizTelefonia();
        try {
            matriz.getMatrizTelefonia("+57248544462");
        } catch (ProtocolException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    
}
