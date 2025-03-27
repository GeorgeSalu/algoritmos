package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Enunciado:  Escreva um programa que leia duas matrizes 3x3 e calcule a soma entre elas, exibindo a matriz resultante.
 * 
 * 
 * */
public class SomaMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matrizA[][] = new int[2][2];
		int matrizB[][] = new int[2][2];
		int soma[][] = new int[2][2];
		
		// preenchendo a matriz A
		System.out.println("preenchendo a matriz A : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matrizA[i][j] = scanner.nextInt();
			}
		}

		// preenchendo a matriz B
		System.out.println("preenchendo a matriz B : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matrizB[i][j] = scanner.nextInt();
			}
		}
		
		// somando as duas matrizes
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				soma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		// exibindo a matriz resultante
		System.out.println("soma das matrizes A e B : ");
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println(soma[i][j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
