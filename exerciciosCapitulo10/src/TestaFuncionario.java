public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente func1 = new Gerente();

        func1.setNome("Rogerio");
        func1.setRg("45985621-6");
        func1.setSalario(2500);
        func1.setSenha(3256);

        System.out.println("Nome do funcionário: " + func1.getNome());
        System.out.println("RG: " + func1.getRg());
        System.out.println("Salário: R$" + func1.getSalario());
        System.out.println("Bonificaçao do funcionário: R$" + func1.calculaBonificacao());
    }
}
