package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	public void ConversorSolesADolares(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) * TipoCambio.getTipoCambio("USD"));
        JOptionPane.showMessageDialog(null, "Tienes: $ " + conversion + " Dólares");
    }
    
    public void ConversorSolesAEuros(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) * TipoCambio.getTipoCambio("EUR"));
        JOptionPane.showMessageDialog(null, "Tienes: € " + conversion + " Euros");
    }
    
    public void ConversorSolesALibrasEsterlinas(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) * TipoCambio.getTipoCambio("GBP"));
        JOptionPane.showMessageDialog(null, "Tienes: £ " + conversion + " Libras Esterlinas");
    }
    
    public void ConversorSolesAYenJapones(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) * TipoCambio.getTipoCambio("JPY"));
        JOptionPane.showMessageDialog(null, "Tienes: ¥ " + conversion + " Yenes Japoneses");
    }
    
    public void ConversorSolesAWonCoreano(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) * TipoCambio.getTipoCambio("KRW"));
        JOptionPane.showMessageDialog(null, "Tienes: ₩ " + conversion + " Wones Coreanos");
    }
    
    public void ConversorDolaresASoles(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) / TipoCambio.getTipoCambio("USD"));
        JOptionPane.showMessageDialog(null, "Tienes: S/ " + conversion + " Soles");
    }
    
    public void ConversorEurosASoles(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) / TipoCambio.getTipoCambio("EUR"));
        JOptionPane.showMessageDialog(null, "Tienes: S/ " + conversion + " Soles");
    }
    
    public void ConversorLibrasEsterlinasASoles(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) / TipoCambio.getTipoCambio("GBP"));
        JOptionPane.showMessageDialog(null, "Tienes: S/ " + conversion + " Soles");
    }
    
    public void ConversorYenesJaponesesASoles(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) / TipoCambio.getTipoCambio("JPY"));
        JOptionPane.showMessageDialog(null, "Tienes: S/ " + conversion + " Soles");
    }
    
    public void ConversorWonesCoreanoASoles(String cantidad){
        double conversion = Math.round(Double.parseDouble(cantidad) / TipoCambio.getTipoCambio("KRW"));
        JOptionPane.showMessageDialog(null, "Tienes: S/ " + conversion + " Soles");
    }
}
