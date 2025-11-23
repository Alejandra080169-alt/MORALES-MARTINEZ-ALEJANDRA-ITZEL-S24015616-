import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] alumnos = new int[3][4]; 
        int nivel, idioma;

        System.out.println("Se capturarán 12 alumnos.\n");

        for (int i = 1; i <= 12; i++){
            System.out.println("Alumno " + i);

            do {
                System.out.print("Nivel (1=Básico, 2=Medio, 3=Perfeccionamiento): ");
                nivel = sc.nextInt();
            } while (nivel < 1 || nivel > 3);

            do {
                System.out.print("Idioma (0=Inglés, 1=Francés, 2=Alemán, 3=Ruso): ");
                idioma = sc.nextInt();
            } while (idioma < 0 || idioma > 3);

            alumnos[nivel - 1][idioma]++;
        }

        System.out.println("\n--- MATRIZ DE ALUMNOS ---");
        System.out.println("Filas = Niveles | Columnas = Idiomas");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(alumnos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

