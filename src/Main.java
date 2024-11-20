import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "123456");
        Cliente cliente2 = new Cliente("María Gómez", "789012");

        // Crear cuentas bancarias
        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC001", cliente1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("CA002", cliente2);

        int opcion;
        do {
            // Mostrar menú
            System.out.println("\nMenú:");
            System.out.println("1. Ver información del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nCuenta Corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("\nCuenta Ahorro:");
                    cuentaAhorro.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("\n¿Monto a transferir de Cuenta Corriente a Cuenta Ahorro? ");
                    double montoTransferir = scanner.nextDouble();
                    if (cuentaCorriente.getSaldo() >= montoTransferir) {
                        cuentaCorriente.retirar(montoTransferir);
                        cuentaAhorro.depositar(montoTransferir);
                        System.out.println("Transferencia completada.");
                    } else {
                        System.out.println("Fondos insuficientes en la Cuenta Corriente.");
                    }
                    break;

                case 3:
                    System.out.print("\nSelecciona cuenta (1: Corriente, 2: Ahorro): ");
                    int cuentaSeleccionada = scanner.nextInt();
                    System.out.print("¿Monto a retirar? ");
                    double montoRetirar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.retirar(montoRetirar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.retirar(montoRetirar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 4:
                    System.out.print("\nSelecciona cuenta (1: Corriente, 2: Ahorro): ");
                    cuentaSeleccionada = scanner.nextInt();
                    System.out.print("¿Monto a depositar? ");
                    double montoDepositar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.depositar(montoDepositar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.depositar(montoDepositar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
