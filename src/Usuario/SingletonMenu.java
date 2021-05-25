package Usuario;

public class SingletonMenu {
    private static SingletonMenu singletonMenu;
    private final String menuPrincipal;
    private final String menuVehiculos;
    private final String menuColor;
    private final String menuPuntosFinal;

    private SingletonMenu() {
        this.menuPrincipal = "\n¡¡¡Bienvenido a su Garaje Artemisa!!!\n\t\tSu Garaje Confiable\nSeleccione una opción:" +
                "\n1.Agrega Vehiculo.\n2.Mostrar Garaje.\n3.Ver Puntos del Final.\n4.Salir.\n";
        this.menuVehiculos = "Ingresa:\na)Avión.\nb)Yate\nc)Carro.\nd)Salir.\n";
        this.menuColor = "\nIngresa:\n1.Negro\n2.Blanco\n3.Azul\n4.Verde.\n5.Gris\n";
        this.menuPuntosFinal = "\nSelecciona el punto que quieres verificar\n1.El vehículo con la mayor" +
                " velocidad máxima.\n2.El vehículo con la menor velocidad máxima.\n3.Ordenar los vehículos" +
                " por velocidad máxima(mayor a menor).\n4.Mostrar solo los vehículosde color NEGRO o AZUL." +
                "\n5.Concatenar en un solo String las referencias de los vehículos de color BLANCO o" +
                " VERDE.\n6.Salir";
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

    public String getMenuColor() {
        return this.menuColor;
    }

    public String getMenuPuntosFinal() {
        return this.menuPuntosFinal;
    }
}
