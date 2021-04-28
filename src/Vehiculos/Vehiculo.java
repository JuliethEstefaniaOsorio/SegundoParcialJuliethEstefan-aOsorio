package Vehiculos;

public abstract class Vehiculo {
    private final String referencia;
    private final Color color;
    private final double velocidadMaxima;

    public Vehiculo(String referencia, Color color, double velocidadMaxima) {
        this.referencia = referencia;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.referencia = vehiculo.getReferencia();
        this.color = vehiculo.getColor();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
    }

    public String getReferencia() {
        return referencia;
    }

    public Color getColor() {
        return color;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public String toString() {
        return "\nReferencia: " + referencia + "\nColor: " + color + "\nVelocidad máxima: " + velocidadMaxima;
    }
    public abstract Vehiculo clone();

}
