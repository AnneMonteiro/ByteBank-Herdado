package Aplication;

//Gerente e um funcionario, ele herda da classe Funcionario os atributos e comportamentos,
// assina o contrato autenticavel, eh um autenticavel


public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao(){
        System.out.println("Chamando metodo de bonificação GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
        }
}
