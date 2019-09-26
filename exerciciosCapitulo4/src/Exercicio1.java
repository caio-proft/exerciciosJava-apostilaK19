import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[]  numeros = new double[]{9, 10, 15, 22, 6};
        double media;
        media = 0;
        int i;

        for(i = 0; i < numeros.length; i++){
            media += numeros[i];
        }
        media = media / numeros.length;
        System.out.println("A média dos números é: " + media);

    }
}
