package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia três números inteiros e exiba o maior deles.
 * 
 * */
public class MaiorDeTres {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero inteiro : ");
		int num1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero inteiro : ");
		int num2 = scanner.nextInt();
		
		System.out.println("digite o terceiro numero inteiro : ");
		int num3 = scanner.nextInt();
		
		int maior = num1;
		
		if(num2 > maior) {
			maior = num2;
		}
		
		if(num3 > maior) {
			maior = num3;
		}
		
		System.out.println("o maior numero é :"+maior);
		scanner.close();
	}
}
