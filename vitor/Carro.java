package vitor;

public class Carro extends Veiculo{

    private int qtdPortas;


    public Carro(String marca,String modelo, int qtdPortas){
        super(marca, modelo);
        this.qtdPortas = qtdPortas;
    }
}
