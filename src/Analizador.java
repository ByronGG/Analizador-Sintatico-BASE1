
public class Analizador {

    public void analizar(String cadena) {
        if (Numerico.esEntero(cadena)) {
            System.out.println(cadena + " <- ENTERO");
        } else if (Numerico.esDecimal(cadena)) {
            System.out.println(cadena + " <- DECIMAL");
        } else if (Algebraico.esOperadorAlgebraico(cadena)) {
            System.out.println(cadena + " <- SIGNO ALGEBRAICO");
        } else if (Logico.esOperadorLogico(cadena)) {
            System.out.println(cadena + " <- SIGNO LOGICO");
        } else if (Logico.esOperadorRelacional(cadena)) {
            System.out.println(cadena + " <- SIGNO RELACIONAL");
        } else if (Puntuacion.esSeparador(cadena)) {
            System.out.println(cadena + " <- SEPARADOR");
        } else if (Puntuacion.esPuntuacion(cadena)) {
            System.out.println(cadena + " <- SIGNO DE PUNTUACION");
        } else if (Palabras.esPalabra(cadena)){
            System.out.println(cadena + " <- PALABRA");   
        } else {
            System.out.println(cadena + " <- DESCONOCIDO");
        }
    }
    
}
