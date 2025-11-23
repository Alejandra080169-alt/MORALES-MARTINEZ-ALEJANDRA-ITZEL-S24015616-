public class Ejercicio17{

    public static void main(String[] args){

        String[][] atletas = {
                {"Sofia", "Murrieta", "100 m", "12.5"},
                {"Luis", "Luna", "200 m", "23.4"},
                {"Karen", "Morales", "400 m", "53.2"},
                {"Alejandra", "Martinez", "100 m", "11.8"},
                {"María", "Ojeda", "800 m", "125"}
        };
        double mejorTiempo = Double.parseDouble(atletas[0][3]);
        int indiceMejor = 0;

        for (int i = 1; i < atletas.length; i++) {
            double tiempoActual = Double.parseDouble(atletas[i][3]);
            if (tiempoActual < mejorTiempo) {
                mejorTiempo = tiempoActual;
                indiceMejor = i;
            }
        }

        System.out.println("Nombre\tApellido\tEspecialidad\tTiempo (s)");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < atletas.length; i++) {
            if (i == indiceMejor) {
                // Resaltar al mejor atleta con ***
                System.out.println("*** " +
                        atletas[i][0] + "\t" +
                        atletas[i][1] + "\t\t" +
                        atletas[i][2] + "\t\t" +
                        atletas[i][3] + "  <-- Mejor tiempo");
            } else {
                System.out.println(atletas[i][0] + "\t" +
                        atletas[i][1] + "\t\t" +
                        atletas[i][2] + "\t\t" +
                        atletas[i][3]);
            }
        }

        System.out.println("\nEl atleta con mejor tiempo es: " +
                atletas[indiceMejor][0] + " " + atletas[indiceMejor][1] +
                " con " + mejorTiempo + " segundos.");
    }
}
