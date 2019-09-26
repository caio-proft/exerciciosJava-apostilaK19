import java.util.Locale;

public class TestaFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Testando o atributo do vale alimentação estático
        System.out.println("Valor do vale alimentação diária: R$" + Funcionario.valeRefeicaoDiario);
        Funcionario.valeRefeicaoDiario = 18;
        System.out.println("Valor do vale alimentação diário: R$" + Funcionario.valeRefeicaoDiario);

        // Testando o método estático para ajudar o vale alimentação
        System.out.println("Vale sem reajuste: R$" + Funcionario.valeRefeicaoDiario);
        Funcionario.reajusteValeAlimentacaoDiario(0.10);
        System.out.println("Vale após reajuste: R$" + Funcionario.valeRefeicaoDiario);
    }
}
