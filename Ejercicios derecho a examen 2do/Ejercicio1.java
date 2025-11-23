import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Ingresa el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            i++;
        }

        System.out.println("\nLos nombres ingresados son:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
