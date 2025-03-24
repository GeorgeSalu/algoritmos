package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia 10 números inteiros e armazene-os em um array. Encontre e exiba o menor e o maior valor presentes no array.
 * 
 * 
 * */
public class MenorMaiorValor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int maior,menor;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		maior = menor = numeros[0];
		
		for(int numero: numeros) {
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("maior valor : "+maior);
		System.out.println("menor valor : "+menor);
		
		scanner.close();
	}
}
