package  model;


import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private int id;
    private String nome;
    private  int cargahora;
    private Set<Turma> turma;



    public Disciplina(int id, String nome, int cargahora) {
        this.turma = new HashSet<Turma>();
        this.id   = id;
        this.nome = nome;
        this.cargahora = cargahora;
    }

    public int getId(){
        return  id;
    }
    public String getNome(){
        return nome;
    }
    public  int getCargahora(){
        return  cargahora;
    }

    public void setId(int id){
        this.id = id;
    }

    public  void setNome(String nome){
        this.nome = nome;
    }

    public void setCargahora(int cargahora){
        this.cargahora = cargahora;
    }

    // Relacionamentos

    // Criar a lista de turma
    public void addTurma(Turma turma){
        this.turma.add(turma);
    }
    // Remove algum objeto de turma
    public void removeTurmas(Turma turma){
        this.turma.remove(turma);
    }

    //Retorna a lista de turma
    public Set<Turma> getTurmas(){
        return turma;
    }

    //Muda a lista de turma
    public  void setTurmas(Set<Turma> turma){
        this.turma = turma;
    }

}


