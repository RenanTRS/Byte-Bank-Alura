public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    
    @Override //Anotação informando que o método será reescrito.
    public boolean saca(double valor) {
        double valorASacar = valor + 0.20;
        return super.saca(valorASacar);
    }
}
