package model;



public class Turma {
    private String id;
    private  String diaDaSemana;
    private  String horario;
    private  String sala;

    private Professor professor;
    private Disciplina disciplina;

    public Turma(String id, String diaDaSemana, String horario, String sala, Professor professor, Disciplina disciplina){
        this.id = id;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Turma (String id, String diaDaSemana, String horario, String sala, Disciplina disciplina){
        this.id = id;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public String getId(){
        return  id;
    }
    public void setId(String id){
        this.id = id;
    }
    public  String getDiaDaSemana(){
        return  diaDaSemana;
    }
    public void setDiaDaSemana(String diaDaSemana){
        this.diaDaSemana = diaDaSemana;
    }
    public String getHorario(){
        return  horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    public model.Professor getProfessor(){
        return professor;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public model.Disciplina getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public String getSala(){
        return sala;
    }

    public  void  setSala(String sala){
        this.sala = sala;
    }
}

