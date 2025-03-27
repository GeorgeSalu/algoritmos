package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia 10 números inteiros e um número adicional. O programa deve realizar uma busca 
 * linear no array para verificar se o número adicional está presente. Exiba a posição do número, se encontrado.
 * 
 * complexidade:
 * 		a busca linear tem complexidade de tempo 0(n), onde n é o numero de elementos no array, o que significa 
 * que, no pior caso,pode ser necessario percorrer todos os elementos para encontrar o numero
 * 
 * */
public class BuscaLinear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		boolean encontrado = false;
		
		// preenche o array
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" : ");
			numeros[i] = scanner.nextInt();
		}
		
		// lendo o numero adicional
		System.out.println("digite o numero que deseja buscar : ");
		int numeroBuscado = scanner.nextInt();
		
		// realizando a busca linear
		for(int i = 0;i < numeros.length; i++) {
			if(numeros[i] == numeroBuscado) {
				System.out.println("numero encontrado na posicao : "+i);
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("numero encontrado");
		}
		
		scanner.close();
	}
}
