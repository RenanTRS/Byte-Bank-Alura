public class Conta {
    //Atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor){ //Método deposita com void (void para não me informar nada depois de executar.)
        this.saldo += valor; //this opcional, serve apenas para referênciar.
    }
    public boolean saca(double valor){ //Boolean vai me retornar se sacou ou não.
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true; //Retorna o true do boolean.
        }else{
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        

    }
}
