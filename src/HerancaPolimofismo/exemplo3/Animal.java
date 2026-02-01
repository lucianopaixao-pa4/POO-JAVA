package HerancaPolimofismo.exemplo3;

public class Animal {
    private String nome;
    private Double comprimnto;
    private Integer numeroDePatas = 4;
    private String cor;
    private String ambiente;
    private Double velocidade;

    public Animal(){

    }

    public Animal(String ambiente, Double comprimnto, String cor, String nome, Double velocidade) {
        this.ambiente = ambiente;
        this.comprimnto = comprimnto;
        this.cor = cor;
        this.nome = nome;
        this.velocidade = velocidade;
    }



    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getComprimnto() {
        return comprimnto;
    }

    public void setComprimnto(Double comprimnto) {
        this.comprimnto = comprimnto;
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
                "nome: " + ambiente + '\n' +
                "ambiente: " + nome + '\n' +
                "comprimnto: " + comprimnto + "\n" +
                "numeroDePatas: " + numeroDePatas + "\n" +
                "cor: " + cor + '\n' +
                "velocidade: " + velocidade +
                '}';
    }
}
