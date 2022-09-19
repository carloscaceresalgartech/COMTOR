/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.claro.util.config;

/**
 *
 * @author Carlos Caceres
 */
public class Config {
    
    public static String urlDev ="localhost:9093";
    public static String urlProd ="172.31.238.37";
    public static int mode = 1;
    
    public static String urlComtor(){
        return (mode == 0)?urlDev:urlProd;
    }
    
}
