package HerancaPolimofismo.exemplo3;

public class Mamifero extends Animal{
    private String Alimento;

    public Mamifero(String ambiente, Double comprimento, String cor, String nome, Double velocidade, String alimento) {
        super(ambiente, comprimento, cor, nome, velocidade);
        this.Alimento = alimento;
    }
    public Mamifero(){}

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: " + Alimento;
        return s;
    }
}
