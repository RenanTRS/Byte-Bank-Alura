public class CriaConta {
    public static void main(String[] args) {
        //Instancias
        Conta conta = new Conta(-1135, -243);
        Cliente cliente = new Cliente();

        //Referência
        conta.setTitular(cliente);
        //System.out.println(Conta.getTotal());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
}
