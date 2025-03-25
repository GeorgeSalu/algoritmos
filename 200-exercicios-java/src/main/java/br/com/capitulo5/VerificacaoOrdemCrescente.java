package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia 8 números inteiros e verifique se os valores estão em ordem crescente. 
 * Exiba uma mensagem indicando se os números estão ou não em ordem.
 * 
 * 
 * */
public class VerificacaoOrdemCrescente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[8];
		boolean emOrdem = true;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < numeros.length - 1; i++) {
			if(numeros[i] > numeros[i+1]) {
				emOrdem = false;
				break;
			}
		}
		
		if(emOrdem) {
			System.out.println("os numeros estao em ordem crescente");
		} else {
			System.out.println("os numeros nao estao em ordem crescente");
		}
		
		scanner.close();
	}
}
