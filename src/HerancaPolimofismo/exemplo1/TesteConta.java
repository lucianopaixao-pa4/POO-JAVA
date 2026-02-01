package HerancaPolimofismo.exemplo1;

public class TesteConta {

    public static void main(String[] args) {
        int diaRen = 31;
        String nome1 = "Carlos";
        String numConta1 = "001";
        double saldo = 150.0;

        String nome2 = "Henrique";
        String numConta2 = "002";
        double limite = 100.0;


        System.out.println("TESTE CONTA POUPANÇA");
        ContaPoupanca contaPou = new ContaPoupanca(diaRen, nome1, numConta1, saldo);
        contaPou.setDiaRendimnto(2);
        System.out.println(contaPou.getSaldo());
        contaPou.depositar(170.0);
        System.out.println(contaPou.getSaldo());
        contaPou.sacar(35.0);
        System.out.println(contaPou.getSaldo());
        contaPou.sacar(400.0);

        verificarRendimento(contaPou, 10);

        System.out.println(" ");

        System.out.println("TESTE CONTA ESPECIAL");
        ContaEspecial contaEsp = new ContaEspecial(nome2, numConta2, limite);

        System.out.println(contaEsp.getLimite());
        contaEsp.sacar(35.0);
        System.out.println(contaEsp.getLimite());
        contaEsp.sacar(400.0);

        System.out.println(" ");
        System.out.println(contaPou);
        System.out.println(" ");
        System.out.println(contaEsp);
    }

    private static void verificarRendimento(ContaPoupanca conta, int taxaDeRendimento){
        if (conta.CalcularNovoSaldo(taxaDeRendimento)){
            System.out.println("Rendimento aplicado, novo saldo é de: " + conta.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento, novo saldo não caculado");
        }
    }
}
