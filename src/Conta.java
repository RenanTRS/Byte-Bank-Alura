public class Conta {
    //Atributos
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){ //Método deposita com void (void para não me informar nada depois de executar.)
        this.saldo += valor;
    }
    public boolean saca(double valor){ //Boolean vai me retornar se sacou ou não.
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true; //Retorna o true do boolean.
        }else{
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){ //Método transfere valor para conta
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;   
        }

    }
    public double getSaldo(){ //Método mostra valor.
        return this.saldo;
    }
}
