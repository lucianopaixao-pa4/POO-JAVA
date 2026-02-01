package HerancaPolimofismo.exemplo1;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private Integer diaRendimnto;

    public ContaPoupanca(int diaRen, String nome, String numConta, double saldo){
        super(nome, numConta, saldo);
    }

    public Integer getDiaRendimnto() {
        return diaRendimnto;
    }

    public void setDiaRendimnto(Integer diaRendimnto) {
        this.diaRendimnto = diaRendimnto;
    }

    Boolean CalcularNovoSaldo(int taxaDeRendimento){
        Calendar hoje = Calendar.getInstance();

        if (diaRendimnto == hoje.get(Calendar.DAY_OF_MONTH)){
            double taxa = taxaDeRendimento;
            taxa = taxa / 100;
            setSaldo(getSaldo() + (getSaldo() * taxa));

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca{" + "\n" + super.toString() +
                "diaRendimnto=" + diaRendimnto +
                '}';
        return  s;
    }
}
