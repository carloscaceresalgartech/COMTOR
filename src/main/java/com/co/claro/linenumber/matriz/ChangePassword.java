/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.claro.linenumber.matriz;

/**
 *
 * @author Carlos Caceres
 */
public class ChangePassword {
    private String result;
    private String response;
    
    

    public ChangePassword(String result, String response) {
        this.result = result;
        this.response = response;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ChangePassword{" + "result=" + result + ", response=" + response + '}';
    }
    
    
}
