package org.example;

public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerFesta(){
        System.out.printf("Parabéns, grande pix + 1 ano pra conta");
        this.idade++;
    }

}
