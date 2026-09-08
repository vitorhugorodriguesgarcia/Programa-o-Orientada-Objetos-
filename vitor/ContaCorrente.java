package vitor;

public class ContaCorrente extends ContaBancaria {

    private double limiteCredito;

    public ContaCorrente(double saldo, String titular, double limiteCredito) {
        super(saldo, titular);
        this.limiteCredito = limiteCredito;
    }


}
