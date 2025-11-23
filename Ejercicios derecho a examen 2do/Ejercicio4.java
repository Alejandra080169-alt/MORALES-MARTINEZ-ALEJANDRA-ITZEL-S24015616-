import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double saldo = 5000;
        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {
            System.out.println("\nSaldo actual: $" + saldo);
            System.out.print("Ingrese el monto a retirar: ");
            double retiro = sc.nextDouble();

            if (retiro <= saldo) {
                saldo -= retiro;
                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }

            System.out.print("¿Desea realizar otro retiro? (si/no): ");
            continuar = sc.next();
        }

        System.out.println("Gracias por usar el cajero.");
    }
}
