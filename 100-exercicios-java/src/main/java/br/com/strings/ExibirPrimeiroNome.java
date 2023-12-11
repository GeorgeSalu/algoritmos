package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que receba um nome 
 * completo e exiba somente o primeiro nome
 *
 */
public class ExibirPrimeiroNome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome completo: ");
		String nomeCompleto = scanner.nextLine();
		
		// dividir o nome completo em partes separadas pelo espaco em branco
		String[] partesNome = nomeCompleto.split(" ");
		
		// obter o primeiro nome
		String primieroNome = partesNome[0];
		
		System.out.println("primeiro nome : "+primieroNome);
		
		scanner.close();
	}
}
