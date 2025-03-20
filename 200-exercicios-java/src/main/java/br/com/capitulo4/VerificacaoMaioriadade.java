package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem informando se ela é menor de idade (menor que 18 anos), 
 * maior de idade (18 anos ou mais) ou idosa (60 anos ou mais).
 * 
 * 
 * */
public class VerificacaoMaioriadade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite sua idade : ");
		int idade = scanner.nextInt();
		
		if(idade >= 60) {
			System.out.println("voce é idoso");
		} else if(idade >= 18) {
			System.out.println("voce é maior de idade");
		} else {
			System.out.println("voce é menor de idade");
		}
		
		scanner.close();
	}
}
