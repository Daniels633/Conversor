package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ElegirTemperatura {
	ConversorTemperatura conversortemperatura = new ConversorTemperatura();
    public void ElegirEscala(String grados){
        String cambio = JOptionPane.showInputDialog(null,"Elija una opción para convertir","Temperatura", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"De Grados Celcius a Grados Fahrenheit", "De Grados Celcius a Grados Kelvin", "De Grados Fahrenheit a Grados Celcius", "De Grados Fahrenheit a Grados Kelvin", "De Grados Kelvin a Grados Celcius", "De Grados Kelvin a Grados Fahrenheit"},"De Grados Celcius a Grados Fahrenheit").toString();
        switch(cambio){
            case "De Grados Celcius a Grados Fahrenheit":
                conversortemperatura.CelciusAFahrenheit(grados);
            break;
            case "De Grados Celcius a Grados Kelvin":
                conversortemperatura.CelciusAKelvin(grados);
            break;
            case "De Grados Fahrenheit a Grados Celcius":
                conversortemperatura.FahrenheitACelcius(grados);
            break;
            case "De Grados Fahrenheit a Grados Kelvin":
                conversortemperatura.FahrenheitAKelvin(grados);
            break;
            case "De Grados Kelvin a Grados Celcius":
                conversortemperatura.KelvinACelcius(grados);
            break;
            case "De Grados Kelvin a Grados Fahrenheit":
                conversortemperatura.KelvinAFahrenheit(grados);
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
