package Control;

import javax.swing.JOptionPane;

import ConversorLongitud.ElegirLongitud;
import ConversorMonedas.ElegirTipoCambio;
import ConversorTemperatura.ElegirTemperatura;

public class Comprobar {
	public boolean isNumericMoneda(String s){
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '-') {
                JOptionPane.showMessageDialog(null, "No se aceptan números negativos, ingreselo de nuevo");
                return false;
            }
        }
        try {
            double x = Double.parseDouble(s);
            if(x >= 0);
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se aceptan caracteres no numéricos, ingreselo de nuevo");
            return false;
        }
    }
    
    public boolean isNumericTemperatura(String s){
        try {
            double x = Double.parseDouble(s);
            if(x >= 0 || x <0 );
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se aceptan caracteres no numéricos, ingreselo de nuevo");
            return false;
        }
        
    }
    
    public boolean ComprobarSeleccionMoneda(){
        ElegirTipoCambio elegirtipocambio = new ElegirTipoCambio();
        String cantidad;
        do{
           cantidad = JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir","Input",JOptionPane.QUESTION_MESSAGE);
        } while(!isNumericMoneda(cantidad));
        elegirtipocambio.ElegirMoneda(cantidad);
        int seleccion = JOptionPane.showOptionDialog(null,"¿Desea continuar?","Selecciona una opción",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{"Yes","No","Cancel"}, "Yes");
        if (JOptionPane.OK_OPTION == seleccion){
            System.out.println("Selecciona opcion afirmativa");
        }else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            return false;
        }
        return true;
    }
    public boolean ComprobarSeleccionTemperatura(){
    	ElegirTemperatura elegirtemperatura = new ElegirTemperatura();
        String grados;
        do{
            grados = JOptionPane.showInputDialog(null,"Ingrese el valor de la temperatura que desea convertir","Input",JOptionPane.QUESTION_MESSAGE);
        } while(!isNumericTemperatura(grados));
        elegirtemperatura.ElegirEscala(grados);
        int seleccion = JOptionPane.showOptionDialog(null,"¿Desea continuar?","Selecciona una opción",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{"Yes","No","Cancel"}, "Yes");
        if (JOptionPane.OK_OPTION == seleccion){
            System.out.println("Selecciona opcion afirmativa");
        }else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            return false;
        }
        return true;
    }
    public boolean ComprobarSeleccionLongitud(){
        ElegirLongitud elegirlongitud = new ElegirLongitud();
        String valor;
        do{
            valor = JOptionPane.showInputDialog(null,"Ingrese el valor de la Longitud que desea convertir","Input",JOptionPane.QUESTION_MESSAGE);
        } while(!isNumericMoneda(valor));
        elegirlongitud.ElegirMedida(valor);
        int seleccion = JOptionPane.showOptionDialog(null,"¿Desea continuar?","Selecciona una opción",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[]{"Yes","No","Cancel"}, "Yes");
        if (JOptionPane.OK_OPTION == seleccion){
            System.out.println("Selecciona opcion afirmativa");
        }else {
            JOptionPane.showMessageDialog(null, "Programa Finalizado");
            return false;
        }
        return true;
    }
}
