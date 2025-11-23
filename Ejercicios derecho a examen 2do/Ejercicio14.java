import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[4];
        double[][] sueldos = new double[4][3];
        double[] totales = new double[4];

       
        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Sueldo del mes " + (j + 1) + ": ");
                sueldos[i][j] = sc.nextDouble();
                totales[i] += sueldos[i][j];
            }
            sc.nextLine(); 
        }

       
        System.out.println("\n--- Sueldo total de cada empleado en 3 meses ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(empleados[i] + ": $" + totales[i]);
        }


        double mayor = totales[0];
        int idxMayor = 0;

        for (int i = 1; i < 4; i++) {
            if (totales[i] > mayor) {
                mayor = totales[i];
                idxMayor = i;
            }
        }

        System.out.println("\nEl empleado que más ganó es: " + empleados[idxMayor] + " con $" + mayor);
    }
}
