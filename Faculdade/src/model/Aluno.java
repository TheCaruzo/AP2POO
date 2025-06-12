package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
    // Definindo atributos
    private String matricula;
    private String nome;
    private Set<Disciplina> disciplina;

    // Construtor
    //método usado para criar um objeto.

    public Aluno(String matricula, String nome) {
        this.disciplina = new HashSet<Disciplina>();
        this.matricula = matricula; // This faz referencia do atributo
        this.nome = nome;
    }
    // Return do objeto

    public String getMatricula() {
        return matricula;

    }

    // Passa o valor
    public  void  setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    }
