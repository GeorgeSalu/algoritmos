package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia dois numeros inteiros e exiba se o primeiro é maior, menor ou igual ao segundo
 * 
 * */
public class ComparacaoSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primiero numero : ");
		int num1 = scanner.nextInt();
		
		System.out.println("digite o segundo numero : ");
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("o primeiro numero é maior que o segundo");
		} else if(num1 < num2) {
			System.out.println("o primeiro numero é menor que segundo");
		} else {
			System.out.println("os dois numeros sao iguais");
		}
		
		scanner.close();
	}
}
