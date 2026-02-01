package HerancaPolimofismo.exemplo3;

public class Animal {
    private String nome;
    private Double comprimento;
    private Integer numeroDePatas;
    private String cor;
    private String ambiente;
    private Double velocidade;

    public Animal(){

    }

    public Animal(String ambiente, Double comprimnto, String cor, String nome, Double velocidade) {
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.cor = cor;
        this.nome = nome;
        this.numeroDePatas = 4;
        this.velocidade = velocidade;
    }



    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getComprimnto() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(Integer numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

//    public void imprimirAnimal(){
//        System.out.println("Animal: "+ nome + "\n" + "Comprimento: " + comprimnto + "\n" + "Patas: "+
//                numeroDePatas +"\n" + "Cor: " + cor + "\n" + "Ambiente: "+ ambiente + "\n" + "Vecolocidade");
//        System.out.println("----------------------------------");
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "\nnome: " + ambiente +
                "\nambiente: " + nome +
                "\ncomprimento: " + comprimento +
                "\nnumeroDePatas: " + numeroDePatas +
                "\ncor: " + cor +
                "\nvelocidade: " + velocidade +
                '}';
    }
}
