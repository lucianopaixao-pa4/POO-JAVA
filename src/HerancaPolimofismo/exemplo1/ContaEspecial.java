package HerancaPolimofismo.exemplo1;

public class ContaEspecial extends ContaBancaria {

    private Double limite;

    public ContaEspecial(String nome, String numConta, double limite) {
        super(nome, numConta);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    //@Override
    void sacar(Double valor) {
        if ((valor - limite) >= 0){
            limite -= valor;
            System.out.println("Saque efetuado com sucesso, novo saldo: "+ limite);
        }else {
            System.out.println("Limite insuficente");
        }
    }

    @Override
    public String toString() {
        return "Conta Especial{" +
                "Nome do cliente: " + getNomeDoCliente() + '\n' +
                "Numero da conta: " + getNumConta() + '\n' +
                "Limite: " + limite +
                '}';
    }
}
