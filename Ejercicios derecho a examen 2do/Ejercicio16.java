import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        System.out.println("--- Registro de artículos de ropa ---");

        for (int i = 0; i < 3; i++) {
            System.out.print("\nNombre del artículo (Camisa, Zapato, Pantalón): ");
            articulos[i][0] = sc.nextLine();

            System.out.print("Talla: ");
            articulos[i][1] = sc.nextLine();

            System.out.print("Color: ");
            articulos[i][2] = sc.nextLine();
        }

        System.out.println("\n--- Tabla de artículos capturados ---");
        System.out.println("Artículo\tTalla\tColor");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                articulos[i][0] + "\t" +
                articulos[i][1] + "\t" +
                articulos[i][2]
            );
        }
    }
}
