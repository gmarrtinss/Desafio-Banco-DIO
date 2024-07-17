public class Main {
    public static void main(String[] args) {

        Cliente Guilherme = new Cliente();
                Guilherme.setNome("Guilherme ");

        Conta corrente = new ContaCorrente(Guilherme);

        corrente.depositar(100);
        Conta poupanca = new ContaPoupanca(Guilherme);

        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}