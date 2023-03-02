
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		System.out.println("Conta Corrente: "+ cc.getSaldo());
		
		
		ContaPoupanca cp =  new ContaPoupanca(222, 222);
		cp.deposita(200);
		System.out.println("Conta Poupança: "+ cp.getSaldo());
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}

}
