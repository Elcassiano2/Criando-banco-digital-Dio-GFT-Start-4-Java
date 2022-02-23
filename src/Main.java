import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double saque;
		double deposito;
		double transferencia;
	    int agencia = 0;
	    int conta = 0;
	    int senha = 0;
	    int opcao;
	    int numConta = 0;
	    Conta contaAtual = null;
	    Conta contaDestino = null;
	    
	    Banco banco1 = new Banco();
	    Banco banco2 = new Banco();
	    Banco banco3 = new Banco();
	    
	    
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Elcias");
		cliente1.setSenha(123);
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Joao");
		cliente2.setSenha(456);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Carlos");
		cliente3.setSenha(789);
		
		Conta cc1 = new ContaCorrente(cliente1); //1
		Conta poupanca1 = new ContaPoupanca(cliente1); //2
		cc1.banco = banco1;
		cc1.banco.setNome("Banco do Brasil");
		poupanca1.banco = banco1;
		poupanca1.banco.setNome("Banco do Brasil");
		 
		Conta cc2 = new ContaCorrente(cliente2);//3
		Conta poupanca2 = new ContaPoupanca(cliente2); //4
		cc2.banco = banco2;
		cc2.banco.setNome("Itaú");
		poupanca2.banco = banco2;
		poupanca2.banco.setNome("Itaú");
		
		
		Conta cc3 = new ContaCorrente(cliente3);//5
		Conta poupanca3 = new ContaPoupanca(cliente3);//6
		cc3.banco = banco3;
		cc3.banco.setNome("Santander");
		poupanca3.banco = banco3;
		poupanca3.banco.setNome("Santander");
		
		
		while(true){
			
		opcao = 0;	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***Bem vindo ao caixa 24 horas***!");
		System.out.println("*");
				
		System.out.println("Digite o número da Agência! **1**");
		agencia = scan.nextInt();
		
		System.out.println("Digite o número da Conta!** CC -> 1-Elcias,3-João,5-Carlos ** Poupança -> 2-Elcias,4-João,6-Carlos **");
		conta = scan.nextInt();
		
		System.out.println("Digite sua senha!**123-Elcias**456-João**789-Carlos**");
		senha = scan.nextInt();
		//scan.close();
		System.out.println("*");
		
		if(agencia == 1 && conta == 1 && senha == 123 ) {
			contaAtual = cc1;
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
		else if(agencia == 1 && conta == 2 && senha == 123 ) {
			contaAtual = poupanca1;
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
			
		else if(agencia == 1 && conta == 3 && senha == 456 ) {
			contaAtual = cc2;	
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
		
		else if(agencia == 1 && conta == 4 && senha == 456 ) {
			contaAtual = poupanca2;	
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
		
			
		else if(agencia == 1 && conta == 5 && senha == 789 ) {
			contaAtual = cc3;	
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
			
		else if(agencia == 1 && conta == 6 && senha == 789 ) {
			contaAtual = poupanca3;	
			System.out.println( contaAtual.cliente.getNome() + ", " + "Bem vindo ao " + contaAtual.banco.getNome()+"! ");
		}
			
		else {System.out.println("Os dados informados estão incorretos!");	
		continue;
		}
		
		
		while(opcao != 5){
		System.out.println("");
		System.out.println("");
		System.out.println("======***=====***====");
		System.out.println("Qual operação deseja realizar");
		System.out.println("1: Depósito");
		System.out.println("2: Saque");
		System.out.println("3: Transferência");
		System.out.println("4: Extrato");
		System.out.println("5: Sair");
		System.out.println("");
		System.out.println("");
		System.out.println("======***=====***====");
		
		//Scanner scan1 = new Scanner(System.in);
		opcao = scan.nextInt();
		
		
		switch (opcao) {
		
		case 1:
			System.out.println("");
			System.out.println("");
		System.out.println("Insira o valor que deseja depositar e pressione enter.");	
		deposito = scan.nextDouble();
		contaAtual.depositar(deposito);
		System.out.println("Operação realizada com sucesso" ); 
		break;
		
		case 2:
			System.out.println("");
			System.out.println("");
			System.out.println("Insira o valor que deseja sacar e pressione enter.");	
			saque = scan.nextDouble();
			contaAtual.sacar(saque);
			System.out.println("Operação realizada com sucesso" ); 
			break;
			
		case 3:
			System.out.println("");
			System.out.println("");
			System.out.println("Insira o valor que deseja transferir e pressione enter.");	
			transferencia = scan.nextDouble();
			System.out.println("Insira o numero da conta de destino e pressione enter.");	
			numConta= scan.nextInt();
			
			if(numConta == 1)contaDestino = cc1;
			else if(numConta == 2)contaDestino = poupanca1;
			else if(numConta == 3)contaDestino = cc2;
			else if(numConta == 4)contaDestino = poupanca2;
			else if(numConta == 5)contaDestino = cc3;
			else if(numConta == 6)contaDestino = poupanca3;
			else System.out.println("Dados incorretos, tente novamente!");
			
			
			contaAtual.transferir(transferencia,contaDestino);
			System.out.println("Operação realizada com sucesso" ); 
			break;
			 
		case 4:
			System.out.println("");
			System.out.println("");
			contaAtual.imprimirExtrato();;
			break;
			
		case 5:
			break;
		
		}
		
		}

		}
		
	}		
	
	}





