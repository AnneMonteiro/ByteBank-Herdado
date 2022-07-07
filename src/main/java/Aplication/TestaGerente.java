package Aplication;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Sr. Tuminus");
        g1.setCpf("1233441415");
        g1.setSalario(5000.0);

        System.out.println("Nome GERENTE: "+g1.getNome());
        System.out.println("CPF: " +g1.getCpf());
        System.out.println("Salário: "+g1.getSalario());
        System.out.println("Bonificação: "+g1.getBonificacao());

        g1.setSenha(44455);
        boolean autenticou = g1.autentica(44455);

        System.out.println("Senha correta: " +autenticou);
    }
}
