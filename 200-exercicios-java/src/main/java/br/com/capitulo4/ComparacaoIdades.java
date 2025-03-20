package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia as idades de duas pessoas e exiba quem é mais velho. Caso as idades sejam iguais, 
 * exiba uma mensagem informando que as duas pessoas têm a mesma idade.
 * 
 * 
 * */
public class ComparacaoIdades {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a idade da primeira pessoa : ");
		int idade1 = scanner.nextInt();
		
		System.out.println("digite a idade da segunda pessoa : ");
		int idade2 = scanner.nextInt();
		
		if(idade1 > idade2) {
			System.out.println("a primeira pessoa é mais velha");
		} else if(idade1 < idade2) {
			System.out.println("a segunda pessoa é mas velha");
		} else {
			System.out.println("ambas tem a mesma idade");
		}
		
		scanner.close();
	}
}
