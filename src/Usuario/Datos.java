package Usuario;

import Vehiculos.*;

import java.util.Scanner;

public class Datos {
    private final Scanner scanner = new Scanner(System.in);
    SingletonMenu singletonMenu = SingletonMenu.getInstance();
    Validacion validacion = new Validacion();
    int opcion = 0;

    public Avion inscribirAvion() {
        System.out.println("Ingresa la referencia");
        String referencia = scanner.nextLine();
        System.out.println(singletonMenu.getMenuColor());
        opcion = validacion.datosEnteros();
        Color color = opcionColor(opcion);
        System.out.println("ingresa la velocidad máxima");
        double velocidadMaxima = validacion.datosDoubles();
        System.out.println("Ingresa la altura máxima");
        double alturaMaxima = validacion.datosDoubles();
        return new AvionBuilder()
                .setColor(color)
                .setReferencia(referencia)
                .setAlturaMaxima(alturaMaxima)
                .setVelocidadMaxima(velocidadMaxima).build();
    }

    public Carro inscribirCarro() {
        System.out.println("Ingresa la referencia");
        String referencia = scanner.nextLine();
        System.out.println(singletonMenu.getMenuColor());
        opcion = validacion.datosEnteros();
        Color color = opcionColor(opcion);
        System.out.println("ingresa la velocidad máxima");
        double velocidadMaxima = validacion.datosDoubles();
        System.out.println("Ingresa el numero de puertas");
        int numeroPuertas = validacion.datosEnteros();
        return new CarroBuilder()
                .setColor(color)
                .setReferencia(referencia)
                .setVelocidadMaxima(velocidadMaxima)
                .setNumeroPuertas(numeroPuertas).build();
    }

    public Yate inscribirYate() {
        System.out.println("Ingresa la referencia");
        String referencia = scanner.nextLine();
        System.out.println(singletonMenu.getMenuColor());
        opcion = validacion.datosEnteros();
        Color color = opcionColor(opcion);
        System.out.println("ingresa la velocidad máxima");
        double velocidadMaxima = validacion.datosDoubles();
        System.out.println("Ingresa el peso maximo");
        double pesoMaximo = validacion.datosDoubles();
        return new YateBuilder()
                .setColor(color)
                .setReferencia(referencia)
                .setVelocidadMaxima(velocidadMaxima)
                .setPesoMaximo(pesoMaximo).build();
    }
    public Color opcionColor(int opcion){
        switch (opcion){
            case 1:
                return Color.NEGRO;
            case 2:
                return  Color.BLANCO;
            case 3:
                return Color.AZUL;
            case 4:
                return Color.VERDE;
            case 5:
                return Color.GRIS;
            default:
                System.out.println("Opcion no valida");
        }


        return null;
    }
}
