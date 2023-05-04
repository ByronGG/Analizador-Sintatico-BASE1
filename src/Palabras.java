public class Palabras {

    public static boolean esPalabra(String cadena) {
        for(int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if(!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == 'ñ')) {
                return false;
            }
        }
        return true;
    }
    
}
