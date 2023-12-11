package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Faça um programa que receba uma frase e exiba a 
 * quantidade de espaços em branco presentes na mesma
 *
 */
public class ContarEspacos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase : ");
		String frase = scanner.nextLine();
		
		int contadorEspacos = 0;
		
		// percorre cada caractere da frase
		for(int i = 0;i < frase.length(); i++) {
			// verifica se o caracter atual é um espaco em branco
			if(frase.charAt(i) == ' ') {
				contadorEspacos++;
			}
		}
		
		System.out.println("a quantidade de espaços em branco : "+contadorEspacos);
		
		scanner.close();
	}
}
