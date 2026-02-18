package HerancaPolimofismo.exemplo4;

public class Triangulo extends Figura2D{
    private Double altura;
    private Double base;

    @Override
    public Double calcularArea() {
        return ((altura * base)/2);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
