package Vehiculos;

public class Carro extends Vehiculo {
    private final int numeroPuertas;

    public Carro(Color color, String referencia, double velocidadMaxima, int numeroPuertas) {
        super(referencia, color, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroPuertas) {
        super(vehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {

        return getClass().getName() + "----->" + super.toString() + "\nNumero de puertas: " + numeroPuertas;
    }
    public Carro clone() {
        return new Carro(this.getColor(),this.getReferencia(), this.getVelocidadMaxima(), this.numeroPuertas);
    }
}
