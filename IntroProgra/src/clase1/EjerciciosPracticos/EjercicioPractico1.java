/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1.EjerciciosPracticos;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class EjercicioPractico1 {
    public static void main(String[] args){
    
        //realizar un cálculo de subsidio a sus colaboradores según
        //el tiempo las escalas salariales en la empresa.
        //300-500   16%
        //501-700   12%
        //700-1millon   10%
        //+1millon   8%
        
        String datoUsuario = JOptionPane.showInputDialog(null,"Por favor ingrese el salario mensual del empleado.");
        int salarioMensual = Integer.parseInt(datoUsuario);
        int subsidio;
        int categoria=0;
        if(salarioMensual>1000000){
            categoria = 4;
        }else if(salarioMensual<1000000 && salarioMensual > 700000){
            categoria=3;
        }else if( salarioMensual>501000 && salarioMensual<700000){
            categoria = 2;
        }else if(salarioMensual<501000 && salarioMensual>300000){
            categoria =1;
        }
        
        switch(categoria){
            case 4:
                subsidio=8;
                break;
            case 3:
                subsidio=10;
                break;
            case 2:
                subsidio=12;
                break;
            case 1:
                subsidio=16;
                break;
            default:
                subsidio=0;
        }
        
        
        double salarioAnual= salarioMensual*12;
        double montoSubsidio = salarioAnual*0.16;
        
        JOptionPane.showMessageDialog(null, "El monto del salario mensual es: "+salarioMensual+".\n El monto del salario anual es: "+salarioAnual+".\n El porcentaje de subsidio segun salario es: "+ subsidio+"% y el monto del subsidio corresponde a: "+montoSubsidio+". \n El salario final con subsidio corresponde a: "+ (salarioAnual+montoSubsidio)+".");
        
    }   
}
