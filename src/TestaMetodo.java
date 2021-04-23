public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);   //Mandando um valor para o método
        System.out.println(conta.saldo);
    }
}
