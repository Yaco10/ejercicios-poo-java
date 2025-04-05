import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaBancario sistemaBancario = new SistemaBancario();
        menu(sistemaBancario);
    }

    public static void menu(SistemaBancario sistemaBancario) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Imprimir cuentas");
            System.out.println("3. Depositar en cuenta");
            System.out.println("4. Retirar de cuenta");
            System.out.println("5. Mostrar saldo");
            System.out.println("6. Borrar cuenta");
            System.out.println("7. Salir");

            int key = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (key) {
                case 1:
                    crearCuenta(scanner, sistemaBancario);
                    break;
                case 2:
                    imprimirCuentas(scanner, sistemaBancario);
                    break;
                case 3:
                    depositarEnCuenta(scanner, sistemaBancario);
                    break;
                case 4:
                    retirarDeCuenta(scanner, sistemaBancario);
                    break;
                case 5:
                    //mostrarSaldo(scanner,sistemaBancario);
                    break;
                case 6:
                    borrarCuenta(scanner, sistemaBancario);
                    break;
                case 7:
                    System.out.println("Adiós!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public static void crearCuenta(Scanner sc, SistemaBancario sistemaBancario) {
        System.out.println("Elija tipo de cuenta:");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Caja de Ahorro");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1:
                System.out.println("Va a crear una Cuenta Corriente");
                System.out.print("Ingrese Nombre del Cliente: ");
                String nombreCC = sc.nextLine();

                System.out.print("Ingrese Descubierto: ");
                float descubierto = sc.nextFloat();
                sc.nextLine(); // limpiar buffer

                sistemaBancario.crearCuentaCorriente(descubierto, nombreCC);
                System.out.println("Cuenta Corriente creada.");
                break;

            case 2:
                System.out.println("Va a crear una Caja de Ahorro");
                System.out.print("Ingrese Nombre del Cliente: ");
                String nombreCA = sc.nextLine();

                sistemaBancario.crearCajaAhorro(nombreCA);
                System.out.println("Caja de Ahorro creada.");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void imprimirCuentas(Scanner sc, SistemaBancario sistemaBancario) {
        System.out.print("Ingrese Nombre del Cliente: ");
        String nombre = sc.nextLine();
        sistemaBancario.imprimirCuentas(nombre);
    }

    public static void depositarEnCuenta(Scanner sc, SistemaBancario sistemaBancario) {
        System.out.print("Ingrese Nombre del Cliente: ");
        String nombre = sc.nextLine();

        sistemaBancario.imprimirCuentas(nombre);

        System.out.print("Ingrese Índice de la Cuenta: ");
        int index = sc.nextInt();

        System.out.print("Ingrese Monto a Depositar: ");
        float monto = sc.nextFloat();
        sc.nextLine(); // limpiar buffer

        sistemaBancario.depositarEnCuenta(nombre, index, monto);
    }

    public static void retirarDeCuenta(Scanner sc, SistemaBancario sistemaBancario) {
        System.out.print("Ingrese Nombre del Cliente: ");
        String nombre = sc.nextLine();

        sistemaBancario.imprimirCuentas(nombre);

        System.out.print("Ingrese Índice de la Cuenta: ");
        int index = sc.nextInt();

        System.out.print("Ingrese Monto a Retirar: ");
        float monto = sc.nextFloat();
        sc.nextLine(); // limpiar buffer

        sistemaBancario.retirarDeCuenta(nombre, index, monto);
    }

    public static void borrarCuenta(Scanner sc, SistemaBancario sistemaBancario) {
        System.out.print("Ingrese Nombre del Cliente: ");
        String nombre = sc.nextLine();

        sistemaBancario.imprimirCuentas(nombre);

        System.out.print("Ingrese Índice de la Cuenta: ");
        int index = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        sistemaBancario.borrarCuenta(nombre, index);
    }
}
