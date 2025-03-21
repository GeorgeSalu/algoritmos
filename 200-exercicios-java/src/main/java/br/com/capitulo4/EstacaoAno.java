package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número de 1 a 4 e exiba o nome da estação do ano correspondente: 
 * 		1: Verão 
 * 		2: Outono 
 * 		3: Inverno 
 * 		4: Primavera 
 * 
 * */
public class EstacaoAno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero de 1 a 4 para estacao no ano : ");
		int estacao = scanner.nextInt();
		
		switch(estacao) {
			case 1:
				System.out.println("versao");
				break;
			case 2:
				System.out.println("outono");
				break;
			case 3:
				System.out.println("inverno");
				break;
			case 4:
				System.out.println("primavera");
				break;
			default:
				System.out.println("numero invalido");
		}
		
		scanner.close();
	}
}
