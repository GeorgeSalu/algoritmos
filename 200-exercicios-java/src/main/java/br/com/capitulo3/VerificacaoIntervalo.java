package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número inteiro e verifique se ele está entre 10 e 20 (inclusive). Exiba uma mensagem informando se o número está dentro ou fora do intervalo.
 * 
 * 
 * */
public class VerificacaoIntervalo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro : ");
		int num = scanner.nextInt();
		
		if(num >= 10 && num <= 20) {
			System.out.println("o numero esta dentro do intervalo");
		} else {
			System.out.println("o numero esta fora do intevalo");
		}
		
		scanner.close();
	}
}
