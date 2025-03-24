package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia 10 números inteiros e armazene-os em um array. O programa deve pedir ao 
 * usuário para inserir um número extra e contar quantas vezes esse número aparece no array.
 * 
 * 
 * */
public class ContagemOcorrencias {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int ocorrencias = 0;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero "+(i+1)+" : ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("digite um numero para contar as ocorrencias:");
		int numeroProcurado = scanner.nextInt();
		
		for(int numero : numeros) {
			if(numero == numeroProcurado) {
				ocorrencias++;
			}
		}
		
		System.out.println("O numero "+numeroProcurado+" aparece "+ocorrencias+" vezes no array ");
		
		scanner.close();
	}
}
