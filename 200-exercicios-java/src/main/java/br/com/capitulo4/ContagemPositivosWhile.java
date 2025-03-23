package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia números inteiros do usuário e exiba a soma acumulada. O programa deve terminar quando o usuário digitar o número zero.
 * 
 * 
 * */
public class ContagemPositivosWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contagemPositivos = 0;
		int numero;
		
		System.out.println("digite um numero (negativo para parar) : ");
		numero = scanner.nextInt();
		
		while(numero >= 0) {
			if(numero > 0) {
				contagemPositivos++;
			}
			System.out.println("digite outro numero (negativo para parar) : ");
			numero = scanner.nextInt();
		}
		
		System.out.println("quantiadde de numeros positivos : "+contagemPositivos);
		scanner.close();
	}
}
