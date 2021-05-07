public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        ContaPoupanca cp = new ContaPoupanca(112, 112);

        cc.deposita(200);
        cp.deposita(100);
        cc.transfere(10.0, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.saca(100);
        System.out.println(cc.getSaldo());

    }
    
}
