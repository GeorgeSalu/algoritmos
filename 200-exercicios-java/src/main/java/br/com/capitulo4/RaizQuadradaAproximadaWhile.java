package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia um número inteiro positivo e encontre a raiz quadrada aproximada desse número. Continue a tentativa até encontrar a aproximação correta.
 * 
 * 
 * */
public class RaizQuadradaAproximadaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro positivo : ");
		int numero = scanner.nextInt();
		
		int raizAprox = 0;
		while(raizAprox * raizAprox < numero) {
			raizAprox++;
		}
		
		if(raizAprox * raizAprox == numero) {
			System.out.println("raiz quadrada exata de "+numero+" é "+raizAprox);
		} else {
			System.out.println("raiz quadrada aproximada de "+numero+" é "+raizAprox);
		}
		
		scanner.close();
	}
}
