package Control;

import model.Turma;
import model.Aluno;
import model.Professor;
import model.Disciplina;
import model.Curso;



public class Programa {
    public static void main(String[] args) {

        Curso EngenhariSoft = new Curso("Engenharia de Software", "Tech", "563");
        Curso cienciaDados = new Curso("Ciencia de Dados", "A melhor", "589");

        Disciplina poo = new Disciplina(15, "Poo", 80);
        Disciplina eng = new Disciplina(156, "Engenahria de Dados", 80);


        Professor profAnderson = new Professor("8978", "Anderson", "Mestre");
        Professor profTalita = new Professor("8985", "Talita", "Doutora");
        Professor profThiago = new Professor("8976", "Thiago", "Enrolado");

        Aluno aluno1 = new Aluno("1753", "Gabriel Caruzo");
        Aluno aluno2 = new Aluno("4553", "João Carlos");
        Aluno aluno3 = new Aluno("8666", "Juliana Costa");
        Aluno aluno4 = new Aluno("8936", "Ana Carolina");


        Turma engDados = new Turma("8756", "Segunda", "18:40", "153", profAnderson, eng);
        Turma poo1 = new Turma("8763", "Quarta", "7:40", "155", profTalita, poo);
        Turma poo2 = new Turma("8752", "Quinta", "7:40", "157", profThiago, poo);


        profAnderson.addTurma(poo1);
        profTalita.addTurma(poo2);
        poo.addTurma(poo1);
        poo.addTurma(poo2);
        poo1.addAluno(aluno1);
        poo1.addAluno(aluno2);
        poo1.addCurso(cienciaDados);
        engDados.addAluno(aluno2);
        engDados.addAluno(aluno1);
        engDados.addCurso(cienciaDados);



        // Quais as disciplinas de um determinado professor?
        for (Turma turma : profTalita.getTurma()) {
            System.out.println(turma.getDisciplina().getNome());

        }

        //Quais professores minsitram a disciplina POO?
        for (Turma turma : poo.getTurmas()) {
            System.out.println(turma.getProfessor().getNome());
        }

        for (Aluno aluno : poo1.getAluno()) {
            System.out.println(aluno.getNome());
        }
        for (Curso curso : poo1.getCurso()) {
            System.out.println(curso.getCurso());

        }
        for (Aluno aluno: engDados.getAluno()){
            System.out.println("Nome " + aluno.getNome() + " Matricula " + aluno.getMatricula() + " Turmas " + eng.getNome() + " Curso " + cienciaDados.getCurso() + " Area " + cienciaDados.getArea());
        }
    }
}




