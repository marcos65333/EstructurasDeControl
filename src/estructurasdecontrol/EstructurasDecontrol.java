package estructurasdecontrol;

import java.util.Scanner;

public class EstructurasDecontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero_1 = 0;
        int numero_2 = 0;

        System.out.println("Ingrese un numero 1");
        numero_1 = leer.nextInt();

        System.out.println("Ingrese un numero 2");
        numero_2 = leer.nextInt();

        if (numero_1 > numero_2) {
            System.out.println("El numero_1: " + numero_1 + " es mayor que el numero_2: " + numero_2);
        } else {
            if (numero_1 < numero_2) {
                System.out.println("El numero 2 es mayor que el numero 1");
                System.out.println("Numero1: " + numero_1);
                System.out.println("Numero2: " + numero_2);
            } else {
                if (numero_1 == numero_2) {
                    System.out.println("Son iguales");
                    System.out.println("Numero1 :" + numero_1);
                    System.out.println("Numero2 :" + numero_2);
                }
            }
        }
    }
}
