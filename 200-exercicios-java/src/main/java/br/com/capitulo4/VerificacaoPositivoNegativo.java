package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou zero. Exiba uma mensagem apropriada para cada caso.
 * 
 * */
public class VerificacaoPositivoNegativo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro : ");
		int numero = scanner.nextInt();
		
		if(numero > 0) {
			System.out.println("o numero é positivo");
		} else {
			System.out.println("o numero é negativo");
		}
		
		scanner.close();
	}
}
