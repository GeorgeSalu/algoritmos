package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia números inteiros do usuário e exiba a soma acumulada. O programa deve terminar quando o usuário digitar o número zero.
 * 
 * 
 * */
public class SomaNumeroWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int somaAcumulada = 0;
		int valorDigitado;
		
		System.out.println("digite numeros para somar. digite 0 para parar.");
		System.out.println("digite um numero:");
		valorDigitado = scanner.nextInt();
		
		while(valorDigitado != 0) {
			somaAcumulada += valorDigitado;
			System.out.println("digite outro numero");
			valorDigitado = scanner.nextInt();
		}
		
		System.out.println("soma total : "+somaAcumulada);
		
		scanner.close();
	}
}
