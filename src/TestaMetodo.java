public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaPaulo = new Conta();
        contaPaulo.deposita(100);
        contaPaulo.deposita(50);   //Mandando um valor para o método
        //System.out.println(contaPaulo.saldo);
        
        contaPaulo.saca(20);
        //System.out.println(contaPaulo.saldo);
        contaPaulo.saca(200);
        //System.out.println(contaPaulo.saldo);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);
        System.out.println(contaMarcela.getSaldo());
        contaMarcela.transfere(300, contaPaulo);
        System.out.println(contaMarcela.getSaldo());
        System.out.println(contaPaulo.getSaldo());

        contaPaulo.titular.nome = "Paulo";
        System.out.println(contaPaulo.titular.nome);

    }
}
