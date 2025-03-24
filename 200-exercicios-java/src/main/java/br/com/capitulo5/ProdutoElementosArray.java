package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia 6 números inteiros e calcule o produto de todos os valores do array
 * 
 * 
 * */
public class ProdutoElementosArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[6];
		int produto = 1;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
			produto *= numeros[i];
		}
		
		System.out.println("o produto dos elementos do array é : "+produto);
		
		scanner.close();
	}
}
