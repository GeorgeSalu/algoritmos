package br.com.strings;

import java.util.Scanner;

/**
 * 
 * escreva um programa que receba um nome completo
 * e exiba o sobrenome(ultimo nome) primeiro
 *
 */
public class SobrenomePrimeiro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nome completo : ");
		String nomeCompleto = scanner.nextLine();
		
		String[] partes = nomeCompleto.split(" ");
		String sobrenome = partes[partes.length - 1];
		
		System.out.println("nome com sobrenome primeiro");
		System.out.println(sobrenome);
		
		for(int i = 0; i < partes.length - 1;i++) {
			System.out.println(" "+partes[i]);
		}
		System.out.println("");
		
		scanner.close();
	}
}
