public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;

        System.out.println(primeirConta.saldo);

        Conta segundaConta = primeirConta;
        
        segundaConta.saldo += 100;

        System.out.println("Saldo da primeira conta: " +primeirConta.saldo);
        System.out.println("Saldo da segunda conta: " +segundaConta.saldo);
    }
    
}
