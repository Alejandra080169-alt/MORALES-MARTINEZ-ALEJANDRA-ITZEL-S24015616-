public class Ejercicio8{
    public static void main(String[] args){

        double ahorroMensual = 500;
        double totalAhorrado = 0;

        for (int mes = 1; mes <= 12; mes++){
            totalAhorrado += ahorroMensual;
            totalAhorrado += totalAhorrado * 0.09;  
        }

        System.out.println("Total ahorrado durante el año: $" + totalAhorrado);
    }
}
