public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1000);
        Conta cp = new ContaPoupanca(500);
        Conta cs = new ContaSalario(300);
        Conta ci = new ContaInvestimento(2000);

        try {
            cc.sacar(1200); // Deve disparar o Aspect (saldo insuficiente)
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        cp.sacar(200); // OK
        cs.sacar(100); // OK

        try {
            ci.sacar(3000); // Deve disparar o Aspect
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
