package HerancaPolimofismo.exemplo4;

public class Cubo extends Figura3D{
    private Double lado;

    @Override
    public Double calcularArea() {
       double area = lado * lado;
       return area * 6;
    }

    @Override
    public Double calcularVolume() {
        return lado * lado * lado;
    }


    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
