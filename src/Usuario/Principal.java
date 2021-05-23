package Usuario;
import Usuario.Datos;
import Vehiculos.Vehiculo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Validacion validacion = new Validacion();
        Set<Vehiculo> setGaraje = new LinkedHashSet<>();
        int opcion = 0;
        SingletonMenu singletonMenu = SingletonMenu.getInstance();
        System.out.print(singletonMenu.getMenuPrincipal());
        opcion = validacion.menuPrincipal();
        while (opcion != 3) {
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
                    System.out.println("Gracias por usar nuestros servicios...");
                    opcion = 3;
            }
            System.out.print(singletonMenu.getMenuPrincipal());
            opcion = validacion.menuPrincipal();
        }
    }
}