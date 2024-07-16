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

class Cuenta {
    private String numero;
    private String titular;
    private double saldo;

    public void ingresar(double dineroIngresado){
        saldo += dineroIngresado;
    }

    public void retirar(double dineroRetirado){
        saldo -= dineroRetirado;
    }
}

-------------------------------------------------

Práctica 11: Crear una clase llamada Cliente que emulará los gastos de un cliente de un
hotel. Como atributos tendrá como mínimo: int id, String nombre, String apellido, int
habitacion, double debe, int noches Como métodos como mínimo gastar(double) y
pagar(double) que reflejan cuando el cliente consume y aumenta su deuda así como pagar
parte de su cuenta. Tener en cuenta que como mínimo en el debe del cliente estará la cuantía
de alquilar la habitación por el número de noches que esté. Cuando se establezca el número
de la habitación también se deberá establecer el precio/noche de la habitación

class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int habitacion;
    private double debe;
    private int noches;
    private double precioHabitacion;

    public Cliente(int id, String nombre, String apellido, double precioHabitacion, int habitacion, int noches) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habitacion = habitacion;
        debe = precioHabitacion * noches;
        this.noches = noches;
    }

    public void gastar(double gastoCliente){
        debe += gastoCliente;
    }

    public void pagar(double pagoCliente){
        debe -= pagoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
}

------------------------------------------------

Práctica 17: Crear una clase Factura que tenga como mínimo los atributos: double total,
String detalle y los métodos agregar(String articuloConsumido, double precio) e imprimir()
así como un constructor de copia
agregar() permite añadir al String detalle el nombre del artículo que se ha consumido y el
precio de ese artículo a la vez que añade al total el precio. 
imprimir() devuelve un String que muestra los artículos consumidos y el precio de cada uno
de ellos así como el total de la factura

class Factura {
    private double total;
    private String detalle;

    public void agregar(String articuloConsumido, double precio) {
        this.detalle += articuloConsumido + ": " + precio + "\n";
        this.total += precio;
    }

    public String imprimir() {
        return this.detalle + "Total: " + this.total;
    }
}

------------------------------------------------

Práctica 20: Crear una clase Reloj con atributos: int hora, int minuto, int segundo crear un
constructor como mínimo con los 3 parámetros. Un constructor de copia, un método: String
mostrar() que devolverá un texto con los datos del reloj en el formato: 
hora:minuto:segundo. Por ejemplo: 20:17:00
los metodos agregarMinutos(int), agregarHoras(int), agregarSegundos(int) que sumarán lo
correspondiente al reloj. 
Observar que cuando supere 60minutos, 60segundos se agrega en la siguiente unidad. 
Sobrecargar los métodos agregarHoras(double) , agregarMinutos(double) que si tienen una
parte decimal calcula el equivalente en la unidad correspondiente y lo agrega

class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        normalizarTiempo();
    }

    public Reloj(Reloj otro) {
        this.hora = otro.hora;
        this.minuto = otro.minuto;
        this.segundo = otro.segundo;
    }

    public String mostrar() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void agregarHoras(int horas) {
        this.hora += horas;
        normalizarTiempo();
    }

    public void agregarHoras(double horas) {
        int horasEnteras = (int) horas;
        double parteDecimal = horas - horasEnteras;
        int minutosAdicionales = (int) (parteDecimal * 60);
        agregarHoras(horasEnteras);
        agregarMinutos(minutosAdicionales);
    }

    public void agregarMinutos(int minutos) {
        this.minuto += minutos;
        normalizarTiempo();
    }

    public void agregarMinutos(double minutos) {
        int minutosEnteros = (int) minutos;
        double parteDecimal = minutos - minutosEnteros;
        int segundosAdicionales = (int) (parteDecimal * 60);
        agregarMinutos(minutosEnteros);
        agregarSegundos(segundosAdicionales);
    }

    public void agregarSegundos(int segundos) {
        this.segundo += segundos;
        normalizarTiempo();
    }

    private void normalizarTiempo() {
        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo = segundo % 60;
        }
        if (minuto >= 60) {
            hora += minuto / 60;
            minuto = minuto % 60;
        }
        if (hora >= 24) {
            hora = hora % 24;
        }
    }
}

-------------------------------------------------------

Práctica 26: Crear la clase CocheAlquiler como mínimo con atributos: String matricula,
marca, modelo; double precio; int numDias; boolean alquilado; y la fecha de alquiler
reflejada en tres valores enteros: dd, mm, aa 
Se deberá reflejar que hay una cantidad mínima de días de alquiler: 2 
Un constructor como mínimo que reciba matricula, marca, modelo y precio. 
Un método: double alquilar(int dias, int dd, int mm, int aa) que refleja la fecha de alquiler y
el número de días del alquiler. En este método se deberá controlar si el coche ya está
alquilado en cuyo caso devolverá -1. -2 si se intenta alquilar por menos días del mínimo
establecido y el coste del alquiler en otro caso
Un método: double devolver(int dias) que refleja que se ha devuelto el coche después de
una cantidad de días. Este método devuelve -1 si el coche no está alquilado y la cantidad de
sobrecoste que pudiera haber incurrido si sobrepasa los días de alquiler inicialmente
establecidos
Sobreescribir el método toString() que muestre los datos relevantes del alquiler

class CocheAlquiler {
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;
    private int numDias;
    private boolean alquilado;
    private int dd;
    private int mm;
    private int aa;
    private static final int MIN_DIAS_ALQUILER = 2;

    // Constructor que recibe matricula, marca, modelo y precio
    public CocheAlquiler(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.alquilado = false;
    }

    // Método para alquilar el coche
    public double alquilar(int dias, int dd, int mm, int aa) {
        if (alquilado) {
            return -1; // El coche ya está alquilado
        }
        if (dias < MIN_DIAS_ALQUILER) {
            return -2; // Intento de alquilar por menos del mínimo de días
        }

        this.numDias = dias;
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
        this.alquilado = true;

        return dias * precio; // Coste del alquiler
    }

    // Método para devolver el coche
    public double devolver(int dias) {
        if (!alquilado) {
            return -1; // El coche no está alquilado
        }

        this.alquilado = false;

        if (dias > numDias) {
            int diasExtra = dias - numDias;
            return diasExtra * precio; // Sobrecoste por días adicionales
        }

        return 0; // No hay sobrecoste
    }

    // Método toString para mostrar los datos relevantes del alquiler
    @Override
    public String toString() {
        return "CocheAlquiler{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", numDias=" + numDias +
                ", alquilado=" + alquilado +
                ", fecha de alquiler=" + dd + "/" + mm + "/" + aa +
                '}';
    }
}