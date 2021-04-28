package Usuario;

public class SingletonMenu {
    private static SingletonMenu singletonMenu;
    private String menuPrincipal;
    private String menuVehiculos;
    private String menuColor;
    private String menuGarajeLleno;

    private SingletonMenu() {
        this.menuPrincipal = "\n¡¡¡Bienvenido a su Garaje Artemisa!!!\n\t\tSu Garaje Confiable\nSeleccione una opción:" +
                "\n1.Agrega Vehiculo.\n2.Mostrar Garaje.\n3.Salir.\n";
        this.menuVehiculos = "Ingresa:\na)Avión.\nb)Yate\nc)Carro.\nd)Salir.\n";
        this.menuColor = "\nIngresa:\n1.Negro\n2.Blanco\n3.Azul\n4.Verde.\n5.Gris\n";
        this.menuGarajeLleno = "\nlo sentimos, NO puedes guardar tu vehiculo\nSeleccione una opción:" +
                "\n2.Mostrar Garaje.\n3.Salir.\n";
    }

    public static SingletonMenu getInstance() {
        if (null == singletonMenu) {
            singletonMenu = new SingletonMenu();
        }
        return singletonMenu;
    }

    public String getMenuPrincipal() {
        return this.menuPrincipal;
    }

    public String getMenuVehiculos() {
        return this.menuVehiculos;
    }
    public String getMenuColor(){
        return this.menuColor;
    }
    public String getMenuGarajeLleno(){
        return this.menuGarajeLleno;
    }
}
