import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int pin_Correcto = 1234; 
        double saldo = 50000;
        int intentos = 0;
        boolean cuentaBloqueada = false;

        // Autenticación 
        while (intentos < 3) {
            System.out.println("Ingrese su PIN: ");
            int pinIngresado = scanner.nextInt();

            if (pinIngresado == pin_Correcto) {
                System.out.println("Bienvenido Pichurria");
                break;
            } else {
                intentos++;
                System.out.println("PIN Incorrecto. Mosca Pues " + intentos);
            }

            if (intentos == 3) {
                cuentaBloqueada = true;
                System.out.println("Mera Gueva, cuenta bloqueada");
            }
        }

        if (cuentaBloqueada) {
            scanner.close();
            return;
        }

        // Menú 
        int opcion;
        do {
            System.out.println("\nBienvenido a su cajero Groserón ");
            System.out.println("1. Consultar Chichigua ");
            System.out.println("2. Retirar Menuda ");
            System.out.println("3. Depositar Money ");
            System.out.println("4. Abrirse del Parche ");
            System.out.println("5. Cambiar PIN ");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            //opciones
            switch (opcion) {
                case 1:
                    System.out.println("Ay marica, tenés apenas $$ " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuánta chichigua vas a sacar? ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Su nueva chichigua es de: " + saldo);
                    } else {
                        System.out.println("Oigan a esta gueva, si solo tenés " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Empiece a cantar, ¿cuánta plata va a consignar? ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Mano, su consignación fue exitosa. Su saldo es: " + saldo);
                    } else {
                        System.out.println("Despierte pues mijo, ¡ese valor no se puede!");
                    }
                    break;
                case 4:
                    System.out.println("Suerte pues mi amor, ¡perdete!");
                    break;
                case 5:
                    System.out.println("Ingrese su PIN actual: ");
                    int pinActual = scanner.nextInt();
                    if (pinActual == pin_Correcto) {
                        System.out.println("Ingrese su nuevo PIN de 4 dígitos: ");
                        int nuevoPin = scanner.nextInt();
                        if (String.valueOf(nuevoPin).length() == 4) {
                            pin_Correcto = nuevoPin;
                            System.out.println("¡PIN cambiado con éxito!");
                        } else {
                            System.out.println("Error: El PIN debe tener exactamente 4 dígitos.");
                        }
                    } else {
                        System.out.println("PIN incorrecto, no se puede cambiar.");
                    }
                    break;
                default:
                    System.out.println("Bájese de esa nube ome gueva");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
