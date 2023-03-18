package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public void CelciusAFahrenheit(String grados){
        double conversion = Math.round(Double.parseDouble(grados) * 1.8 + 32);
        JOptionPane.showMessageDialog(null, grados + " Grados Celcius son " + conversion + " Grados Fahrenheit");
    }
    
    public void CelciusAKelvin(String grados){
        double conversion = Math.round(Double.parseDouble(grados) + 273.15);
        JOptionPane.showMessageDialog(null, grados + " Grados Celcius son " + conversion + " Grados Kelvin");
    }
    
    public void FahrenheitACelcius(String grados){
        double conversion = Math.round(Double.parseDouble(grados) - 32 * 5/9);
        JOptionPane.showMessageDialog(null, grados + " Grados Fahrenheit son " + conversion + " Grados Celcius");
    }
    
    public void FahrenheitAKelvin(String grados){
        double conversion = Math.round(Double.parseDouble(grados) - 32 * 5/9 + 273.15);
        JOptionPane.showMessageDialog(null, grados + " Grados Fahrenheit son " + conversion + " Grados Kelvin");
    }
    
    public void KelvinACelcius(String grados){
        double conversion = Math.round(Double.parseDouble(grados) - 273.15);
        JOptionPane.showMessageDialog(null, grados + " Grados Kelvin son " + conversion + " Grados Celcius");
    }
    
    public void KelvinAFahrenheit(String grados){
        double conversion = Math.round(Double.parseDouble(grados) - 273.15 * 9/5 + 32);
        JOptionPane.showMessageDialog(null, grados + " Grados Kelvin son " + conversion + " Grados Fahrenheit");
    }
}
