package br.com.strings;

import java.util.Scanner;

/**
 * 
 * crie um programa que leia uma palavra e exiba 
 * a quantidade de vogais presentes na mesma
 *
 */
public class ContaVogais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra : ");
		String palavra = scanner.nextLine();
		
		int contadorVogais = 0;
		
		// percorre cada caractere da palavra
		for(int i = 0;i < palavra.length(); i++) {
			char letra = Character.toLowerCase(palavra.charAt(i));
			
			// verifica se a letra é uma vogal
			if(letra == 'a' | letra == 'e' | letra == 'i' | letra == 'o' | letra == 'u' ) {
				contadorVogais++;
			}
		}
		
		System.out.println("quantidade de vogais "+contadorVogais);
		scanner.close();
	}
}
