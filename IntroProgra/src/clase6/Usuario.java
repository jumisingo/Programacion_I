/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author mbp_jay
 */
public class Usuario {
    private String password="";
    
    public String getPassword(){
        //cantidad de caracteres que tenga el atributo password
        int cantidadCaracteres = (int) password.chars().count();
        
        String pw="";
        for(int i=0; i<cantidadCaracteres; i++){
            pw+="*";
        }        
        return pw;
    }
    
    public void setPassword(String password){
        //variable utilizada para manejar el estado de la validacion, true si cumple, false si no cumple
        boolean validacion=true;
        
        //Calcula cantidad de caracteres.
        int cantidadCaracteres = (int) password.chars().count()-1;
        
        //Que la contraseña cuente al menos con 8 caracteres.
        if( cantidadCaracteres < 8){
            validacion=false;
        }
        
        
        //Que no existan dos caracteres iguales consecutivos.
        for(int i= cantidadCaracteres; i>1; i-- ){
            
            char caracterActual = password.charAt(i);
            char siguienteCaracter = password.charAt(i-1);
            
            //Si ambos caracteres son iguales, devuelve 0
            if(Character.compare(caracterActual, siguienteCaracter) == 0){
                //Encontró dos caracteres consecutivos iguales
                validacion = false;
            }
        }
        
        //Si no hubo caracteres dobles entonces guarde el password;
        if(validacion){
            this.password = password;
        }
    }
    
    public Usuario(){
    this.password= "fidelitas";
    //inicializacion de valores de atributos
    }
    
    public Usuario (String password){
       this.password = password;
    }
}
