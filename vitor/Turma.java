package vitor;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private List<String> disciplinas;
    private List<Aluno> alunos;
    private List<Conhecimento> conhecimentos;

    public Turma(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<String>();
        this.alunos = new ArrayList<Aluno>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);

    }
    public void addDisciplina(String disciplinas){
        this.disciplinas.add(disciplinas);
    }

    public void removerAluno(int index){
        this.alunos.remove(index);
    }

    public Aluno getAlunos(int index){
        return this.alunos.get(index);

    }

    public String getNome() {
        return nome;
    }

    public void addConhecimento(String valor){
        Conhecimento novoConhecimento = new Conhecimento("FODA");
//        this.conhecimentos.add(Conhecimento);
    }
}
