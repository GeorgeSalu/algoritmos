package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que crie um array de 10 números inteiros. O programa deve pedir ao usuário que forneça dois números: 
 * um número para buscar no array e outro para substituir o número encontrado. Se o número for encontrado, ele deve ser substituído.
 * 
 * 
 * */
public class SubtituicaoValoresArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" : ");
			numeros[i] = scanner.nextInt();
			
		}
		
		System.out.println("digite o numero a ser substituido : ");
		int numeroAntigo = scanner.nextInt();
		System.out.println("digite o novo numero : ");
		int numeroNovo = scanner.nextInt();
		
		boolean encontrado = false;
		for(int i = 0;i < numeros.length; i++) {
			if(numeros[i] == numeroAntigo) {
				numeros[i] = numeroNovo;
				encontrado = true;
			}
		}
		
		if(encontrado) {
			System.out.println("o numero foi subtituido. novo array");
			for(int numero: numeros) {
				System.out.println(numero);
			}
		} else {
			System.out.println("numero nao encontrado no array");
		}
		
		scanner.close();
	}
}
