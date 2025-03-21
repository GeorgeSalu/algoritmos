package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia a idade de uma pessoa e classifique-a em uma das seguintes categorias:
 * 		0 a 12: Criança 
 * 		13 a 17: Adolescente 
 * 		18 a 59: Adulto 
 * 		60 ou mais: Idoso
 * 
 * */
public class ClassificacaoDeIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite a idade : ");
		int idade = scanner.nextInt();

		switch (idade) {
			case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
				System.out.println("criança");
				break;
			case 13, 14, 15, 16, 17:
				System.out.println("adolescente");
				break;
			case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
				45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
				System.out.println("adulto");
				break;
			default:
				System.out.println("idoso");
		}
		
		scanner.close();
	}
}
