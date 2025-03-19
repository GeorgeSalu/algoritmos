package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
 * 
 * */
public class VerificarParidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro : ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
		
		scanner.close();
	}
}
