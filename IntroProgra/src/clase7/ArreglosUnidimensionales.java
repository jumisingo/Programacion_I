/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author mbp_jay
 */
public class ArreglosUnidimensionales {
    public static void main(String[] args){
    
        //declaracion de arreglo edad
        int edad[];
        
        //inicializacion de arreglo
        edad = new int[5];
        
        //asigna el valor 2023 al indice 0 del array edad.
        edad[0] = 2023;
        
        //asigna el valor 2024 al indice 1 del array edad.
        edad[1] = 2024;
        edad[2] = 2025;
        edad[3] = 2026;
        edad[4] = 2027;
        
        
        
        
        //Ejercicio numero 2
        //recrear array edad
        int tamano = 5;
        
        edad = new int[tamano];
        
        //asignar valor al array.
        for (int indice = 0; indice < tamano; indice++ ){
            //asigna el valor
            edad[indice] = indice + 10;
            
            //imprime en consola
            System.out.println(" edad[Indice: "+indice+"] = "+edad[indice]);
        }
        
        
        
        //Ejercicio numero 3
        //Leer valores de un array por medio de ciclos.
        for(int indice = 0; indice < tamano; indice++ ){
            System.out.println("Edad:" + edad[indice]);
        }
        
        
        
        //Ejercicio Numero 4
        //Con metodos
        //Juan necesita guardar todos los carros que tiene en inventario y 
        //va a crear en la base de datos un registro por cada año de modelo.
        //Los ultimos diez años y el maximo sera de diez anios adelante.
        
        
        int anioMinimo = 2013, anioMaximo = 2033;
        int modelos[] = new int[20];
        
        
        llenaArray(anioMinimo, anioMaximo, modelos);
        
        leeArray(modelos);
        
    }

    
    public static void llenaArray( int anioMinimo, int anioMaximo, int[] modelos){
        int tamano = anioMaximo - anioMinimo;
        for (int indice = 0; indice < tamano; indice++ ){
            //asigna el valor
            modelos[indice] = anioMinimo + indice;
        }
    }
    
    public static void leeArray(int[] modelos){
        for(int indice = 0; indice < modelos.length; indice++ ){
            System.out.println("Modelo:" + modelos[indice]);
        }
    }
}
