package br.com.capitulo2;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro : ");
		int numeroInt = scanner.nextInt();
		
		System.out.println("Digite um numero decimal : ");
		double numeroDouble = scanner.nextDouble();
		
		double soma = numeroInt + numeroDouble;
		System.out.println("A soma dos numeros é : "+soma);
		
		scanner.close();
	}
}
