package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia três números inteiros do usuário e calcule a média aritmética deles. Exiba o resultado no console.
 * 
 * */
public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro : ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero inteiro : ");
		int num2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro numero inteiro : ");
		int num3 = scanner.nextInt();
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.println("media aritmetica : "+media);
		scanner.close();
	}
}
