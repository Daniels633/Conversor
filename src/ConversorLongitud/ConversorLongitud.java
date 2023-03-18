package ConversorLongitud;

import javax.swing.JOptionPane;

public class ConversorLongitud {
	public void MetrosAKilometros(String valor){
        double conversion = Double.parseDouble(valor) / 1000;
        JOptionPane.showMessageDialog(null, valor + " metros son " + conversion + " kilómetros");
    }
    
    public void MetrosACentimetros(String valor){
        double conversion = Double.parseDouble(valor) * 100;
        JOptionPane.showMessageDialog(null, valor + " metros son " + conversion + " centrímetros");
    }
    
    public void MetrosAPies(String valor){
        double conversion = Double.parseDouble(valor) * 3.281;
        JOptionPane.showMessageDialog(null, valor + " metros son " + conversion + " pies");
    }
    
    public void MetrosAPulgadas(String valor){
        double conversion = Double.parseDouble(valor) * 39.37;
        JOptionPane.showMessageDialog(null, valor + " metros son " + conversion + " pulgadas");
    }
    
    public void KilometrosAMillas(String valor){
        double conversion = Double.parseDouble(valor) / 1.609;
        JOptionPane.showMessageDialog(null, valor + " kilómetros son " + conversion + " millas");
    }
    
    public void KilometrosAYardas(String valor){
        double conversion = Double.parseDouble(valor) * 1094;
        JOptionPane.showMessageDialog(null, valor + " kilómetros son " + conversion + " yardas");
    }
}
