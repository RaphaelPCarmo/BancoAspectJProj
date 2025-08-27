public class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldoInicial) {
        super(saldoInicial, "Investimento");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na conta Investimento");
    }
}
