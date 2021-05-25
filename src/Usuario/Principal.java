package Usuario;

import Vehiculos.Vehiculo;

import java.util.*;

public class Principal {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Validacion validacion = new Validacion();
        Set<Vehiculo> setGaraje = new LinkedHashSet<>();
        int opcion;
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
                    if (setGaraje.isEmpty()) {
                        System.out.println("No hay vehiculos en el garaje");
                    } else {
                        System.out.println("Los siguientes son los vehiculos en el garaje:");
                        setGaraje.forEach(System.out::println);
                    }
                    break;
                case 3:
                    FinalMateria finalMateria = new FinalMateria();
                    finalMateria.puntosFinal(setGaraje);
                    break;
            }
            System.out.print(singletonMenu.getMenuPrincipal());
            opcion = validacion.menu();
        }
    }
}