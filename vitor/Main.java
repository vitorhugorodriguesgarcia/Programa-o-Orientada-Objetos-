package vitor;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite Alguma coisa:");


        Aluno lucas = new Aluno("Lucas","72728282-2");
        Aluno dalbem = new Aluno("Dalbem","72728282-3");
        Aluno duque = new Aluno("Duque","72728282-4");

        Turma esoft = new Turma("Eng Soft");
        esoft.addDisciplina("P00");
        esoft.addDisciplina("SO");

        esoft.addAluno(lucas);
        esoft.addAluno(dalbem);
        esoft.addAluno(duque);

        int tamanhoLista = esoft.getAlunos().size();

        System.out.printf("Turma: %s\n",esoft.getNome());

        for (int i = 0; i<tamanhoLista;i++){
            Aluno aluno = esoft.getAlunos().get(i);

            System.out.printf("Aluno: %d: %s\n",i,aluno.getNome());

        }
    }
}
