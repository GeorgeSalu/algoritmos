package br.com.capitulo3;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primiero numero inteiro : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero inteiro : ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		int divisao = num1 / num2;
		int modulo = num1 % num2;
		
		System.out.println("soma : "+soma);
		System.out.println("subtracao : "+subtracao);
		System.out.println("multiplicacao : "+multiplicacao);
		System.out.println("divisao : "+divisao);
		System.out.println("modulo : "+modulo);
		scanner.close();
	}
}
