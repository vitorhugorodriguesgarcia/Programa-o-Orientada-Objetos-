package vitor;

public class Gerente  extends Funcionario {

    private int bonusSalario;

    public Gerente(String nome, int salario, int bonusSalario){
        super(nome, salario);
        this.bonusSalario = bonusSalario;
    }

}
