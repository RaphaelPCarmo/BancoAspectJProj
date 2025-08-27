public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial, "Corrente");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na conta Corrente");
    }
}
