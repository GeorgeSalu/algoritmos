package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Faça um programa que receba uma 
 * palavra e exiba cada letra separadamente
 * (necessita de laço de repetição)
 *
 */
public class ExibirLetrasV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra : ");
		String palavra = scanner.nextLine();
		
		// convertemos a palavra para um array de caracteres
		char[] letras = palavra.toCharArray();
		
		// percorremos o array e exibimoscada letra separadamente
		for(char letra: letras) {
			System.out.println(letra);
		}
		
		scanner.close();
	}
}
