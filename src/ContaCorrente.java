public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    
    @Override //Anotação informando que o método será reescrito.
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        return super.saca(valor);
    }
}
