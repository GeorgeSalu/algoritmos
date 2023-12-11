package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que receba um nome e 
 * verifique se o mesmo começa com a letra 'A'
 *
 */
public class VerificarNome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nome : ");
		String nome = scanner.nextLine();
		
		// convertendo o nome para letras minusculas para facilitar a comparacao
		String nomeMinusculo = nome.toLowerCase();
		
		if(nomeMinusculo.startsWith("a")) {
			System.out.println("O nome começa com a letra A");
		} else {
			System.out.println("O nome não começa com a letra A");
		}
		
		scanner.close();
	}
}
