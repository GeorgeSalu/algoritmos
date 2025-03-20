package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia três números inteiros e verifique se pelo menos dois deles são positivos.
 * 
 * */
public class VerificacaoPositivos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero inteiro : ");
		int num1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero inteiro : ");
		int num2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero inteiro : ");
		int num3 = scanner.nextInt();
		
		int positivos = 0;
		
		if(num1 > 0) positivos++;
		if(num2 > 0) positivos++;
		if(num3 > 0) positivos++;
		
		if(positivos >= 2) {
			System.out.println("pelo menos dois dos numeros sao positivos");
		} else {
			System.out.println("menos de dois dos numeros sao positivos");
		}
		
		scanner.close();
	}
}
