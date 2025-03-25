package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que declare uma matriz 3x3 e permita que o usuário insira valores inteiros para preencher essa matriz. 
 * em seguida, exiba os valores da matriz no console.
 * 
 * 
 * */
public class CriacaoMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
		// preenche a matriz
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println("digite o valor para posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("matriz 3x3");
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println(matriz[i][j]+" ");
			}
			System.err.println();
		}
		
		scanner.close();
	}
}
