public class CriaConta {
    public static void main(String[] args) {
        //Instancias
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        //Referência
        conta.setTitular(cliente);
    }
}
