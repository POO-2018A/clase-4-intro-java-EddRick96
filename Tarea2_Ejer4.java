package tarea2_ejer4;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Tarea2_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 4
        System.out.println("Ejercicio 4");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scan.nextInt();
        if(numero%2==0){
            System.out.println("El numero "+numero+" es PAR\n");    
        }else{
            System.out.println("El numero "+numero+" es IMPAR\n");
        }
        
    }
    
}
