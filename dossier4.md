Práctica 4: Crear la clase: Conversor Esta clase sirve para cambiar de euros a dolares y de
dolares a euros. Tiene un constructor que recibe el tipo de cambio (utilizar el cambio actual)
Pongamos por ejemplo: 0.8615 y tiene dos métodos: euroToDolar() y dolarToEuro() que
reciben un double que representa respetivamente euros y dolares y devuelve la divisa
transformada. También tiene un método llamado: establecerTipo(double t) que nos
permitirá modificar posteriormente el tipo de cambio por si cambia con el tiempo

class Conversor {
    private double tipo = 0.8615;

    Conversor(double tipo){
        this.tipo = tipo;
    }

    public double euroToDolar(double euro){
        double dolares = euro / tipo;
        return dolares;
    }

    public double dolarToEuro(double dolar){
        double euros = dolar * tipo;
        return euros;
    } 

    public void setTipo(double tipo){
        this.tipo = tipo;
    }

}

class Prueba {
    public static void main(String[] args) {

        Conversor c = new Conversor(0.9);

        System.out.println(c.dolarToEuro(100));
        System.out.println(c.euroToDolar(100));

        c.setTipo(0.8);

        System.out.println(c.dolarToEuro(100));
        System.out.println(c.euroToDolar(100));
    }
}

---------------------------------------------

Práctica 5: Crear la clase: Perro Esta clase tiene por atributos String raza, String nombre
y int edad. Tiene un constructor que recibe la raza el nombre y la edad. Ej.
 Perro(String n, String r, int e){
 nombre=n;
 raza=r;
 edad=e;
 }
y creamos otro constructor para cuando desconocemos la edad del animal:
 Perro(String n, String r){
 nombre=n;
 raza=r;
 edad=-1;
 }
crear un tercer Constructor que sirva para el caso en el que no sabemos ni la raza ni la edad

 class Perro {
    private String nombre;
    private String raza;
    private int edad;

    Perro(String n, String r, int e){
        nombre=n;
        raza=r;
        edad=e;
    }
    Perro(String n, String r){
        nombre=n;
        raza=r;
        edad=-1;
    }
    Perro(String n){
        nombre=n;
    }
 }

--------------------------------------------

Práctica 6: Crear un constructor para la clase Conversor que no reciba parámetros y
especifice un tipo de cambio por defecto de 0.85 Crear dos objetos e instanciarlos

class Conversor {
    private double tipo = 0.85;

    Conversor(double tipo){
        tipo = this.tipo;
    }

    Conversor(){
        
    }

    public double euroToDolar(double euro){
        double dolares = euro / tipo;
        return dolares;
    }

    public double dolarToEuro(double dolar){
        double euros = dolar * tipo;
        return euros;
    } 

    public void setTipo(double tipo){
        this.tipo = tipo;
    }

}

class Prueba {
    public static void main(String[] args) {

        Conversor c = new Conversor(0.9);
        Conversor d = new Conversor();
    }
}

---------------------------------------------

Práctica 7: Define una clase Profesor con atributos: nombre (String), apellidos (String),
edad (int), soltero (boolean), especialista (boolean). Define un constructor que reciba los
parámetros necesarios para la inicialización y otro constructor que no reciba parámetros.
Crea los métodos getter y setter para poder establecer y obtener los valores de los atributos.

class Profesor {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean soltero;

    public Profesor(){
    }

    public Profesor(String nombre, String apellidos, int edad, boolean soltero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.soltero = soltero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

}

------------------------------------------------

Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
Coche(String n, int p) Establecer los getter y los setter

class Coche {
    private String nombre;
    private boolean encendido;
    private boolean frenoDeMano;
    private int posicion;
    
    public Coche(String nombre) {
        this.nombre = nombre;
    }

    public Coche(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }
}

---------------------------------------------------

Práctica 10: Crear una clase llamada Cuenta que refleje una cuenta bancaria. Tiene por
atributos: String numero, String titular, double saldo Así como los métodos ingresar() y
retirar() que servirán para añadir o quitar saldo

