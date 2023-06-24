/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Clase6 {
    public static void main(String[] args){
    
        Usuario usuario = new Usuario();
        //No puede tener dos caracteres consecutivos iguales
        //password debe ser mayor a 8 caracteres
        
        var password = JOptionPane.showInputDialog("Ingrese su password. Debe contener al minimo 8 caractere y no pueden haber caracteres iguales consecutivos.");
        usuario.setPassword(password);
        
        JOptionPane.showMessageDialog(null, usuario.getPassword());
        
        
        //definicion del rol
        usuario.setRol(Rol.Supervisor);
        
        JOptionPane.showMessageDialog(null, usuario.getRol().ordinal());
    }
}
