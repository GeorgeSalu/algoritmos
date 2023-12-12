package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia tres numeros, e 
 * informe se a soma deles e divisivel por 5 ou não
 *
 */
public class VerificaDivisibilidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int numero2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero : ");
		int numero3 = scanner.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		if(soma % 5 == 0) {
			System.out.println("a soma é divisivel por 5.");
		} else {
			System.out.println("a soma não é divisivel por 5");
		}
		
		scanner.close();
	}
}
