package HerancaPolimofismo.exemplo2;

public abstract class Contribuinte {
    private String nome;
    private String rendaBruta;

    public Contribuinte(String nome, String rendaBruta){
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(String rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract Double cacularImposto(double valorReceita);

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome: " + nome + '\n' +
                ", rendaBruta='" + rendaBruta + '\n' +
                '}';
    }
}
