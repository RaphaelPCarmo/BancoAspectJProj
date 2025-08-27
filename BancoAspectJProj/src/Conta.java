public abstract class Conta {
    protected double saldo;
    protected String tipoConta;

    public Conta(double saldoInicial, String tipoConta) {
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na conta " + tipoConta);
    }

    public abstract void sacar(double valor);
}
