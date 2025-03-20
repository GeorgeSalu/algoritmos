package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Operadores Compostos Enunciado:  Escreva um programa que leia dois números inteiros do usuário e aplique operadores compostos 
 * (e.g., +=, -=, *=, /=, %=) para modificar o valor da primeira variável em relação à segunda. Exiba o resultado após cada operação.
 * 
 * 
 * */
public class OperadoresCompostos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero inteiro : ");
		int valor1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero inteiro : ");
		int valor2 = scanner.nextInt();
		
		valor1 += valor2;
		System.out.println("apos o valor1 += valor2 : "+valor1);
		
		valor1 -= valor2;
		System.out.println("apos o valor1 -= valor2 : "+valor1);
		
		valor1 *= valor2;
		System.out.println("apos o valor1 *= valor2 : "+valor1);
		
		valor1 /= valor2;
		System.out.println("apos o valor1 /= valor2 : "+valor1);
		
		valor1 %= valor2;
		System.out.println("apos o valor1 %= valor2 : "+valor1);
		
		scanner.close();
	}
}
