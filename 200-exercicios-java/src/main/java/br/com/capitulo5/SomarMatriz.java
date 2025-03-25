package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia uma matriz 3x3 de inteiros e calcule a soma de todos os elementos da matriz.
 * 
 * 
 * */
public class SomarMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int soma = 0;
		
		for(int i = 0;i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
				soma += matriz[i][j];
			}
		}
		
		System.out.println("a soma de todos os elementos da matriz é : "+soma);
		scanner.close();
	}
}
