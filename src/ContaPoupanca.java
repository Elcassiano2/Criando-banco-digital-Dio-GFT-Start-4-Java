
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		System.out.println("");
		System.out.println("");
		System.out.println("=== Fim do Extrato Conta Poupança ===");
		System.out.println("");
		System.out.println("");
		
	}
}
