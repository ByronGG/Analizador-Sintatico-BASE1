public class Logico {

    public static boolean esOperadorLogico(String cadena) {
        String[] operadores = { "&", "|", "!" };
        for (String operador : operadores) {
            if (cadena.equals(operador)) {
                return true;
            }
        }
        return false;
    }

    public static boolean esOperadorRelacional(String cadena) {
        String[] operadores = { "==", "!=", "<=", ">=", "<", ">" };
        for (String operador : operadores) {
            if (cadena.equals(operador)) {
                return true;
            }
        }
        return false;
    }
}
