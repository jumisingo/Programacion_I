package clases;

import javax.swing.JOptionPane;

public class Clase3 {
    public static void main(String[] args){
       
        
        //SWITCH CASE 
        if(1!=1){
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su Nombre de usuario.");
        //String nombre = "Alfonso";
        String message = "El username es: ";
        switch (nombreUsuario){
            case "juan":
                message += "juan";
                break;
            case "pedro":
                //ejecuta
                message += "pedro";
                break;
            case "alfonso":
                message+= "alfonso";
                break;
            default:
                message += "El usuario no está registrado.";
                break;
        }
        
        JOptionPane.showMessageDialog(null, message);
        }
        
        //i++
        //i--
        
        
        //FOR 
        if(1!=1){
        for (int i=10; i>=0; i--) {
            System.out.println(i); 
        }
        }
        
        //ERROR FOR
        if(1!=1){
        
        for (int i=10; i>=0; i--) {
            System.out.println(i); 
        }
         //int suma = i+2;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //WHILE
        //if(1!=1){
        
        
        
        int contador = 0;
        
        //5, 1 por cada linea
        if(1!=1){

        while(contador<5){
            String linea = "";
            //Hay 10 posiciones de caracteres, que son 10 caracteres por cada linea
            for(int posicion = 0; posicion <10; posicion++){
                linea+="@";
            }
            System.out.println(linea);
            contador++;
        }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //DO WHILE
        if(1!=1){
        int i = 10;
        do{
            System.out.println("Ciclo Numero: "+i);
            i++;
        }while(i<=10);
        }
        
        if(1!=1){
        contador =0;
        do{
            
            for(int i=10; contador<i; i--){
            System.out.println("Contador: "+contador+". I: "+i );
            }
        }while(contador <10);
        }
        
        
        
        //TAREA 
        
        //Solucion Ejercicio 1
        if(1!=1){
        contador = 0;
        do{
            for(int posicion = 0; posicion <10; posicion++){
                System.out.print("@");
            }
            System.out.println("");
            contador++;
        }while(contador<5);
        }
        
        //Solucion Ejercicio 2
        String entradaUsuario = JOptionPane.showInputDialog("Ingrese un numero.");
        int numero = Integer.parseInt(entradaUsuario);
        
        for(int i=1; i<=10; i++){
            System.out.println(numero +" X "+i+ " = "+ (numero*i));
        }
    }
}
