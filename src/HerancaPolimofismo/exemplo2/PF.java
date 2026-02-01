package HerancaPolimofismo.exemplo2;

public class PF extends Contribuinte {
    private String cpf;

    public PF(String nome, double rendaBruta){
        super(nome, rendaBruta);
    }

    public PF(){
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public Double cacularImposto() {
        double renda = getRendaBruta();

        if (getRendaBruta() <= 1400.0){
            return 0.0;
        }else if (getRendaBruta() >= 1400.01 && getRendaBruta() <= 2100.0){
            renda = getRendaBruta() * 0.10;
            return renda;
        }else if (getRendaBruta() >= 2000.01 && getRendaBruta() <= 2800.00){
            renda = getRendaBruta() * 0.15;
            return renda;
        }else if (getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600.0){
            renda = getRendaBruta() * 0.25;
            return renda;
        }else if (getRendaBruta() >= 3600.01 && getRendaBruta() <= Double.MAX_VALUE){
            renda = getRendaBruta() * 0.30;
            return renda;
        }else {
            System.out.println("valor???");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "PF{ " + super.toString() +
                "cpf: " + cpf + '\'' +
                '}';
    }
}