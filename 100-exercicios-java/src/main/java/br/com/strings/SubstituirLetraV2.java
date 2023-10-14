package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Crie um programa que receba uma frase 
 * e subtitua todas as letras "a" por "e"
 *
 */
public class SubstituirLetraV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase : ");
		String frase = scanner.nextLine();
		
		String novaFrase = "";
		
		for(int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			if(letra == 'a') {
				novaFrase += 'e';
			} else {
				novaFrase += letra;
			}
		}
		
		System.out.println("Frase modificada : "+novaFrase);
		
		scanner.close();
	}
}
