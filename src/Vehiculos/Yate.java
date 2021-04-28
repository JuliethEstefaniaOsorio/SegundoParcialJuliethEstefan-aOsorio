package Vehiculos;
import Vehiculos.Vehiculo;
public class Yate extends Vehiculo {
    private final double pesoMaximo;

    public Yate(Color color, String referencia, double velocidadMaxima, double pesoMaximo) {
        super(referencia, color, velocidadMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, double pesoMaximo) {
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    public String toString() {
        return getClass().getName() + "---->" + super.toString() + "\nPeso máximo: " + pesoMaximo;
    }
    public Yate clone() {
        return new Yate(this.getColor(),this.getReferencia(), this.getVelocidadMaxima(), this.pesoMaximo);
    }
}
