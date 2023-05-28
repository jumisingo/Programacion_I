/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //Impuesto a las ventas
        int impuesto;
        impuesto = 26;
        
        String universidad = "Universidad Fidelitas";
        char inicial = 'F';
        
        float tipoDeCambio = 541.78888f;
        double temperatura = 21.7;
        
        JOptionPane dialogo;
        dialogo = new JOptionPane();
        
        //String edad = JOptionPane.showInputDialog("Ingrese su edad");
        
        //int edadPersona = Integer.parseInt(edad);
        
        //JOptionPane.showInputDialog(edad);
        
        
        String lecturaSalarioUsuario = JOptionPane.showInputDialog("Ingrese su salario.");
        var salario = Double.parseDouble(lecturaSalarioUsuario);
        
        
        
        JOptionPane.showMessageDialog(null, lecturaSalarioUsuario);
        
        
        
        // Semana 02.
        
        if(1==1){
            //true
        }
        
        if( 1<2){
            //true
        }
        
        if(1<=1){
            //true
        }
        
        if(2>1){
            //true
        }
        
        if(2>=2){
            //true
        }
        
        int i =5;
        if(i<10){
            //true
        }
        
        if(i>0){
            //true
        }
        
        if(i>0 && i<10 && i<5){
            //si i = 3 el resultado es true
            //si i = 6 el resultado es false
        }
        
        if(i<0 || i<10 || i<5){
            //si i = 9 el resultado es true
            //si i = -1 el resultado es true
            //si i = 11 el resultado es false    
        }
        
        boolean presente = false;
        presente = !presente;
        
        
    }
    
}
