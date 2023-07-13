
package clase8;

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
    }
    
    
}
