package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Enunciado: Crie um programa que leia 10 números inteiros e exiba apenas os valores que estão em posições ímpares no array.
 * 
 * 
 * */
public class ElementosPosicoesImpares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("valores nas posicoes impares");
		for(int i = 1;i < numeros.length; i+= 2) {
			System.out.println(numeros[i]);
		}
		
		scanner.close();
	}
}
