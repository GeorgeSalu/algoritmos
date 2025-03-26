package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia uma matriz 3x3 e exiba a sua matriz transposta (inversão das linhas com as colunas).
 * 
 * 
 * */
public class MatrizTransposta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int transposta[][] = new int [3][3];
		
		for(int i = 0;i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println("digite o valora para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
				transposta[j][i] = matriz[i][j];
			}
		}
		
		System.out.println("matriz transposta 3x3 : ");
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3; j++) {
				System.out.print(transposta[i][j]+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
