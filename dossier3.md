Práctica 1: Crear un programa para calcular el máximo común divisor ( mcd ) de dos
números enteros recibidos por teclado. Se deberá crear un método llamado mcd que recibe
los dos números y devuelve el máximo común divisor. El método main del programa es:    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();
        
        String solucion = "MCD: " + mcd(num1,num2);
        System.out.println(solucion);        

        sc.close();
    }

    public static int mcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

--------------------------------------------------------

Práctica 2: Utilizando el método mcd() creado en la práctica anterior crear un programa
que calcule el mcm. Recordar que: mcm(a,b) = a*b/mcd(a,b) 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();
        
        String solucion = "MCD: " + mcd(num1,num2) + "\nMCM: " + mcm(num1, num2);
        System.out.println(solucion);        

        sc.close();
    }

    public static int mcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
       
    public static int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

---------------------------------------------------

Práctica 3: Crear un programa con un método llamado aleatorio() que reciba dos números
enteros positivos y devuelva un número aleatorio que esté entre esos dos números. El
main() del programa:
 public static void main(String[] args) {
 int num;
 do{
 num = aleatorio(25,45);
 System.out.println(num);
 }while( num != 35 );
 }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux;

        do{
        System.out.println("Ingresa un numero:");
        int primero = sc.nextInt();

        System.out.println("Ingresa uno mas:");
        int segundo = sc.nextInt();

        int min = Math.min(primero, segundo);
        int max = Math.max(primero, segundo);

        int num = aleatorio(min,max);
        System.out.println("Numero random entre " + min + " y " + max + ": " + num);

        System.out.println("Si quieres salir marca 0");
        aux = sc.nextInt();

        }while( aux != 0 );
        
        sc.close();
    }

    public static int aleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }

----------------------------------------------------

Práctica 4 Crear un método llamado numeroValido(). El usuario debe introducir un 
número entre 20 y 50 y ser múltiplo de 3. El main() del programa:
 public static void main(String[] args) {
 int num;
 Scanner cin = new Scanner(System.in);
 do{
 System.out.println(“Introducir un número: “);
 num = cin.nextInt();
 }while( !numeroValido(num) );
 System.out.println(“El número cumple los requisitos. Se puede continuar”);
 }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do{
        System.out.println("Introducir un número: ");
        num = sc.nextInt();

        }while( !numeroValido(num) );
        System.out.println("El número cumple los requisitos. Se puede continuar");
        
        sc.close();
    }

    public static boolean numeroValido(int num) {
        boolean esValido;

        if(num >= 20 && num <= 50){
            int rest = num % 3;
            if(rest == 0){
                esValido = true;
            }else {
                esValido = false;
            }
        }else{
            esValido = false;
        }
        return esValido;
    }

---------------------------------------------------------------------

Práctica 5: Crear un método llamado factorial() que obtenga el factorial de un número.
Hacer uso de él en un programa que el usuario introduzca por teclado un número y se le
muestre el factorial de ese número

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        System.out.println(calcularFactorial(num));
        
        sc.close();
    }

    public static int calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

------------------------------------------------------------

EXTRA: Mostrar cada operacion para llegar al resultado final.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
            int aux = factorial / i;

            System.out.println(aux + " x " + i + " = " + factorial);
        }
        
        sc.close();
    }

---------------------------------------------------------

Práctica 6: Crear un método llamado combinacion() que se le pasen dos números y
obtenga la combinación de esos dos números. Este método debe hacer uso del método
factorial creado en la práctica anterior. La fórmula de la combinación es:
combinacion(n,r) = factorial(n) / ( factorial(n-r) * factorial(r))

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num1 = sc.nextInt();

        System.out.println("Ingresa otro numero");
        int num2 = sc.nextInt();

        System.out.println(combinacion(num1, num2));
        
        sc.close();
    }

    public static int combinacion(int n, int r){
        int combinacion = factorial(n) / ( factorial(n-r) * factorial(r));
        return combinacion;
    }

    public static int factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

------------------------------------------------------

Práctica 7: Crear un programa con un tipo enumerado para las estaciones y mostrar en
pantalla el dato enumerado correspondiente a la actual estación.

class Prueba {
    public enum estaciones{
        PRIMAVERA, VERANO, OTOÑO, INVIERNO
    };
    public static void main(String[] args) {

        estaciones actual = estaciones.VERANO;

        System.out.println(actual);

    }

}

------------------------------------------------------

Práctica 8: Crear un programa que, mediante un bucle, guarde 10 números en un array
introducidos por el usuario. Luego, también con un bucle, muestre cada uno de esos
números y el índice que le corresponde en el array

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

------------------------------------------------------------
