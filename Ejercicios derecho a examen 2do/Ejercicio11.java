import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[8];

        for (int i = 0; i < 8; i++){
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Ingresa un número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 8; i++){
            if (nums[i] == buscar){
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número SÍ está en el arreglo.");
        } else {
            System.out.println("El número NO está en el arreglo.");
        }
    }
}
