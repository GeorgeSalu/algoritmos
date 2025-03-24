package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que crie um array de 5 números inteiros e multiplique todos os seus valores por 2, exibindo o novo array no console.
 * 
 * 
 * */
public class DupliacacaoDeValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[5];
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("valores multiplicados");
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] *= 2;
			System.out.println(numeros[i]);
		}
		
		scanner.close();
	}
}
