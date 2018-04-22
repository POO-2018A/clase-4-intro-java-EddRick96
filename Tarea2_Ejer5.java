package tarea2_ejer5;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Tarea2_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 5
        System.out.println("Ejercicio 5");
        System.out.println("Ingrese un numero entero del 1 al 12");
        Scanner leerDato = new Scanner(System.in);
        int mes = leerDato.nextInt();
        switch(mes){
            case 1:
                System.out.println("Enero\n");
                break;
            case 2:
                System.out.println("Febrero\n");
                break;
            case 3:
                System.out.println("Marzo\n");
                break;
            case 4:
                System.out.println("Abril\n");
                break;
            case 5:
                System.out.println("Mayo\n");
                break;
            case 6:
                System.out.println("Junio\n");
                break;
            case 7:
                System.out.println("Julio\n");
                break;
            case 8:
                System.out.println("Agosto\n");
                break;
            case 9:
                System.out.println("Septiembre\n");
                break;
            case 10:
                System.out.println("Octubre\n");
                break;
            case 11:
                System.out.println("Noviembre\n");
                break;
            case 12:
                System.out.println("Diciembre\n");
                break;
            default:
                System.out.println("El numero ingresado no es valido\n");
                break;
        }
        
    }
    
}
