package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia um numero
 * e informe se ele é par ou impar
 *
 */
public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero : ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("o numero é par");
		} else {
			System.out.println("o numero é impar");
		}
		
		scanner.close();
	}
}
