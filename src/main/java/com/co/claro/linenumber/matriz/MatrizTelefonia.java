/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.claro.linenumber.matriz;

import com.claro.util.config.Config;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author Carlos Caceres
 */
public class MatrizTelefonia {

    public Resultado getMatrizTelefonia(String data) throws  MalformedURLException, ProtocolException, IOException {
        URL url = new URL("http://"+Config.urlComtor()+"/TelmexImsDev2020/ws/v1/checkStatusImsUser");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Hash-Key", "3BZgCq2VfZ3HE6gsf3XYYotCthpbROOtPbsWwxaG91E=");
        con.setRequestProperty("Timestamp", "1660149710");
        con.getOutputStream().write(data.getBytes("UTF-8"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        JSONTokener tokener = new JSONTokener(reader);
        JSONObject json = new JSONObject(tokener);
        String str = json.toString();
        if (str.indexOf("error_code") > 0) {
            return new Resultado(data, "No existe","No existe","No existe");
        } else {
            System.out.println(str);
            str = str.split("\"response\":")[1];
            String salida = str.substring(0, str.length() - 1);
            System.out.println(salida);
            String call_out_right_group = salida.split("\"call_out_right_group\":\"")[1].split("\",\"dn\"")[0];
            String impi = salida.split("\"impi\":\"")[1].split("@ims")[0];
            String status = salida.split("\"status\":\"")[1].split("\"}")[0];
            System.out.println(call_out_right_group);
            System.out.println(impi);
            System.out.println(status);
            return new Resultado(data, call_out_right_group, status, impi);
        }
    }
}
