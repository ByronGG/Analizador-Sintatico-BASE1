
public class Puntuacion {

    public static boolean esSeparador(String cadena) {
        return cadena.contains(" ") || cadena.contains("\n");
    }

    public static boolean esPuntuacion(String cadena) {
        String[] signos = {",", ".", ";", ":", "!", "?"};
        char lastChar = cadena.charAt(cadena.length() - 1);
        for (String signo : signos) {
            if (lastChar == signo.charAt(0)) {
                return true;
            }
        }
        return false;
    }
    
}
