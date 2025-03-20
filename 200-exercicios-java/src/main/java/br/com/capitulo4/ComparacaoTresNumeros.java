package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia três números inteiros e exiba o maior deles. Caso dois ou mais números sejam iguais, 
 * exiba uma mensagem indicando que há números iguais.
 * 
 * */
public class ComparacaoTresNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		int num1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int num2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero : ");
		int num3 = scanner.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("todos os numeros sao iguais");
		} else if(num1 >= num2 && num1 >= num3) {
			System.out.println("o maior numero é : "+num1);
		} else if(num2 >= num1 && num2 >= num3) {
			System.out.println("o maior numero é : "+num2);
		} else {
			System.out.println("o maior numero é : "+num3);
		}
		
		scanner.close();
	}
}
