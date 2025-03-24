package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia 10 números inteiros e calcule a média dos valores inseridos, utilizando um array para armazenar os números.
 * 
 * 
 * */
public class MediaDeValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];
		}
		
		double media = soma / (double) numeros.length;
		System.out.println("a media dos valores é : "+media);
		
		scanner.close();
	}
}
