package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Faça um programa que receba uma frase e exiba a 
 * quantidade de espaços em branco presentes na mesma
 *
 */
public class ContadorEspacosV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase : ");
		String frase = scanner.nextLine();
		
		// divide a frase em partes separadas pelos espacos em branco
		String[] partes = frase.split(" ");
		
		// calcula a quantidade de espacos em branco
		int quantidadeEspacos = partes.length - 1;
		
		System.out.println("quantiade de espacos em branco : "+quantidadeEspacos);
		
		scanner.close();
	}
}
