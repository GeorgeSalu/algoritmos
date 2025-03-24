package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que crie dois arrays de 5 números inteiros. O programa deve comparar os dois arrays e exibir quais posições possuem valores iguais.
 * 
 * 
 * */
public class ComparacaoArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int array1[] = new int[5];
		int array2[] = new int[5];
		
		System.out.println("preencha o primiero array:");
		for(int i = 0;i < array1.length; i++) {
			System.out.println("elemento "+(i+1)+" :");
			array1[i] = scanner.nextInt();
		}
		
		System.out.println("preencha o segundo array : ");
		for(int i = 0;i < array2.length; i++) {
			System.out.println("elemento "+(i+1)+" :");
			array2[i] = scanner.nextInt();
		}
		
		System.out.println("comparacao de valores nas mesmas posicoes");
		for(int i = 0;i < array1.length;i++) {
			if(array1[i] == array2[i]) {
				System.out.println("POsicao "+i+" : "+array1[i]+" = "+array2[i]);
			}
		}
		
		scanner.close();
	}
}
