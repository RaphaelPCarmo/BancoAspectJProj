public aspect SaldoAspect {

    // Executa antes de qualquer método sacar(double) em uma subclasse de Conta
    before(Conta conta, double valor): 
        execution(* Conta+.sacar(double)) && this(conta) && args(valor) {

        if (conta.getSaldo() < valor) {
            System.out.println("Erro: saldo insuficiente na conta " + conta.getTipoConta());
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}
