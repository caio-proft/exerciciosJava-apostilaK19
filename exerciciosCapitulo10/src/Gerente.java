public class Gerente extends Funcionario {

    //Atributos da classe
    private int senha;
    // Getters e Setters
    public int getSenha() {
        return this.senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public double calculaBonificacao(){
        return this.getSalario() * 0.3 + 200;
    }

}
