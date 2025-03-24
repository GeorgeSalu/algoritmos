package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia 5 números inteiros do usuário, armazene-os em um array e calcule a soma de todos os elementos.
 * 
 * 
 */
public class SomaElementosArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[5];
		int soma = 0;
		
		for(int i = 0;i < numeros.length;i++) {
			System.err.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];
		}
		
		System.err.println("A soma dos elementos do array é : "+soma);
		scanner.close();
	}
}
