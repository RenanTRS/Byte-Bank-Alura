public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeirConta = new Conta(1122, 4455);
        primeirConta.deposita(300);

        System.out.println(primeirConta.getSaldo());

        Conta segundaConta = primeirConta;
        
        segundaConta.deposita(100);

        System.out.println("Saldo da primeira conta: " +primeirConta.getSaldo());
        System.out.println("Saldo da segunda conta: " +segundaConta.getSaldo());
    }
    
}
