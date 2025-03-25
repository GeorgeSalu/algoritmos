package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que permita ao usuário preencher uma matriz 4x4 com valores inteiros. O programa deve pedir ao usuário 
 * um número para buscar na matriz e informar em qual posição ele foi encontrado (linha e coluna).
 * 
 * 
 * */
public class BuscaMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("digite o numero para buscar : ");
		int numero = scanner.nextInt();
		boolean encontrado = false;
		
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				if(matriz[i][j] == numero) {
					System.out.println("numero encontrado na posicao ["+i+"]["+j+"]");
					encontrado = true;
				}
			}
		}
		
		if(!encontrado) {
			System.out.println("numero nao encontrado");
		}
		
	}
}
