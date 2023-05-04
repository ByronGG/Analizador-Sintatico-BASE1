import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la oración: ");
        String oracion = sc.nextLine();

        String[] palabras = oracion.split(" "); // Separar la oración en palabras

        Analizador analizador = new Analizador();

        for (String palabra : palabras) {
            analizador.analizar(palabra);
        }

        sc.close();
    }
}
