package HerancaPolimofismo.exemplo2;

public abstract class Contribuinte {
    private String nome;
    private Double renda;

    public Contribuinte(String nome, Double rendaBruta){
        this.nome = nome;
        this.renda = rendaBruta;
    }

    public Contribuinte(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return renda;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.renda = rendaBruta;
    }

    public abstract Double cacularImposto();

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome: " + nome + '\n' +
                "rendaBruta: " + renda + '\n' +
                '}';
    }
}
