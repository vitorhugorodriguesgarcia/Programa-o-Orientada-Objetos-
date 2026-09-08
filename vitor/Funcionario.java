package vitor;

public class Funcionario {
    private String nome;
    private int salario;

    private Gerente bonusSalario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }



    public void exibirInformacoes(){
        System.out.printf("Nome: %s\n",nome);
        System.out.printf("Salario: %d\n",salario);
        System.out.printf("Bonus: %d\n",bonusSalario);
    }
}
