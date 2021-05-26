public abstract class Conta {
    //Atributos
    private double saldo;
    private int agencia;
    private int numero;

    //Construtor--------------------------
    public Conta(int agencia, int numero){
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
    }

    //Deposita-----------------------------------------
    public void deposita(double valor){ //Método deposita com void (void para não me informar nada depois de executar.)
        this.saldo += valor;
    }

    //Saca-----------------------------------------------
    public void saca(double valor){
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: R$" + this.saldo + " Valor: R$" + valor + " Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    //Transfere----------------------------------------
    public void transfere(double valor, Conta destino){ //Método transfere valor para conta
        this.saca(valor);
        destino.deposita(valor);
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

}
