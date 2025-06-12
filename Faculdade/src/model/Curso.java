package model;


import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String curso;
    private String area;
    private String id;
    private Set<Disciplina> disciplina;


    public Curso(String curso, String area, String id) {
        this.curso = curso;
        this.area = area;
        this.id = id;
        this.disciplina = new HashSet<Disciplina>();


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
