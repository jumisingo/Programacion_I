
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author mbp_jay
 */
public class EjercicioIntegrador {

    public static void main(String[] args) {
        //Registrar facturas por mes (Nombre,fecha(string), monto, impuesto
        //Consolidado de ventas e  impuesto por mes
        //Calcular renta (5,10,15,20%)
        
        JOptionPane.showMessageDialog(null, "Bienvenido a Sistema de Facturacion");
        String entrada = JOptionPane.showInputDialog("Para insertar factura por favor ingrese la palabra 'facturar'. \n Para salir ingrese la palabra 'salir'.");
        Boolean terminarProceso =false;
        
        MesFacturado[] AñoFacturacion = new MesFacturado[12];
        do{
            switch(entrada){
                case "Salir":
                    terminarProceso = true;
                    break;
                case "Facturar":
                    //logica para crear factura o leer factura
                    break;
                case "Renta":
                    //logica para recorrer los meses y calcular la facturación.
            }
                    
            //Termina proceso si la variable de validacion es falsa
        }while(!terminarProceso);
          
        
        
    }
}
