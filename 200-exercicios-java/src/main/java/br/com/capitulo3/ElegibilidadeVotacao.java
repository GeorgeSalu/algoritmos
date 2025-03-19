package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível para votar (idade igual ou superior a 18 anos).
 * 
 * */
public class ElegibilidadeVotacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite sua idade : ");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("voce é elegivel para votar");
		} else {
			System.out.println("voce nao é elegivel para votar");
		}
		
		scanner.close();
	}
}
