import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros en orden inverso:");
        for (int i = 9; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}
