package tarea2_ejer3;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Tarea2_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Ejercicio 3
        System.out.println("Ejercicio 3");
        System.out.println("Por favor, ingrese su edad");
        Scanner dato = new Scanner(System.in);
        double edad = dato.nextDouble();
        if(edad <0 || edad >= 120){
            System.out.println("Su edad esta fuera del rango");
        }else if(edad<=17){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad\n");
        }
        
    }
    
}
