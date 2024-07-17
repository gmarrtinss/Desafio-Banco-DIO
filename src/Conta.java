public abstract class Conta implements IConta {

    protected static int AGENCIA = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }




    public void sacar() {

    }

    public void depositar(){

    }

    public void transferir(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void ImprimirInformacoes() {

        System.out.printf(String.format("TITULAR: %s", this.cliente.getNome()));

        System.out.printf("AGENCIA: %d ", this.agencia);

        System.out.printf("CONTA: %d ", this.numeroConta);

        System.out.printf("SALDO: %.2f ", this.saldo);
    }

}
