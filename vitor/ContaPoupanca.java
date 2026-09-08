package vitor;

public class ContaPoupanca extends ContaBancaria {

    private double rendimento;

    public ContaPoupanca(double saldo, String titular, double rendimento ) {
        super(saldo,titular);
        this.rendimento = rendimento;

    }
}
