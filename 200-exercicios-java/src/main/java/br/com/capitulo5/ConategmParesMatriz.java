package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia uma matriz 5x5 e conte quantos números pares existem na matriz. Exiba o total de números pares encontrados.
 * 
 * 
 * */
public class ConategmParesMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[2][2];
		int contagemPares = 0;
		
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2; j++) {
				System.out.println("digite o valor para a posicao ["+i+"]["+j+"]");
				matriz[i][j] = scanner.nextInt();
				if(matriz[i][j] % 2 == 0) {
					contagemPares++;
				}
			}
		}
		
		System.out.println("total de numero pares da matriz : "+contagemPares);
		scanner.close();
	}
}
