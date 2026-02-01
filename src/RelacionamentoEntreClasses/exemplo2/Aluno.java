package RelacionamentoEntreClasses.exemplo2;

public class Aluno {
    private String Nome;
    private String Matricula;
    private Double Nota1;
    private Double Nota2;
    private Double Nota3;
    private Double Nota4;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.Matricula = matricula;
        this.Nome = nome;
        this.Nota1 = nota1;
        this.Nota2 = nota2;
        this.Nota3 = nota3;
        this.Nota4 = nota4;
    }

    public Double calcularMedia(){
        double media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

        if (media >= 7){
            System.out.println("Aluno: "+ Nome + "\nMatricula: " + Matricula + "\nEstá aprovado " + "\nNota: "
                    + media);
            System.out.println(" ");
        }else{
            System.out.println("Aluno: "+ Nome + "\nMatricula: " + Matricula + "\nEstá reprovado " + "\nNota: "
                    + media);
            System.out.println(" ");
        }

        return media;
    }


    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getNota1() {
        return Nota1;
    }

    public void setNota1(Double nota1) {
        this.Nota1 = nota1;
    }

    public Double getNota2() {
        return Nota2;
    }

    public void setNota2(Double nota2) {
        this.Nota2 = nota2;
    }

    public Double getNota3() {
        return Nota3;
    }

    public void setNota3(Double nota3) {
        this.Nota3 = nota3;
    }

    public Double getNota4() {
        return Nota4;
    }

    public void setNota4(Double nota4) {
        this.Nota4 = nota4;
    }
}
