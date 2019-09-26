import java.io.*;
import java.util.Scanner;

public class GravaEmOutroArquivo {
    public static void main(String[] args) throws IOException {

        // Lendo os dados do arquivo chamado entrada.txt
        InputStream arquivo1 = new FileInputStream("entrada.txt");
        Scanner sc = new Scanner(arquivo1);

        FileOutputStream arquivo2 = new FileOutputStream("saida.txt");
        PrintStream printStream = new PrintStream(arquivo2);

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            printStream.println(linha);
        }
    }
}
