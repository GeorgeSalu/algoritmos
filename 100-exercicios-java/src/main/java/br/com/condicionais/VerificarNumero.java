package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia um numero e
 * informe se ele é positivo, negativo ou zero
 *
 */
public class VerificarNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero : ");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.println("o numero é positivo");
		} else if(numero < 0) {
			System.out.println("o numero é negativo");
		} else {
			System.out.println("o umero é zero");
		}
		
		scanner.close();
	}
}
