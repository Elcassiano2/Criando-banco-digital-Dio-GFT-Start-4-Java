
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
		System.out.println("");
		System.out.println("");
		System.out.println("=== Fim do Extrato Conta Poupan�a ===");
		System.out.println("");
		System.out.println("");
		
	}
}
