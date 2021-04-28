package Vehiculos;

public class YateBuilder {
    private Color color = Color.NULLO;
    private String referencia = "";
    private double velocidadMaxima = 0.0;
    private double pesoMaximo = 0.0;

    public YateBuilder() {
    }

    public YateBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public YateBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public YateBuilder setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public YateBuilder setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        return this;
    }

    public Yate build() {
        return new Yate(color, referencia, velocidadMaxima, pesoMaximo);
    }
}
