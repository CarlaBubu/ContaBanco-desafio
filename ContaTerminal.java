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
			System.out.println("Entrada inv�lida. Digite um n�mero v�lido para o saldo.");
			teclado.next(); 
		}
		saldo = teclado.nextDouble();
		
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = teclado.next();
		
		System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + 
		agencia + ", conta" + numero + " e seu saldo " + saldo + " j� est� disponivel para saque.");
		
		teclado.close();
		
	}

}
