package br.com.capitulo2;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número inteiro e um número decimal do teclado e, em seguida, exiba a soma desses números no console
 * 
 * */
public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro : ");
		int numeroInt = scanner.nextInt();
		
		System.out.println("Digite um numero decimal : ");
		double numeroDouble = scanner.nextDouble();
		
		double soma = numeroInt + numeroDouble;
		System.out.println("A soma dos numeros é : "+soma);
		
		scanner.close();
	}
}
