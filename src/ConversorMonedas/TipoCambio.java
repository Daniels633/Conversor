package ConversorMonedas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;


public class TipoCambio {
	public static double getTipoCambio(String monedaCambio) {
        double cambio = 0;
        try{
        URL url = new URL("https://v6.exchangerate-api.com/v6/3835fd102c7d3bc71188455d/latest/PEN");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();
        if(responseCode != 200){
            throw new RuntimeException("Ocurrio un error" + responseCode);
        } else{
            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                informationString.append(scanner.nextLine());   
            }
            scanner.close();
            JSONObject jsonObject = new JSONObject(informationString.toString());
            JSONObject rates = jsonObject.getJSONObject("conversion_rates");
            String tasa = rates.get(monedaCambio).toString();
            cambio = Double.parseDouble(tasa);
        }
        } catch (Exception e){
            e.printStackTrace();
        }
        return cambio;    
    }     
}
