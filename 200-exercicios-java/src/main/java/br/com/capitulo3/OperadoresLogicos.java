package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia três números inteiros e verifique se pelo menos um deles é maior que 10 (usando o operador ||). 
 * Em seguida, verifique se todos são maiores que 10 (usando o operador &&).
 * 
 * 
 * */
public class OperadoresLogicos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero inteiro : ");
		int num1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero inteiro : ");
		int num2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero inteiro : ");
		int num3 = scanner.nextInt();
		
		if(num1 > 10 || num2 > 10 || num3 > 10) {
			System.out.println("pelo menos um do numeros é maior que 10");
		} else {
			System.out.println("nenhum dos numeros é maior que 10");
		}
		
		if(num1 > 10 && num2 > 10 && num3 > 10) {
			System.out.println("todos os numeros sao maiores que 10");
		} else {
			System.out.println("nem todos os numeros sao maiores que 10");
		}
		
		scanner.close();
	}
}
