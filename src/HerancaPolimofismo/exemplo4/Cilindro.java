package HerancaPolimofismo.exemplo4;

public class Cilindro extends Figura3D {
    private Double Raio;
    private Double Altura;

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public Double getRaio() {
        return Raio;
    }

    public void setRaio(Double raio) {
        Raio = raio;
    }

    @Override
    public Double calcularArea() {
        Double areaBase = Math.PI * (this.Raio * this.Raio);
        Double arealateral = 2 * Math.PI * Raio * Altura;
        Double areatotal = (2 * areaBase) + arealateral;

        return areatotal;

    }

    @Override
    public Double calcularVolume() {
        return Math.PI * (Raio * Raio) * Altura;
    }
}
