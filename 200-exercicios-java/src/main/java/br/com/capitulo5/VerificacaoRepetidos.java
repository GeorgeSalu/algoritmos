package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia 10 números inteiros e verifique se algum valor é repetido no array. Se houver repetições, exiba uma mensagem informando.
 * 
 * 
 * */
public class VerificacaoRepetidos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		boolean repetido = false;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		for(int i = 0;i < numeros.length; i++) {
			for(int j = i + 1;j < numeros.length; j++) {
				if(numeros[i] == numeros[j]) {
					repetido = true;
					break;
				}
			}
		}
		
		if(repetido) {
			System.out.println("ha valores repetidos no array");
		} else {
			System.out.println("nao ha valores petidos no array");
		}
		
		scanner.close();
	}
}
