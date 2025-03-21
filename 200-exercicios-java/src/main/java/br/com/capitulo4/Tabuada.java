package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que exiba a tabuada de um número fornecido pelo usuário, de 1 a 10.
 * 
 * 
 * */
public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero para a tabuada : ");
		int numero = scanner.nextInt();
		
		for(int i = 1;i <= 10;i++) {
			System.out.println(numero+" x "+i+" = "+(numero*i));
		}
		
		scanner.close();
	}
}
