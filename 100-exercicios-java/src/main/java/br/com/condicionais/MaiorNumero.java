package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * escreva um programa que solicite tres 
 * numeros ao usuario e exiba o maior deles
 *
 */
public class MaiorNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		int numero1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int numero2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero : ");
		int numero3 = scanner.nextInt();
		
		int maior = numero1;
		
		if(numero2 > maior) {
			maior = numero2;
		}
		
		if(numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("o maior numero é : "+maior);
		
		scanner.close();
	}
}
