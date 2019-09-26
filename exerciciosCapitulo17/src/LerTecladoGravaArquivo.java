import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LerTecladoGravaArquivo {
    public static void main(String[] args) throws IOException {

        // Lendo os dados do teclado
        InputStream teclado = System.in;
        Scanner sc = new Scanner(teclado);

        // Criando o arquivo que será salvo o conteúdo digitado
        FileOutputStream arquivo = new FileOutputStream("recebeDoTeclado.txt");
        PrintStream printStream = new PrintStream(arquivo);

        //Laço para verificar o sc até que seja finalizada as entradas com CTRL + D;
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            printStream.println(linha);
        }
    }
}
