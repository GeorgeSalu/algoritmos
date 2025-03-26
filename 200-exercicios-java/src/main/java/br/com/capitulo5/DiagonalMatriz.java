package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia uma matriz 4x4 e exiba os elementos da diagonal principal e da diagonal secundária.
 * 
 * 
 * */
public class DiagonalMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		
		for(int i = 0;i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("diagonal principal : ");
		for(int i = 0; i < 4; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		
		scanner.close();
	}
}
