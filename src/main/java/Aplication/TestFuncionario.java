package Aplication;

public class TestFuncionario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

    Funcionario anne = new Gerente();
    anne.setNome("Anne");
    anne.setCpf("123.456.789-01");
    anne.setSalario(5000.00);

        System.out.println("NOME DO FUNCIONARIO: "+anne.getNome());
        System.out.println("CPF: " +anne.getCpf());
        System.out.println("VALOR DA BONIFICAÇÃO: " +anne.getBonificacao());

}

}
