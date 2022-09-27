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
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author Carlos Caceres
 */
public class ChangePasswordVoiceIp {

    public ChangePassword changePassword(String data) throws MalformedURLException, ProtocolException, IOException {
        URL url = new URL("http://" + Config.urlComtor() + "/TelmexImsDev2020/ws/v1/passChangeImsUser");
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
        System.out.println(str);
        if (str.indexOf("error_code") > 0) {
            System.out.println("Numero telefonico no encontrado");
            return new ChangePassword("Sin datos", "Sin datos");
        } else {
            String result = str.split("\"result\":")[1].split("\",\"response\"")[0].substring(1);
            String respuesta = str.split("\"response\":")[1].split("\"}")[0].substring(1);
            System.out.println(result);
            System.out.println(respuesta);
            return new ChangePassword(result, respuesta);
        }
    }

}
