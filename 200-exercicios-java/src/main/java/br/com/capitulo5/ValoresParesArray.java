package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia 8 números inteiros e exiba todos os valores pares armazenados no array.
 * 
 * 
 * */
public class ValoresParesArray {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[8];
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("numeros pares no array");
		for(int numero : numeros) {
			if(numero % 2 == 0) {
				System.out.println(numero);
			}
		}
		
		scanner.close();
	}
}
