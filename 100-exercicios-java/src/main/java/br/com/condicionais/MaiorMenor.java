package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia dois 
 * numeros e informe qual é o maior.
 *
 */
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("o primeiro numero é maior");
		} else if(numero2 > numero1) {
			System.out.println("o segundo numero pe maior");
		} else {
			System.out.println("os numeros são iguais");
		}
		
		scanner.close();
	}
}
