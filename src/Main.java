
public class Main {

	public static void main(String[] args) {
		Cliente natally = new Cliente();
		natally.setNome("natally");		
		
		
		Conta cc = new ContaCorrente(natally);  	
		Conta poupança = new ContaPoupança(natally);
		
		cc.depositar(100);
		cc.transferir(100, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
	}

}
