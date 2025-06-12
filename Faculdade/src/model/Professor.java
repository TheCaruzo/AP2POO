package model;


import java.util.HashSet;
import java.util.Set;


public class Professor {
    private String matricula;
    private String nome;
    private String titulacao;
    private Set<Turma> turma;



    public Professor(String matricula, String nome, String titulacao) {
        this.turma = new HashSet<Turma>();
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return  titulacao;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    // Relacionamento
    public  void addTurma(Turma turma){
        this.turma.add(turma);
    }

    public void removeTurma(Turma turma){
        this.turma.remove(turma);
    }

    public Set<Turma> getTurma() {
        return turma;
    }


    public void setTurma(Set<Turma> turma){
        this.turma = turma;
    }
}

