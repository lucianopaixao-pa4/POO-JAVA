package HerancaPolimofismo.exemplo4;

public class Quadrado extends Figura2D{
    private Double lado;
    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
