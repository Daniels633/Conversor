package Principal;

import javax.swing.JOptionPane;

import Control.Comprobar;

public class Principal {
	public static void main(String[] args) {
        Comprobar comprobar = new Comprobar();
        boolean flag = true;
        while(flag){
            String opcion = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","Menú", JOptionPane.PLAIN_MESSAGE,null,new Object[]{"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Longitud"},"Conversor de Monedas").toString();
            switch(opcion){
                case "Conversor de Monedas":
                    flag = comprobar.ComprobarSeleccionMoneda();
                break; 
                case "Conversor de Temperatura":
                    flag = comprobar.ComprobarSeleccionTemperatura();
                break;
                case "Conversor de Longitud":
                    flag = comprobar.ComprobarSeleccionLongitud();
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }
}
