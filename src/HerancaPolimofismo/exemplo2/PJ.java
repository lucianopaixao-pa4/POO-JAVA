package HerancaPolimofismo.exemplo2;

public class PJ extends Contribuinte {
    private String cnpj;

    public PJ(String nome, double rendaBruta ){
        super(nome, rendaBruta);
    }

    public PJ(){
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public Double cacularImposto() {
        return getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "PJ{" + super.toString() +
                "cnpj: " + cnpj + '\'' +
                '}';
    }
}
