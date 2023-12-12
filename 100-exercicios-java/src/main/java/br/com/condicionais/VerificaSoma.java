package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * crie um programa que leia tres numeros e verifique 
 * se a soma deles é positiva, negativa ou igual a zero
 *
 */
public class VerificaSoma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int numero2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero : ");
		int numero3 = scanner.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		if(soma > 0) {
			System.out.println("a soma pe positiva");
		} else if(soma < 0) {
			System.out.println("a soma é negativa");
		} else {
			System.out.println("a soma e igual a zero");
		}
		
		scanner.close();
	}
}
