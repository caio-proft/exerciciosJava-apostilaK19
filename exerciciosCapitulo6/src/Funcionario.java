public class Funcionario {
    String nome;
    double salario;
    static double valeRefeicaoDiario;

    static void reajusteValeAlimentacaoDiario(double taxa){
        Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
    }
}
