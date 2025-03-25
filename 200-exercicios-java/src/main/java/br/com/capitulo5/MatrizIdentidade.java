package br.com.capitulo5;

/*
 * 
 * Crie um programa que gere e exiba uma matriz identidade 4x4 (valores 1 na diagonal principal e 0 nos outros elementos).
 * 
 * 
 * */
public class MatrizIdentidade {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		
		for(int i = 0;i < 4;i++) {
			for(int j = 0;j < 4;j++) {
				if(i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		System.out.println("matriz identidade 4x4");
		for(int i = 0;i < 4; i++) {
			for(int j = 0;j < 4; j++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
