package HerancaPolimofismo.exemplo2;

public class PJ extends Contribuinte {
    private Double imposto;

    public PJ(String nome){
        super(nome);
    }

    @Override
    public Double cacularImposto(double valorReceita) {
        this.imposto = valorReceita * 0.10;
        return this.imposto;
    }
}
