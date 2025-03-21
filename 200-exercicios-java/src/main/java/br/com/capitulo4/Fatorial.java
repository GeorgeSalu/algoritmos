package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * 
 * 
 * */
public class Fatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero para calcular o fatorial : ");
		int num = scanner.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1;i <= num;i++) {
			fatorial *= i;
		}
		
		System.out.println("fatorial de "+num+" é "+fatorial);
		scanner.close();
	}
}
