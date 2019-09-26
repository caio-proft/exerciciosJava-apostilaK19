public class TestaControleDePonto {
    public static void main(String[] args) {

        // Instanciando a classe ControloDePonto
        ControleDePonto controle = new ControleDePonto();

        // Instanciando classe Telefonista e atibuindo valores
        Telefonista t1 = new Telefonista();
        t1.setNome("Maiara");
        t1.setRg("98452126-7");
        t1.setRamal(14);

        // Utilizando a classe ControleDePonto para registrar a entrada
        controle.controleDeEntrada(t1);

        // Instanciando classe Gerente e atibuindo valores
        Gerente g1 = new Gerente();
        g1.setNome("Marina");
        g1.setRg("32568785-4");
        g1.setCodigoDeAcesso(345);

        // Utilizando a classe ControleDePonto para registrar a entrada dos funcionários
        controle.controleDeEntrada(g1);

        // Utilizando a classe ControleDePonto para registrar a saída dos funcuonários
        controle.controleDeSaida(t1);
        controle.controleDeSaida(g1);
    }
}
