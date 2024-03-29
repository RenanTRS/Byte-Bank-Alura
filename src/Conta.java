public class Conta {
    //Atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //Construtor--------------------------
    public Conta(int agencia, int numero){
        Conta.total++;
        if(agencia <= 0){
            agencia *= -1;
            this.agencia = agencia;
        }else{
            this.agencia = agencia;
        }
        if(numero <= 0){
            numero *= -1;
            this.numero = numero;
        }else{
            this.numero = numero;
        }
        System.out.println("Estou criando uma Conta com o número:" +this.numero);
    }

    //Total static--------------------------------------
    public static int getTotal() {
        return total;
    }

    //Deposita-----------------------------------------
    public void deposita(double valor){ //Método deposita com void (void para não me informar nada depois de executar.)
        this.saldo += valor;
    }

    //Saca-----------------------------------------------
    public boolean saca(double valor){ //Boolean vai me retornar se sacou ou não.
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true; //Retorna o true do boolean.
        }else{
            return false;
        }
    }

    //Transfere----------------------------------------
    public boolean transfere(double valor, Conta destino){ //Método transfere valor para conta
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;   
        }
    }

    //Saldo-------------------------------------------
    public double getSaldo(){ //Método mostra valor.
        return this.saldo;
    }
    
    //Agencia-------------------------------------------------------------------
    public int getAgencia() { //Método que mostra a agência.
        return agencia;
    }

    //Numero--------------------------------------------------------------------
    public int getNumero() { //Método que mostra o numero
        return this.numero;
    }

    //Titular------------------------------------------------------------------
    public Cliente getTitular() { //Método que mostra o titular
        return titular;
    }
    public void setTitular(Cliente titular) { //Método que insere o titular
        this.titular = titular;
    }

}
