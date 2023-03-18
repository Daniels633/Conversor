package ConversorMonedas;

import javax.swing.JOptionPane;

public class ElegirTipoCambio {
	ConversorMonedas conversormonedas = new ConversorMonedas();
    public void ElegirMoneda(String cantidad){
        String cambio = JOptionPane.showInputDialog(null,"Elije la moneda a la que quieres convertir tu dinero","Monedas", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras Esterlinas", "De Soles a Yen Japonés", "De Soles a Won Coreano", "De Dólares a Soles", "De Euros a Soles", "De Libras Esterlinas a Soles", "De Yen Japonés a Soles", "De Yen Japonés a Soles", "De Won Coreano a Soles"},"De Soles a Dólares").toString();
        switch(cambio){
            case "De Soles a Dólares":
                conversormonedas.ConversorSolesADolares(cantidad);
            break;
            case "De Soles a Euros":
                conversormonedas.ConversorSolesAEuros(cantidad);
            break;
            case "De Soles a Libras Esterlinas":
                conversormonedas.ConversorSolesALibrasEsterlinas(cantidad);
            break;
            case "De Soles a Yen Japonés":
                conversormonedas.ConversorSolesAYenJapones(cantidad);
            break;
            case "De Soles a Won Coreano":
                conversormonedas.ConversorSolesAWonCoreano(cantidad);
            break;
            case "De Dólares a Soles":
                conversormonedas.ConversorDolaresASoles(cantidad);
            break;
            case "De Euros a Soles":
                conversormonedas.ConversorEurosASoles(cantidad);
            break;
            case "De Libras Esterlinas a Soles":
                conversormonedas.ConversorLibrasEsterlinasASoles(cantidad);
            break;
            case "De Yen Japonés a Soles":
                conversormonedas.ConversorYenesJaponesesASoles(cantidad);
            break;
            case "De Won Coreano a Soles":
                conversormonedas.ConversorWonesCoreanoASoles(cantidad);
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
