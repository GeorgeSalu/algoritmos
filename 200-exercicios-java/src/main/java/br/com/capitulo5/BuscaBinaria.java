package br.com.capitulo5;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia 10 números inteiros, os ordene em ordem crescente e, em seguida, utilize o método de busca 
 * binária para encontrar um número fornecido pelo usuário. Exiba a posição do número se ele for encontrado.
 * 
 * complexidade:
 * 		a busca binaria tem complexidade de tempo 0(log n),o que a torna muito eficiente para grandes conjuntos de dados, no 
 * programa, o array é ordenado com Arrays.sort(), e a busca binaria é realizada com Arrays.binarySearch()
 * 
 * 
 * */
public class BuscaBinaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" :");
			numeros[i] = scanner.nextInt();
		}
		
		Arrays.sort(numeros);
		
		System.out.println("digite o numero que deseja buscar : ");
		int numeroBuscado = scanner.nextInt();
		
		// realiza a buca binaria
		int posicao = Arrays.binarySearch(numeros, numeroBuscado);
		
		if(posicao >= 0) {
			System.out.println("numero encontrado na posicao "+posicao);
		} else {
			System.out.println("numero nao encontrado");
		}
		
		scanner.close();
	}
}
