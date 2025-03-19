package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da potenciação do primeiro 
 * número elevado ao segundo número (use o método Math.pow).
 * 
 * */
public class Potenciacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o numero base : ");
		int base = scanner.nextInt();
		
		System.out.println("digite o expoente : ");
		int expoente = scanner.nextInt();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.println("O resultado de "+base+" elevado a "+expoente+" é "+resultado);
		scanner.close();
	}
}
