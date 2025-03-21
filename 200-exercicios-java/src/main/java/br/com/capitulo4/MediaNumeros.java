package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia 5 números inteiros do usuário e calcule a média deles.
 * 
 * 
 * */
public class MediaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 1;i <= 5;i++) {
			System.out.println("digite o numero : "+i+" : ");
			int numero = scanner.nextInt();
			soma += numero;
		}
		
		double media = soma / 5;
		System.out.println("a media é : "+media);
		
		scanner.close();
	}
}
