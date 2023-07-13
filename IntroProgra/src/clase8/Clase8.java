
package clase8;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author mbp_jay
 */
public class Clase8 {
    public static void main(String[] args){
        //array de objetos
        
        
        
        //Notacion/sintaxis:
        //Clase[] <nombreVariabledeArray> = new Clase[LimiteDeIndice];
        

        //Definicion e inicializacion
        Estudiante[] arrayEstudiante = new Estudiante[10];
        
        arrayEstudiante[0] = new Estudiante();
        //arrayNumeros[0] (double) = 1;
       
        
        //ciclo para crear estudiantes;
        for(int contador =0; contador<10; contador++){
            arrayEstudiante[contador] = new Estudiante("pablo", "gonzalez", contador);
        }
        
        //ciclo para leer estudiantes:
        for( int contador = 0; contador < 10; contador++){
            System.out.println("Nombre: "+arrayEstudiante[contador].getNombre() + ", Apellido: "+ arrayEstudiante[contador].getApellido()+ ", Edad: "+arrayEstudiante[contador].getEdad());
        }
        
        
        
        
        //Ejercicio ordenar array
        Estudiante[] arrayEjercicio = new Estudiante[10];
        //Crea datos
        
        for(int contador =0; contador<10; contador++){
            //La edad se genera aleatoriamente con Math.Random();
            arrayEjercicio[contador] = new Estudiante("pablo", "gonzalez");
        }
        
        //Requerimiento: ordenar el array con base en la edad.
        //arrayEjercicio.Sort;
        Arrays.sort(arrayEjercicio , Comparator.comparing(Estudiante::getEdad));
        
        
        
        //ciclo para leer estudiantes:
        for( int contador = 0; contador < 10; contador++){
            System.out.println("Nombre: "+arrayEjercicio[contador].getNombre() + ", Apellido: "+ arrayEjercicio[contador].getApellido()+ ", Edad: "+arrayEjercicio[contador].getEdad());
        }
    }
    
    
}
