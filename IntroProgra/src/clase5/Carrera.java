/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author mbp_jay
 */
public class Carrera {
    public String nombreCarrera;
    public int cantidadCreditos;
    public boolean esAcreditada;
    private String password = "prueba";
     
    public String DevolverAtributosCarrera(){
        return "Carrera: \n  Nombre carrera:"+nombreCarrera+", Cantidad de creditos: "+cantidadCreditos+", Es acreditada?: "+esAcreditada;
    }
    
    public boolean CambiarPassword(String passwordActual, String passwordNuevo){
        if(password.equals(passwordActual)){
            //Restringido
            password = passwordNuevo;
            return true;
        }
        return false;
    }
    
    public String LeerPassword(){
        //aunque el atributo password es privado
        //creamos un metodo para poder acceder a el.
        return password;
    }
}
