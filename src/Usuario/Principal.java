package Usuario;

import Usuario.Datos;
import Vehiculos.Vehiculo;

import java.util.Scanner;

public class Principal {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Validacion validacion = new Validacion();
        Vehiculo garaje[] = new Vehiculo[10];
        int opcion = 0, aux = 0;

        SingletonMenu singletonMenu = SingletonMenu.getInstance();
        System.out.print(singletonMenu.getMenuPrincipal());
        opcion = validacion.menuPrincipal();
        while (opcion != 3) {
            if (opcion == 1) {
                for (int i = 0; i < garaje.length; i++) {
                    if (garaje[i] == null) {
                        System.out.println("Tienes lugar para guardar tu vehiculo");
                        aux = i;
                        break;
                    } else if ((garaje[i] != null) && (i == (garaje.length - 1))) {
                        System.out.println(singletonMenu.getMenuGarajeLleno());
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
            }
            switch (opcion) {
                case 1:
                    System.out.print(singletonMenu.getMenuVehiculos());
                    char opcionVehiculo = scanner.next().charAt(0);
                    switch (opcionVehiculo) {
                        case 'a':
                            garaje[aux] = new Datos().inscribirAvion();
                            break;
                        case 'b':
                            garaje[aux] = new Datos().inscribirYate();
                            break;
                        case 'c':
                            garaje[aux] = new Datos().inscribirCarro();
                            break;
                        case 'd':
                            System.out.println("Gracias!!!");
                        default:
                            System.out.println("Opcion errada");
                    }
                    break;
                case 2:
                    System.out.println("Los siguientes son los vehiculos en el garaje:");
                    for (int i = 0; i < garaje.length; i++) {
                        if (garaje[i] == null) {
                            break;
                        }
                        System.out.println(garaje[i]);

                        break;

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