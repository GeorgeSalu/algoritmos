package br.com.capitulo4;

/*
 * 
 * Crie um programa que calcule o produto dos números inteiros de 1 a 10.
 * 
 * 
 * */
public class ProdutoDeNumeros {
	public static void main(String[] args) {
		int produto = 1;
		
		for(int i = 1;i <= 10;i++) {
			produto *= i;
		}
		
		System.out.println("o produto dos numeros de 1 a 10 "+produto);
	}
}
