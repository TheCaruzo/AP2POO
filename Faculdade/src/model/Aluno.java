package model;

public class Aluno {
    // Definindo atributos
    private String matricula;
    private String nome;

    // Construtor
    //método usado para criar um objeto.

    public Aluno(String matricula, String nome) {
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