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
public class Ejercicios {
    public static void main(String[] args){
        
        int dimensionA, dimensionB;
        dimensionA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano la dimension A: "));
        dimensionB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de la dimension B: "));
        
        int suma = 0;
        //llenar los datos de el arreglo
        int arreglo[][] = new int[dimensionA][dimensionB];
        for(int contador = 0; contador < dimensionA; contador++){
            //dimension 2
            for( int contadorInterno = 0; contadorInterno< dimensionB; contadorInterno++ ){
                arreglo[contador][contadorInterno] = contadorInterno+contador;
                
                
                 //lectura de datos               
                int modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el maximo de edad"));
                arreglo[contador][contadorInterno] =  contador+contadorInterno; 
                
                //escritura
                System.out.println("Array["+contador+"]["+contadorInterno+"] = " +arreglo[contador][contadorInterno] );
                
            }
        }
        
        
        //sumar los datos del arreglo.
        for(int contador =0;contador<dimensionA; contador++ ){
            for(int contadorInterno = 0 ; contadorInterno < dimensionB; contadorInterno++ ){
                //arreglo[][]
                
                //seleccion de las esquinas a sumar
                //[0] [0], [0] [maximo], [maximo] [0], [maximo] [maximo]
                if(contador == 0 && contadorInterno == 0 || contador == 0 && contadorInterno == (dimensionB-1) || contador == (dimensionA) && contadorInterno == (dimensionB-1) || contador == dimensionA && contadorInterno == (dimensionB-1)){
                //Suma el valor unicamente si es una de las 4 esquinas en el arreglo.
                    suma += arreglo[contador][contadorInterno];
                }
            }
                
        }
        System.out.println(suma);
    }         
}
