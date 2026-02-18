package HerancaPolimofismo.exemplo4;

public class Circulo extends Figura2D{
    private Double raio;


    @Override
    public Double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
