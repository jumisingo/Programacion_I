/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class ArreglosMultidimensinoales {
    
    public static void main(String[]args){
        
        int umbral = 2;
        int limite = 4;
        int numeral = 0;
        double codigos[][];
        codigos = new double[limite][umbral];
        
        
        //dimension 1
        for(int contador = 0; contador < limite; contador++){
            //dimension 2
            for( int contadorInterno = 0; contadorInterno< umbral; contadorInterno++ ){
                codigos[contador][contadorInterno] =   numeral++;
                
                
                 //lectura de datos               
                int modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el maximo de edad"));
                codigos[contador][contadorInterno] =  contador+contadorInterno; 
                
                //escritura
                System.out.println("Array["+contador+"]["+contadorInterno+"] = " +codigos[contador][contadorInterno] );
                
            }
        }
        
    }
}
