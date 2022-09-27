/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.claro.comtor.matriz;

/**
 *
 * @author Carlos Caceres
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="{\"result\":\"OK\",\"response\":\"Finished\",\"message\":\"2022/09/27 14:57:27: FinalizÃ³ TransacciÃ³n Cambiar ContraseÃ±a ImsUser correctamente: \"}";
        String response=str.split("response\":\"")[1].split("\",\"message\"")[0];
        System.out.println(response);
    }
    
}
