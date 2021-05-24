package Usuario;
import Vehiculos.Color;
import Vehiculos.Vehiculo;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Validacion validacion = new Validacion();
        Set<Vehiculo> setGaraje = new LinkedHashSet<>();
        int opcion = 0;
        SingletonMenu singletonMenu = SingletonMenu.getInstance();
        System.out.print(singletonMenu.getMenuPrincipal());
        opcion = validacion.menu();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.print(singletonMenu.getMenuVehiculos());
                    char opcionVehiculo = scanner.next().charAt(0);
                    switch (opcionVehiculo) {
                        case 'a':
                            setGaraje.add(new Datos().inscribirAvion());
                            break;
                        case 'b':
                            setGaraje.add(new Datos().inscribirYate());
                            break;
                        case 'c':
                            setGaraje.add(new Datos().inscribirCarro());
                            break;
                        case 'd':
                            System.out.println("Gracias!!!");
                        default:
                            System.out.println("Opcion errada");
                    }
                    break;
                case 2:
                    if (setGaraje.isEmpty()){
                        System.out.println("No hay vehiculos en el garaje");
                    }else {
                        System.out.println("Los siguientes son los vehiculos en el garaje:");
                        setGaraje.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.println(singletonMenu.getMenuPuntosFinal());
                    opcion = validacion.menu();
                    switch (opcion){
                        case 1:
                            Optional<Vehiculo> vehiculo = setGaraje.stream()
                                    .max(Comparator.comparing(Vehiculo::getVelocidadMaxima));
                            System.out.println("El vehiculo con la maxima velicidad maxima es: \n"+vehiculo);
                            break;
                        case 2:
                            Optional<Vehiculo> vehiculoMin = setGaraje.stream()
                                    .min(Comparator.comparing(Vehiculo::getVelocidadMaxima));
                            System.out.println("El vehiculo con la minima velicidad maxima es: \n"+vehiculoMin);
                            break;
                        case 3:
                            List<Vehiculo> vehiculosOrder = setGaraje.stream()
                                    .sorted(Comparator.comparing(Vehiculo::getVelocidadMaxima, Comparator.reverseOrder()))
                                    .collect(Collectors.toList());
                            System.out.println(vehiculosOrder);
                            break;
                        case 4:
                            Set<Vehiculo> vehiculos = setGaraje.stream()
                                    .filter(Vehiculo -> Vehiculo.getColor()== Color.AZUL && Vehiculo.getColor() == Color.NEGRO)
                                    .collect(Collectors.toSet());
                            System.out.println(vehiculos);
                            break;
                        case 5:
                            String vehiculosReferencia = setGaraje.stream()
                                    .filter((Vehiculo->Vehiculo.getColor() == Color.BLANCO))
                                    .filter((Vehiculo->Vehiculo.getColor() == Color.VERDE))
                                    //&& Vehiculo.getColor()= Color.VERDE)
                                    .map(Vehiculo->Vehiculo.getReferencia())
                                    .collect(Collectors.joining());
                            System.out.println(vehiculosReferencia);
                            break;
                    }

                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios...");
                    opcion = 3;
            }
            System.out.print(singletonMenu.getMenuPrincipal());
            opcion = validacion.menu();
        }
    }
}