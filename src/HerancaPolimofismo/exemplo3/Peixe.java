package HerancaPolimofismo.exemplo3;

public class Peixe extends Animal{
    private String caracteristicas;


    public Peixe(String ambiente, Double comprimnto, String cor, String nome, Double velocidade) {
        super(ambiente, comprimnto, cor, nome, velocidade);
        this.setNumeroDePatas(0);
        this.caracteristicas = "Barbatanas e caudas";
    }

    public Peixe(){}

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString() {
        String s = super.toString();
        s += "\nCaracterísticas: " + this.caracteristicas;
        return s;
    }
}
