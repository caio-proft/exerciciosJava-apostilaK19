public class Exercicio3 {
    public static void main(String[] args) {

        int primeiro;
        int segundo;
        int soma;
        int i;

        primeiro = 0;
        segundo = 1;

        System.out.println(primeiro);
        System.out.println(segundo);
        for(i = 0; i < 28; i++){
            soma = primeiro + segundo;
            System.out.println(soma);
            primeiro = segundo;
            segundo = soma;
        }
    }
}
