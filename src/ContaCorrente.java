
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println("");
		System.out.println("");
		System.out.println("=== Fim do Extrato Conta Corrente ===");
		System.out.println("");
		System.out.println("");
	}
	
}
