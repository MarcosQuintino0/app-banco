package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Cliente;
import Entities.ClientePF;
import Entities.ClientePJ;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Você é um PF ou PJ?");
		String r = sc.next();

		System.out.println("Qual seu nome?");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Qual seu endereço");
		String endereco = sc.nextLine();
		System.out.println("Qual seu email");
		String email = sc.nextLine();
		System.out.println("qual numero da conta?");
		int numero = sc.nextInt();
		System.out.println("Saldo inicial?");
		double saldo = sc.nextDouble();

		if (r.equals("pf")) {

			System.out.println("CPF?");
			int cpf = sc.nextInt();

			Cliente clienteCpf = new ClientePF(nome, endereco, email, numero, saldo, cpf);
			System.out.println("BEM-VINDO" + clienteCpf.getName());
			System.out.println();

			int num = 0;
			do {
				System.out.println(
						"Escolha uma opção \n 1 Sacar \n 2 Depositar \n 3 transferir \n 4 Consultar saldo\n 5 Investir \n 6 Conta polpança \n 7 Para Encerrar \n");
				num = sc.nextInt();
				opcao(clienteCpf, num);
				System.out.println("saldo " + clienteCpf.getBalance());

			} while (num < 6);

		} else {
			System.out.println("PJ?");
			int pj = sc.nextInt();

			Cliente clientePj = new ClientePJ(nome, endereco, email, numero, saldo, pj);
			int num = 0;
			do {
				System.out.println(
						"Escolha uma opção \n 1 Sacar \n 2 Depositar \n 3 transferir \n 4 Consultar saldo\n 5 abrir conta poupança \n");
				num = sc.nextInt();
				opcao(clientePj, num);
				System.out.println("saldo " + clientePj.toString());
			} while (num < 7);
		}

		sc.close();

	}

	private static void opcao(Cliente obj, Integer num) {
		Scanner sc = new Scanner(System.in);
		switch (num) {
		case 1:
			System.out.println("Digite um valor para saque");
			double valor = sc.nextDouble();
			obj.withdraw(valor);
			break;
		case 2:
			System.out.println("Digite um valor para deposito");
			double valor1 = sc.nextDouble();
			obj.deposit(valor1);
			break;
		case 3:
			System.out.println("Digite um valor para tranferencia");
			double valor2 = sc.nextDouble();
			obj.transfer(valor2);
			break;
		case 4:
			System.out.println("Seu saldo é de: " + obj.seeBalance());
			break;
		case 5:
			if(obj instanceof ClientePJ) {
				System.out.println();
				System.out.println("voce nao pode criar uma conta poupança");
			}else {
				System.out.println("Conta poupança criada");
			}
			break;
		case 6:
			System.out.println("Digite um valor para colocar para investimento");
			double valor3 = sc.nextDouble();
			obj.investmentAccount(valor3);
			System.out.println("Seu saldo é de: " + obj.seeBalance());
			
			break;
			
		}
	}

}
