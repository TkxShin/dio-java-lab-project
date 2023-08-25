import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		
		System.out.println("Bem-vindo ao seu banco digital! Favor, digite seu nome.");
		nomeCliente =  sc.nextLine();
		
		System.out.println();
		
		System.out.println("Favor, digite o número da sua Agência.");
		agencia =  sc.nextLine();
		
		System.out.println();
		
		System.out.println("Agora, insira o número da sua conta.");
		numero =  sc.nextInt();
		
		System.out.println();
		
		System.out.println("Quanto deseja depositar?");
		saldo = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numero + ". Seu saldo de " + saldo + " já está disponível para saque!");
		
		
		sc.close();
	
	}

}
