package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia um número inteiro e exiba se o número é par ou ímpar.
 * 
 * */
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro : ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("o numero é par");
		} else {
			System.out.println("o numero é impar");
		}
		
		scanner.close();
	}
}
