import java.util.Locale;

public class TestaConta {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // Instanciando objetos do tipo conta
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        // Atribuindo valores ao objeto utilizando o método set
        conta1.setNumero(1234);
        conta1.setSaldo(500.00);
        conta1.setLimite(300.00);

        conta2.setNumero(5678);
        conta2.setSaldo(1000.00);
        conta2.setLimite(400.00);
        // Exibindo os valores utilizando o método get
        System.out.println("Número da conta: " + conta1.getNumero());
        System.out.println("Saldo da conta: R$" + conta1.getSaldo());
        System.out.println("Limite da conta: R$" + conta1.getLimite());

        System.out.println("Número da conta: " + conta2.getNumero());
        System.out.println("Saldo da conta: R$" + conta2.getSaldo());
        System.out.println("Limite da conta: R$" + conta2.getLimite());
    }
}
