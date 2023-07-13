/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author mbp_jay
 */
public class Estudiante {
    private String nombre;
    public String apellido;
    public int edad;
    
    public Estudiante(){
    }
    
    public Estudiante(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //Setters    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}
