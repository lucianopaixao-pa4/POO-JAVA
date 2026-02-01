package HerancaPolimofismo.exemplo1;

public class ContaBancaria {

    private String nomeDoCliente;
    private String numConta;
    private Double saldo;

    protected  ContaBancaria(){}

    protected ContaBancaria(String nome, String numConta, double saldo){
        this.nomeDoCliente = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    protected ContaBancaria(String nome, String numConta){
        this.nomeDoCliente = nome;
        this.numConta = numConta;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    void sacar(Double valor){
        if ((saldo - valor) >= 0){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso, novo saldo: "+ saldo);
        }else{
            System.out.println("Saldo insuficiente para saque de valor " + saldo);
        }
    }

    void depositar(Double valor){
        saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "Nome do cliente: " + nomeDoCliente + '\n' +
                "Numero da conta: " + numConta + '\n' +
                "Saldo: " + saldo +
                '}' + "\n";
    }
}