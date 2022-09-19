/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.claro.linenumber.matriz;

/**
 *
 * @author Carlos Caceres
 */
public class Resultado {
    private String lineNumber;
    private String call_out_right_group;
    private String status;
    private String impi;

    public Resultado(String call_out_right_group, String status, String impi) {
        this.call_out_right_group = call_out_right_group;
        this.status = status;
        this.impi = impi;
    }

    public Resultado(String lineNumber, String call_out_right_group, String status, String impi) {
        this.lineNumber = lineNumber;
        this.call_out_right_group = call_out_right_group;
        this.status = status;
        this.impi = impi;
    }
    
    

    public String getCall_out_right_group() {
        return call_out_right_group;
    }

    public void setCall_out_right_group(String call_out_right_group) {
        this.call_out_right_group = call_out_right_group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImpi() {
        return impi;
    }

    public void setImpi(String impi) {
        this.impi = impi;
    }

    @Override
    public String toString() {
        return "Resultado{" + "call_out_right_group=" + call_out_right_group + ", status=" + status + ", impi=" + impi + '}';
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
    
}
