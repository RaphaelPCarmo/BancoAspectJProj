public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial, "Poupança");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na conta Poupança");
    }
}
