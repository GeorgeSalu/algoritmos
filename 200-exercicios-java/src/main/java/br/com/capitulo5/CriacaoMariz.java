package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Arrays multidimensionais podem ser criados utilizando a sintaxe: int[][] x = [2][2], sendo assim este array terá 2 linhas e duas colunas.
 * 
 * 
 * */
public class CriacaoMariz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		
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
