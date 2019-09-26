public class Exercicio2 {
    public static void main(String[] args) {

        String linha = "*";
        int i;

        for(i = 1; i <= 8; i++){
            System.out.println(linha);
            if (i % 4 == 0){
                linha = "*";
            }else {
                linha += "*";
            }
        }
    }
}
