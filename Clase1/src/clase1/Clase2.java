/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Clase2 {
    public static void main(String[] args){
    
    
    if(1!=1){// validacion para saltar ejercicio primera mitad de clase.    

        //Calculo edad para votar.
        String lecturaUsuario = JOptionPane.showInputDialog("Por favor ingrese su edad en numeros.");
        int edad = Integer.parseInt(lecturaUsuario);

        String mensaje = "No puede votar";
        if(edad>=18){
            mensaje = "Si puede votar.";
        }
        JOptionPane.showMessageDialog(null, mensaje);



        //Calculo nota.
        lecturaUsuario = JOptionPane.showInputDialog("Por favor ingrese su nota en numeros.");
        double nota = Double.parseDouble(lecturaUsuario);
        mensaje="Reprobado.";
        if(nota>=70){
            mensaje="Aprobado.";
        }
        JOptionPane.showMessageDialog(null, mensaje);

        }
    
    
    
    //Segunda parte de la clase
    //Ejercicio A
    String lecturaUsuario = JOptionPane.showInputDialog("Ingrese el numero del dia.");
    
    int numeroDia = Integer.parseInt(lecturaUsuario);
    String nombreDia="";
    if(numeroDia==1){  
    nombreDia="Domingo";
    }else if(numeroDia == 2){
        nombreDia= "Lunes";
    }else if(numeroDia == 3){
        nombreDia = "Martes";
    }else if(numeroDia == 4){
        nombreDia = "Miercoles";
    }else if( numeroDia == 5){
        nombreDia = "Jueves";
    }else if ( numeroDia == 6){
        nombreDia = "Viernes";
    }else if( numeroDia == 7 ){
        nombreDia = "Sabado";
    }else{
        //nombreDia = "La semana solo tiene 7 dias.";
    }
    
    
    //Ejercicio B
    if ( nombreDia == "Lunes" || nombreDia == "Martes" || nombreDia == "Miercoles" || nombreDia == "Jueves" || nombreDia == "Viernes"){
         nombreDia+= " y corresponde a un dia laboral.";
    }else{ // nombreDia == "Domingo" || nombreDia == "Sabado" || else
         nombreDia += " y no es un dia laboral.";
    }
    
    String mensaje = "";
    if(numeroDia >0 && numeroDia < 8){
        mensaje = "El dia correspondiente es: "+nombreDia;
    }
    
    JOptionPane.showMessageDialog(null,mensaje);
    }
}
    


