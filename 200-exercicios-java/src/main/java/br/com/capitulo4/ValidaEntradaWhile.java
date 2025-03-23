package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia um número inteiro entre 1 e 10. Caso o valor seja inválido, continue pedindo a entrada até que um número válido seja fornecido.
 * 
 * 
 * */
public class ValidaEntradaWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite uma numero enre 1 e 10 : ");
		int numero = scanner.nextInt();
		
		while(numero < 1 || numero > 10) {
			System.out.println("numero invalido. tente novamente");
			System.out.println("digite um numero entre 1 e 10:");
			numero = scanner.nextInt();
		}
		
		System.out.println("numero valido : "+numero);
		
		scanner.close();
	}
}
