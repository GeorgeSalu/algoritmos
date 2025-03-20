package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia a idade de três pessoas e verifique se pelo menos duas delas são maiores de idade (18 anos ou mais).
 * 
 * */
public class VerificacaoMaioria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro idade : ");
		int idade1 = scanner.nextInt();
		
		System.out.println("digite o segundo idade : ");
		int idade2 = scanner.nextInt();
		
		System.out.println("digite o terceiro idade : ");
		int idade3 = scanner.nextInt();
		
		int maioridade = 0;
		
		if(idade1 >= 18) maioridade++;
		if(idade2 >= 18) maioridade++;
		if(idade3 >= 18) maioridade++;
		
		if(maioridade >= 2) {
			System.out.println("pelo menos duas pessoas sao maiores de idade");
		} else {
			System.out.println("menos de duas pessoas são maiores de idade");
		}
		
		scanner.close();
	}
}
