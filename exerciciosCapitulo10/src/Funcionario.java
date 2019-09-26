 abstract class Funcionario {

        // Atributos da classe
        private String nome;
        private String rg;
        private double salario;

        // Getters e Setters
        public String getNome(){
            return  this.nome;
        }
        public String getRg(){
            return this.rg;
        }
        public double getSalario(){
            return this.salario;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setRg(String rg){
            this.rg = rg;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        public abstract double calculaBonificacao();
}
