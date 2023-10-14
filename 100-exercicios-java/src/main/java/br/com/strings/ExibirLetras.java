package br.com.strings;

import java.util.Scanner;

/**
 * 
 * Faça um programa que receba uma 
 * palavra e exiba cada letra separadamente
 * (necessita de laço de repetição)
 *
 */
public class ExibirLetras {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um palavra : ");
		String palavra = scanner.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			System.out.println(letra);
		}
		
		scanner.close();
	}
}
