package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia cinco números inteiros do usuário, um por vez, e acumule a soma deles usando o operador de atribuição +=.
 * Exiba o total acumulado ao final.
 * 
 * 
 * */
public class SomaAcumulada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somaAcumulada = 0;
		
		for(int i = 1;i <= 5;i++) {
			System.out.println("digite o "+i+" numero inteiro ");
			int valorDigitado = scanner.nextInt();
			somaAcumulada += valorDigitado;
		}
		
		System.out.println("soma acumulada : "+somaAcumulada);
		
		scanner.close();
	}
}
