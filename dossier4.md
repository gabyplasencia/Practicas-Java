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