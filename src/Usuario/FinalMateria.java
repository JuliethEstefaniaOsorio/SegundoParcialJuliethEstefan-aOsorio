package Usuario;

import Vehiculos.Color;
import Vehiculos.Vehiculo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FinalMateria {

    public void puntosFinal(Set<Vehiculo> setGaraje) {
        SingletonMenu singletonMenu = SingletonMenu.getInstance();
        Validacion validacion = new Validacion();
        System.out.println(singletonMenu.getMenuPuntosFinal());
        int opcion = validacion.menu();
        switch (opcion) {
            case 1:
                Optional<Vehiculo> vehiculo = setGaraje.stream()
                        .max(Comparator.comparing(Vehiculo::getVelocidadMaxima));
                System.out.println("El vehiculo con la maxima velicidad maxima es: \n" + vehiculo);
                break;
            case 2:
                Optional<Vehiculo> vehiculoMin = setGaraje.stream()
                        .min(Comparator.comparing(Vehiculo::getVelocidadMaxima));
                System.out.println("El vehiculo con la minima velicidad maxima es: \n" + vehiculoMin);
                break;
            case 3:
                List<Vehiculo> vehiculosOrder = setGaraje.stream()
                        .sorted(Comparator.comparing(Vehiculo::getVelocidadMaxima, Comparator.reverseOrder()))
                        .collect(Collectors.toList());
                System.out.println(vehiculosOrder);
                break;
            case 4:
                Set<Vehiculo> vehiculos = setGaraje.stream()
                        .filter(Vehiculo -> Vehiculo.getColor() == Color.AZUL || Vehiculo.getColor() == Color.NEGRO)
                        .collect(Collectors.toSet());
                System.out.println(vehiculos);
                break;
            case 5:
                String vehiculosReferencia = setGaraje.stream()
                        .filter((Vehiculo -> Vehiculo.getColor() == Color.BLANCO || Vehiculo.getColor() == Color.VERDE))
                        .map(Vehiculo::getReferencia)
                        .collect(Collectors.joining(", "));
                System.out.println(vehiculosReferencia);
                break;
        }
    }
}
