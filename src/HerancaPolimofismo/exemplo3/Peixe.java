package HerancaPolimofismo.exemplo3;

public class Peixe extends Animal{
    private String carecteristicas = "Barbatanas e caudas";


    public Peixe(String ambiente, Double comprimnto, String cor, String nome, Double velocidade) {
        super(ambiente, comprimnto, cor, nome, velocidade);
    }

    @Override
    public void setNumeroDePatas(Integer numeroDePatas) {
        super.setNumeroDePatas(0);
    }
}
