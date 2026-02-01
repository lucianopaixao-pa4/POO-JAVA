package RelacionamentoEntreClasses.exemplo2;


public class TestarCurso {
    public static void main(String[] args) {
        Professor prof = new Professor("Ciencias Forenses", "lucaspaulo@gmail.com",
                "Lucas Paulo");

        Curso curso = new Curso("Das 14 as 18", "Sistemas de Informacão",prof);
        curso.matricularAlunos();
        curso.calcularMediaTurma();

    }
}
