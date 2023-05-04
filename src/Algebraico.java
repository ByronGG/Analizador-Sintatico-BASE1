public class Algebraico{
    
    public static boolean esOperadorAlgebraico(String cadena) {
        String[] operadores = {"+", "-", "*", "/", "^", "(", ")"};
        for (String operador : operadores) {
            if (cadena.contains(operador)) {
                return true;
            }
        }
        return false;
    }
}