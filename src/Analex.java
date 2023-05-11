import java.io.*;

public class Analex {
    public static void main(String[] args) {
        Yylex scanner = new Yylex(new FileReader("input.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String token;
        while(token = scanner.yylex() != null){
            writer.write("(" + scanner.yyline + "," + scanner.yycolumn + ") " + token + "\n");
        }
        writer.close();
    }
}