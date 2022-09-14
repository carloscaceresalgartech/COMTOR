/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.claro.comtor.matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class consulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String data = "+5724854446";
            URL url = new URL("http://localhost:9093/TelmexImsDev2020/ws/v1/checkStatusImsUser");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Hash-Key", "3BZgCq2VfZ3HE6gsf3XYYotCthpbROOtPbsWwxaG91E=");
            con.setRequestProperty("Timestamp", "1660149710");
            con.getOutputStream().write(data.getBytes("UTF-8"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            System.out.println(con.getInputStream());
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();// cerrar flujo
        } catch (MalformedURLException me) {
            System.err.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.err.println("IOException:  " + ioe);
        }
    }
}
