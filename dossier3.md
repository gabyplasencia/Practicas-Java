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

Práctica 9: Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
que sean pares, no repetidos. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
de esos 10 números y las respectivas posiciones que ocupan en el array

    public static void main(String[] args) {

        int array[] = new int[10];

        int min = 1;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            int numAleat = (int) (Math.random() * (max - min + 1)) + min;

            if (numAleat % 2 == 0) {
                boolean exists = false;
                for (int j = 0; j < i; j++) {
                    if (numAleat == array[j]) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    array[i] = numAleat;
                } else {
                    i--; 
                }
            } else {
                i--;
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        int minValor = array[0];
        int maxValor = array[0];
        int minPosi = 0;
        int maxPosi = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] <= minValor){
                minValor = array[i];
                minPosi = i;
            }   
            else if(array[i] >= maxValor){
                maxValor = array[i];
                maxPosi = i;
            }

        }

        System.out.println("Valor menor = " + minValor + " en la prosicion " + minPosi + "\nValor mayor = " + maxValor + " en la posicion " + maxPosi);
    }

-----------------------------------------------------------

Práctica 10: Hacer un programa que primero solicita la cantidad de números que se van a
inroducir. Después de haberlos introducido muestra la media y los números que se han
introducido

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica la cantidad de numero");
        int cantidad = sc.nextInt();

        int array[] = new int[cantidad];

        int min = 1;
        int max = 99;

        for(int i = 0; i < array.length; i++){
            int numAleat = (int) (Math.random() * (max - min + 1)) + min;

            array[i] = numAleat;
        }

        int total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
            System.out.println(array[i]);
        }

        int media = total / cantidad;

        System.out.println("La media es: " + media);

        sc.close();
        
    }

------------------------------------------------------------

Práctica 11: Modificar el programa anterior para que calcule también la varianza

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Indica la cantidad de numero");
        int cantidad = sc.nextInt();

        int array[] = new int[cantidad];

        int min = 1;
        int max = 99;

        for(int i = 0; i < array.length; i++){
            int numAleat = (int) (Math.random() * (max - min + 1)) + min;

            array[i] = numAleat;
        }

        int total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
            System.out.println(array[i]);
        }

        double media = (double) total / cantidad;
        System.out.println("La media es: " + df.format(media));

        double sumaDiferenciasCuadradas = 0;
        for (int i = 0; i < array.length; i++) {
            sumaDiferenciasCuadradas += Math.pow(array[i] - media, 2);
        }

        double varianza = sumaDiferenciasCuadradas / cantidad;
        System.out.println("La varianza es: " + df.format(varianza));

        sc.close();
        
    }

---------------------------------------------------

Práctica 12: Crear un programa que genere 20 números aleatorios enteros entre 1 y 100.
Este array una vez se hay rellenado no se puede modificar. Crear un segundo array donde se
almacenará una copia de los 5 números más pequeños del primer array. Mostrar en pantalla
el contenido del array de 20 números y mostrar cuáles son los 5 números más pequeños

    public static void main(String[] args) {

        int array[] = new int[20];

        int min = 1;
        int max = 100;

        for(int i = 0; i < array.length; i++){
            int numAleat = (int) (Math.random() * (max - min + 1)) + min;
            array[i] = numAleat;
        }

        int arrayCopia[] =  new int[20];

        System.out.println("Array de 20: ");
        for(int i = 0; i < array.length; i++){
            arrayCopia[i] = array[i];
            System.out.println(array[i]);
        }

        Arrays.sort(arrayCopia);

        int arrayMin[] =  new int[5];
        for(int i = 0; i < 5; i++){
            arrayMin[i] = arrayCopia[i];
        }

        System.out.println("\nArray de 5:");
        for(int i = 0; i < arrayMin.length; i++){
            System.out.println(arrayMin[i]);
        }
        
    }

-----------------------------------------------------------------------

Práctica 13: Crear una variante del programa anterior que en lugar de guardar una copia de
los números más pequeños guarde la posición en la que están esos números. 

    public static void main(String[] args) {

        int array[] = new int[20];

        int min = 1;
        int max = 100;

        for(int i = 0; i < array.length; i++){
            int numAleat = (int) (Math.random() * (max - min + 1)) + min;
            array[i] = numAleat;
        }

        int arrayCopia[] =  new int[20];

        System.out.println("Array de 20: ");
        for(int i = 0; i < array.length; i++){
            arrayCopia[i] = array[i];
            System.out.println(array[i]);
        }

        Arrays.sort(arrayCopia);
        int posicion[] = new int[5];

        int arrayMin[] =  new int[5];
        for(int i = 0; i < 5; i++){
            arrayMin[i] = arrayCopia[i];
            posicion[i] = i;
        }

        System.out.println("\nArray de 5:");
        for(int i = 0; i < arrayMin.length; i++){
            System.out.println(arrayMin[i] + " posicion " + posicion[i]);
        }
        
    }

---------------------------------------------------------

Práctica 14: Crear un programa que introduzca 10 números por teclado y mostrarlos
ordenados de menor a mayor al finalizar

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[10];  

        for(int i = 0; i < array.length; i++){

            System.out.println("Ingresa un numero");
            int num = sc.nextInt();

            array[i] = num;
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        sc.close();
    }

------------------------------------------------------------

Práctica 15: Crear un programa que muestre al azar una carta de la baraja española. Por ej.
“sota de copas” Para ello se usarán dos array 
En el primero se registra: 
1,2,3,4,5,6,7,sota,caballo,rey
En el segundo
oros,copas,bastos,espadas
Mediante dos aleatorios se toma un dato del primer array y un dato del segundo array para 
componer el nombre de la carta a mostrar

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numero[] = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        String grupo[] = {"oros", "copas", "bastos", "espadas"};

        int min = 0;
        int maxN = 9;
        int maxG = 3;

        boolean salir = false;

        do{
            int numCarta = (int) (Math.random() * (maxN - min + 1)) + min;
            int grupoCarta = (int) (Math.random() * (maxG - min + 1)) + min;

            System.out.println("CARTA: "+ numero[numCarta] + " de " + grupo[grupoCarta]);
            System.out.println("Mostrar otra carta?");
            char letra = sc.next().charAt(0);
            letra = Character.toLowerCase(letra);

            if(letra != 'n'){
                salir = false;
            }else {
                salir = true;
            }

        }while(salir != true);

        sc.close();
    }

----------------------------------------------------------

