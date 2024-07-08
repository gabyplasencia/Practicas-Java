import java.util.Arrays;
import java.util.Scanner;

/**
Práctica 21: Crear un programa que reciba dos números del usuario. Si el primer número 
no es un entero entre 1 y 100 lanzará una excepción que mostrará en pantalla “El número 
debe ser un entero entre 1 y 100”
 */

 class NumeroFueraDeRangoException extends Exception {
    public NumeroFueraDeRangoException(String mensaje) {
        super(mensaje);
    }
}

class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa el primer numero:");
            int num1 = sc.nextInt();

            if (num1 < 1 || num1 > 100) {
                throw new NumeroFueraDeRangoException("El número debe ser un entero entre 1 y 100");
            }

            System.out.println("Ingresa el segundo numero:");
            int num2 = sc.nextInt();

            System.out.println("Número 1: " + num1);
            System.out.println("Número 2: " + num2);
        } catch (NumeroFueraDeRangoException e) {

            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
