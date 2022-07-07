package Aplication;

public class EditorVideo extends Funcionario {
    public double getBonificacao() {
        System.out.println("Chamando metodo de bonificação EDITOR DE VIDEO");
        return super.getBonificacao() + 100;

    }
}
