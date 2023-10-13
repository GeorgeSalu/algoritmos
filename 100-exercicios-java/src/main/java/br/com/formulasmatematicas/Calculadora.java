package br.com.formulasmatematicas;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double numero2 = scanner.nextDouble();
		
		double soma = numero1 + numero2;
		double substracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		
		System.out.println("Soma : "+soma);
		System.out.println("Subtracao : "+substracao);
		System.out.println("Multiplicacao : "+multiplicacao);
		System.out.println("Divisao : "+divisao);
		
		scanner.close();
	}
}
