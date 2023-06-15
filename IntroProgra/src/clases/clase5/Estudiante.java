/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Estudiante {
    
    public static void main(String[] args){
        
        Estudiante estudiante = new Estudiante();     
        estudiante.carrera = new Carrera();
        
        estudiante.ImprimeEstudianteConsola();
        
        //estudiante.DevolverAtributosCarrera();
    }
    
    public String NombreCompleto;
    public int CreditosAprobados;
    public Carrera carrera;
    
    
    public void ImprimeEstudianteConsola(){
        System.out.println("Estudiante:");
        System.out.println("Nombre Completo: "+ NombreCompleto);
        System.out.println("Creditos aprobados: "+CreditosAprobados); 
        System.out.println(carrera.DevolverAtributosCarrera());
        
        String passwordActual = JOptionPane.showInputDialog("Ingrese el pw actual.");
        String passwordNuevo = JOptionPane.showInputDialog("Ingrese el pw nuevo.");
        
        //Ejemplo atributo privado, debido a restriccion
        Boolean validacionSucedio = carrera.CambiarPassword(passwordActual, passwordNuevo);
        var valorPassword = carrera.LeerPassword();
        
        
        JOptionPane.showMessageDialog(null, validacionSucedio+" "+valorPassword);
    }
   
}
