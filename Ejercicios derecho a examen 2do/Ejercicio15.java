import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] paises = new String[4];
        double[][] temperaturas = new double[4][3];  
        double[] promedios = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del país " + (i + 1) + ": ");
            paises[i] = sc.nextLine();
        }

        System.out.println("\n--- Captura de temperaturas trimestrales ---");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nTemperaturas del país: " + paises[i]);

            for (int j = 0; j < 3; j++) {
                System.out.print("Temperatura del mes " + (j + 1) + ": ");
                temperaturas[i][j] = sc.nextDouble();
                promedios[i] += temperaturas[i][j];
            }

            promedios[i] /= 3.0;
        }

        System.out.println("\n--- Tabla de temperaturas registradas ---");
        for (int i = 0; i < 4; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(temperaturas[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n--- Promedio trimestral de cada país ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(paises[i] + " → " + promedios[i]);
        }

        double mayor = promedios[0];
        int indiceMayor = 0;

        for (int i = 1; i < 4; i++) {
            if (promedios[i] > mayor) {
                mayor = promedios[i];
                indiceMayor = i;
            }
        }

        System.out.println("\nEl país con mayor temperatura trimestral es: " +
                paises[indiceMayor] + " con " + mayor + "°C");
    }
}
