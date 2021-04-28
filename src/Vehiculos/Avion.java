package Vehiculos;
import Vehiculos.Vehiculo;
public class Avion extends Vehiculo {
    private final double alturaMaxima;

    public Avion(Color color, String referencia, double velocidadMaxima, double alturaMaxima) {
        super(referencia, color, velocidadMaxima);
        this.alturaMaxima = alturaMaxima;
    }

    public Avion(Vehiculo vehiculo, double alturaMaxima) {
        super(vehiculo);
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "--->" + super.toString() + "\nAltura máxima: " + alturaMaxima;
    }

    public Avion clone() {
        return new Avion(this.getColor(),this.getReferencia(), this.getVelocidadMaxima(), this.alturaMaxima);
    }
}
