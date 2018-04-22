package tarea2_ejer6;

/**
 *
 * @author Erick
 */
public class Tarea2_Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Ejercicio 6
        boolean estaNevando = false;
        boolean estaLloviendo = true;
        double temperatura = 60.0;
            if(!estaNevando||estaLloviendo||temperatura <=10.0){
                System.out.println("Nos quedamos en casa!");
            }else{
                System.out.println("Vamos afuera!");
            }
    }
    
}
