package Aplication;

//Gerente e um funcionario, ele herda da classe Funcionario os atributos e comportamentos


public class Gerente extends Funcionario {


    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    private int senha;

    public boolean autentica(int senha) {
        if (senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //public double getBonificacao(){
    //    return this.Salario();
    //}

}
