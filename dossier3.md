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


