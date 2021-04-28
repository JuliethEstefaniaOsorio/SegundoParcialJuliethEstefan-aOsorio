package Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion {
    Scanner scanner = new Scanner(System.in);

    public int menuPrincipal(){
        int pos = 0;
        try{
            pos = scanner.nextInt();
        }catch(InputMismatchException exception){
            System.out.println("Opcion inválida");
        }
        scanner.nextLine();
        return pos;
    }
    public int datosEnteros(){
        int pos = 0;
        try{
            pos = scanner.nextInt();
        }catch(InputMismatchException exception){
            System.out.println("Opcion inválida");
        }
        scanner.nextLine();
        return pos;
    }
    public double datosDoubles(){
        double pos = 0.0;
        try{
            pos = scanner.nextDouble();
        }catch(InputMismatchException exception){
            System.out.println("Opcion inválida");
        }
        scanner.nextLine();
        return pos;
    }

}
