package ConversorLongitud;

import javax.swing.JOptionPane;

public class ElegirLongitud {
	public void ElegirMedida(String valor){
        ConversorLongitud conversorlongitud = new ConversorLongitud();
        String cambio = JOptionPane.showInputDialog(null,"Elija una opción para convertir","Longitud", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"De Metros a Kilómetros", "De Metros a Centímetros", "De Metros a Pies", "De Metros a Pulgadas", "De Kilometros a Millas", "De Kilometros a Yardas"},"De Metros a Kilometros").toString();
        switch(cambio){
            case "De Metros a Kilómetros":
                conversorlongitud.MetrosAKilometros(valor);
            break;
            case "De Metros a Centímetros":
                conversorlongitud.MetrosACentimetros(valor);
            break;
            case "De Metros a Pies":
                conversorlongitud.MetrosAPies(valor);
            break;
            case "De Metros a Pulgadas":
                conversorlongitud.MetrosAPulgadas(valor);
            break;
            case "De Kilometros a Millas":
                conversorlongitud.KilometrosAMillas(valor);
            break;
            case "De Kilometros a Yardas":
                conversorlongitud.KilometrosAYardas(valor);
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
