package CONTA_BANCO;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor, insira o numero da conta: ");
		numero = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Por favor, insira a agencia: ");
		agencia = teclado.next();
		
		
		System.out.println("Por favor, digite seu saldo: ");
		while (!teclado.hasNextFloat()) { 
			System.out.println("Entrada inválida. Digite um número válido para o saldo.");
			teclado.next(); 
		}
		saldo = teclado.nextDouble();
		
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = teclado.next();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
		agencia + ", conta" + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
		
		teclado.close();
		
	}

}
