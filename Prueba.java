import java.util.Scanner;

/**
Práctica 8: Crear un programa que, mediante un bucle, guarde 10 números en un array
introducidos por el usuario. Luego, también con un bucle, muestre cada uno de esos
números y el índice que le corresponde en el array

 */

class Prueba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[10];

        for(int i = 0; i < array.length; i++){

            System.out.println("Ingresa un numero");
            int num = sc.nextInt();

            array[i] = num;

        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        sc.close();

    }

}
