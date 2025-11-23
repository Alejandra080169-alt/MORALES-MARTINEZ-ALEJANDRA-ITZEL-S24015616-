import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] ventas = new double[7];
        double total = 0;
        double mayor = 0;

        for (int i = 0; i < 7; i++){
            System.out.print("Venta del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();

            total += ventas[i];

            if (ventas[i] > mayor){
                mayor = ventas[i];
            }
        }

        System.out.println("\nVenta total de la semana: $" + total);
        System.out.println("Día con mayor venta: $" + mayor);
    }
}
