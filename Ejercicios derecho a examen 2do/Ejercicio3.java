import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int adeudo = 1000;
        int opcion;
        String seguir = "si";

        while (seguir.equalsIgnoreCase("si")){

            System.out.println("\n--- Cajero Servicio de Energía ---");
            System.out.println("1. Consulta");
            System.out.println("2. Pago del mes");
            System.out.println("3. Pago de adeudo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su adeudo actual es: $" + adeudo);
                    break;
                case 2:
                    System.out.println("Pago del mes realizado.");
                    adeudo -= 200;
                    break;
                case 3:
                    System.out.println("Pago del adeudo realizado.");
                    adeudo = 0;
                    break;
                case 4:
                    System.out.println("Gracias por usar el servicio.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.print("¿Desea realizar otra operación? (si/no): ");
            seguir = sc.next();
        }

        System.out.println("Operación finalizada. ¡Gracias!");
    }
}
