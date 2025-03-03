import java.util.Scanner;
public class cajero {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        //variables y constantes
        final int PIN_CORRECTPO = 1234;
        double saldo = 50000;
        int intentos = 0;
        boolean cuentaBloqueada = false;

        //Autenticacion segun intentos 
        while (intentos < 3) {
            System.out.println("Ingrese su pin: ");
            int pinIngresado = scanner.nextInt();
        
        if(pinIngresado==PIN_CORRECTPO){
            System.out.println("Bienvenido Pichurria");
    
        }else{
            intentos++;
            System.out.println("Pin Incorrecto. Mosca Pues"+intentos);
        }
        if (intentos==3) {
            cuentaBloqueada= true;
            System.out.println("Mera Gueva, cuenta bloqueada");
            
        }

        //Si la cuenta está bloqueada finalice el programa 
        if (cuentaBloqueada) {
            scanner.close();
            return;
        }
         
        //Menú del Cajero 
        int opcion;
        do{
            System.out.println("Bienvenido a su cajero Groserón ");
            System.out.println("1. Consultar Chichigua ");
            System.out.println("2. Retirar Menuda ");
            System.out.println("3. Depositar Money ");
            System.out.println("4. Abrirse del Parche ");
            opcion = scanner.nextInt();

            // manejo de opciones
            
            switch (opcion) {
                case 1:
                    System.out.println("Ay marica tenes apenas $$ " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanta chichigua vas a sacar? " );
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("Su nueva chichigua es de: " + saldo);
                    }else{
                        System.out.println("Oigan a esta gueva, si solo tenes  " + saldo);
                        

                    }
                    break;
                case 3:
                    System.out.println("Empiece a cantar, cuanta plata va a consignar? ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0){
                        saldo += deposito;
                        System.out.println("Manoo, su nueva consignacion fue exitosa. su saldo es: "+ saldo);
                    }else{
                        System.out.println("Despierte pues mijo, ese valor no se puede!!! ");
                    }
                break;
                case 4: 
                System.out.println("Suerte pues mi amor, perdete! ");
                break;
                default:
                System.out.println("Bajese de esa nube ome gueva");

            }
        } while(opcion!=4);
        scanner.close();
            
        }

    }
}
