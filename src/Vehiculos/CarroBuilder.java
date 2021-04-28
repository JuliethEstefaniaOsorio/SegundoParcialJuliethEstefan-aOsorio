package Vehiculos;

public class CarroBuilder {
    private Color color = Color.NULLO;
    private String referencia = "";
    private double velocidadMaxima = 0.0;
    private int numeroPuertas = 0;

    public CarroBuilder() {
    }

    public CarroBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarroBuilder setReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }

    public CarroBuilder setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
        return this;
    }

    public CarroBuilder setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
        return this;
    }

    public Carro build() {
        return new Carro(color, referencia, velocidadMaxima, numeroPuertas);
    }
}
