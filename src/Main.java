import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la oración: ");
        String oracion = sc.nextLine();
    
        Analizador analizador = new Analizador();
    
        String token = "";
        for (int i = 0; i < oracion.length(); i++) {
            char c = oracion.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '.') {
                // Si el caracter es una letra, un número o un punto decimal, lo agregamos al token
                token += c;
            } else {
                // Si el caracter es un símbolo o un operador, analizamos el token actual y luego lo reseteamos
                if (!token.isEmpty()) {
                    analizador.analizar(token);
                    token = "";
                }
                analizador.analizar(String.valueOf(c)); // Analizamos el símbolo u operador actual
            }
        }
    
        // Analizamos el último token de la cadena si es que aún no se ha analizado
        if (!token.isEmpty()) {
            analizador.analizar(token);
        }
    
        sc.close();
    }
    
}
