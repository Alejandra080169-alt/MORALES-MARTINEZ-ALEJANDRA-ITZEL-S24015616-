import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cal, aprobados = 0, reprobados = 0, suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la calificación del alumno " + i + ": ");
            cal = sc.nextInt();

            suma += cal;

            if (cal >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / 5.0;

        System.out.println("\nTotal de aprobados: " + aprobados);
        System.out.println("Total de reprobados: " + reprobados);
        System.out.println("Promedio del grupo: " + promedio);
    }
}
