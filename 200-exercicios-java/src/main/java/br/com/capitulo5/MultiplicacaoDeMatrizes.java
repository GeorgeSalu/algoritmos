package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia duas matrizes 2x2 e calcule o produto entre elas, exibindo o resultado.
 * 
 * 
 * */
public class MultiplicacaoDeMatrizes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int resultado[][] = new int[2][2];
		
		System.out.println("preenchendo a matriz A : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matrizA[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("preenchendo a matriz B : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matrizB[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				resultado[i][j] = 0;
				for(int k = 0;k < 2;k++) {
					resultado[i][j] += matrizA[i][k]*matrizB[k][j];
				}
			}
		}
		
		System.out.println("resultado da multiplicacao das matriz A e B : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println(resultado[i][j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}

