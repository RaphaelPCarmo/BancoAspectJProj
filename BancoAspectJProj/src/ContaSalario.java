public class ContaSalario extends Conta {
    public ContaSalario(double saldoInicial) {
        super(saldoInicial, "Salário");
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado na conta Salário");
    }
}
