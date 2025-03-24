package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Enunciado: Crie um programa que leia 6 números inteiros e armazene-os em um array. Depois, exiba os valores do array na ordem inversa.
 * 
 * 
 * */
public class InversaoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[6];
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("numeros em ordem inversa:");
		for(int i = numeros.length-1; i >= 0; i--) {
			System.err.println(numeros[i]);
		}
		
		scanner.close();
	}
}
