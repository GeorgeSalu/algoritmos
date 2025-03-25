package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia uma matriz 3x3 e exiba a soma dos elementos de cada linha e de cada coluna.
 * 
 * 
 * */
public class SomaLinhasColunas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int somaLinhas[] = new int[3];
		int somaColunas[] = new int[3];
		
		for(int i = 0;i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
				somaLinhas[i] += matriz[i][j];
				somaColunas[j] += matriz[i][j];
			}
		}
		
		for(int i = 0;i < 3;i++) {
			System.out.println("soma da linha "+i+" : "+somaLinhas[i]);
		}
		
		for(int j = 0;j < 3; j++) {
			System.out.println("soma da coluna "+j+" : "+somaColunas[j]);
		}
		
		scanner.close();
	}
}
