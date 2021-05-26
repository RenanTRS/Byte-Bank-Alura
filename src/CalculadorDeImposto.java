public class CalculadorDeImposto {
    private double TotalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.TotalImposto += valor;
    }
    public double getTotalImposto(){
        return TotalImposto;
    }
    
}
