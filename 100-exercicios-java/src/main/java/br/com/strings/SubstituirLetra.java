package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Crie um programa que receba uma frase 
 * e subtitua todas as letras "a" por "e"
 *
 */
public class SubstituirLetra {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase : ");
		String frase = scanner.nextLine();
		
		String novaFrase = frase.replace('a', 'e');
		
		System.out.println("Frase modificada : "+novaFrase);
		
		scanner.close();
	}
}
