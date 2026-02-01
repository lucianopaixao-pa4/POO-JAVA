package HerancaPolimofismo.exemplo2;

public class PF extends Contribuinte {
    private Double imposto;

    public PF(String nome){
        super(nome);
    }

    @Override
    public Double cacularImposto(double valorReceita) {
        if (valorReceita >= 0.0 && valorReceita <= 1400.0){
            return 0.0;
        }else if (valorReceita >= 1400.01 && valorReceita <= 2100.0){
            this.imposto = valorReceita * 0.10;
            return this.imposto;
        }else if (valorReceita >= 2000.01 && valorReceita <= 2800.00){
            this.imposto = valorReceita * 0.15;
            return this.imposto;
        }else if (valorReceita >= 2800.01 && valorReceita <= 3600.0){
            this.imposto = valorReceita * 0.25;
            return this.imposto;
        }else if (valorReceita >= 3600.01 && valorReceita <= Double.MAX_VALUE){
            this.imposto = valorReceita * 0.30;
            return this.imposto;
        }else {
            System.out.println("valor???");
            return 0.0;
        }
    }

}