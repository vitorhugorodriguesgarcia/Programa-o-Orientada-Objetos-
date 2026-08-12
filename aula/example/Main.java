package org.example;

public class Main {
    public static void main(String[] args) {

        Pessoa alessandra = new Pessoa("Alessandra Duque Galdeano", 90);
        System.out.printf("Idade de agora: %d\n", alessandra.idade);
        alessandra.fazerFesta();
        alessandra.fazerFesta();

        System.out.printf("\nNova idade de(a) %s é %d anos\n", alessandra.nome, alessandra.idade);

        if (alessandra.idade >=90){
            System.out.printf("idosa\n");
        }else{
            System.out.printf("Deu sorte\n");
        }
    }
}