package RelacionamentoEntreClasses.exemplo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String NomedoCurso;
    private String Horario;
    private Professor Professor;
    private ArrayList<Aluno> Alunos = new ArrayList<>();

    public ArrayList<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        Alunos = alunos;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getNomedoCurso() {
        return NomedoCurso;
    }

    public void setNomedoCurso(String nomedoCurso) {
        NomedoCurso = nomedoCurso;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor professor) {
        Professor = professor;
    }

    public Curso(String horario, String nomedoCurso, Professor professor) {
        Horario = horario;
        NomedoCurso = nomedoCurso;
        Professor = professor;
    }

    // Para imprimir somente alunos
    void imprimirAlunos(){
        for(Aluno aluno : Alunos){
            System.out.println(aluno.calcularMedia());
        }

    }

    void calcularMediaTurma(){
        double media = 0.0;
        for(Aluno aluno : Alunos){
            media += aluno.calcularMedia();
        }
        Double resul = media / this.Alunos.size();
        System.out.println("media da turma "+ resul);
    }

    public void matricularAlunos(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe a quantidade de alunos que serão matriculados na turma");
        int nu = leitor.nextInt();
        for(int i = 1; i <= nu; i++){
            System.out.println("Informe o matricula do aluno");
            String matricula = leitor.next();
            System.out.println("Informe o nome do aluno");
            String nome = leitor.next();
            System.out.println("Informe o nota 1 do aluno");
            double nota1 = leitor.nextDouble();
            System.out.println("Informe o nota 2 do aluno");
            double nota2 = leitor.nextDouble();
            System.out.println("Informe o nota 3 do aluno");
            double nota3 = leitor.nextDouble();
            System.out.println("Informe o nota 4 do aluno");
            double nota4 = leitor.nextDouble();

            this.Alunos.add(new Aluno(matricula, nome, nota1, nota2, nota3, nota4));
        }
    }
}
