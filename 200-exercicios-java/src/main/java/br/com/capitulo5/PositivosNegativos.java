package br.com.capitulo5;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia 15 números inteiros e, em seguida, exiba quantos desses números são positivos e quantos são negativos.
 * 
 * 
 * */
public class PositivosNegativos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeros[] = new int[15];
		int positicos = 0, negativos = 0;
		
		for(int i = 0;i < numeros.length; i++) {
			System.out.println("digite o numero : "+(i+1)+" : ");
			numeros[i] = scanner.nextInt();
		}
		
		for(int numero: numeros) {
			if(numero > 0) {
				positicos++;
			} else if(numero < 0) {
				negativos++;
			}
		}
		
		System.out.println("quantidade de numeros positivos : "+positicos);
		System.out.println("quntiadde de numeros negativos : "+negativos);
		
		scanner.close();
	}
}
