public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        ContaPoupanca cp = new ContaPoupanca(112, 112);

        cc.deposita(200);
        cp.deposita(100);

        

    }
    
}
