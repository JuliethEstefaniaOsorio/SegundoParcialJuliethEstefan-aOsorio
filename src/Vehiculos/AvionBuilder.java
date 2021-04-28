package Vehiculos;

public class AvionBuilder {
    private Color color= Color.NULLO;
    private String referencia = "";
    private double velocidadMaxima = 0.0;
    private double alturaMaxima = 0.0;

    public AvionBuilder() {

    }

    public AvionBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public AvionBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public AvionBuilder setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public AvionBuilder setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        return this;
    }

    public Avion build() {
        return new Avion(color, referencia, velocidadMaxima, alturaMaxima);
    }
}
