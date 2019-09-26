import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        int i;
        double maiorNumero;


        System.out.println("Digite 5 números para encontrar o maior entre eles: ");
        for(i = 0; i < 5; i++){
            numeros[i] = sc.nextDouble();
        }
        maiorNumero = numeros[0];
        // Encontrando o maior número
        for(i = 0; i < 5; i++){
            if (numeros[i] >= maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O maior número entre os digitados é: " + maiorNumero);
    }
}
