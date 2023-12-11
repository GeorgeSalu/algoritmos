package br.com.condicionais;

import java.util.Scanner;

/**
 * 
 * Faça um programa que solicite a idade de uma
 * pessoa e exiba se ela é maior de idade ou não
 * 
 */
public class VerificaMaiorIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a sua idade : ");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("voce é maior de idade");
		} else {
			System.out.println("voce é menor de idade");
		}
		
		scanner.close();
	}
}
