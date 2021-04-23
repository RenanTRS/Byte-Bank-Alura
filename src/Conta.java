public class Conta {
    //Atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){ //Método
        this.saldo += valor; //this opcional, serve apenas para referênciar.
    }
}
