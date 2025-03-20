package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia um número inteiro de 1 a 7 e exiba o nome do dia da semana correspondente (1 para domingo, 2 para segunda-feira, etc.).
 * 
 * 
 * */
public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero de 1 a 7 para o dia da semana : ");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("segunda-feira");
				break;
			case 3:
				System.out.println("terca-feira");
				break;
			case 4:
				System.out.println("quarta-feira");
				break;
			case 5:
				System.out.println("quinta-feira");
				break;
			case 6:
				System.out.println("sexta-feira");
				break;
			case 7:
				System.out.println("sabado");
				break;
			default:
				System.out.println("numero invalido! digite entre 1 a 7");
		}
		
		scanner.close();
	}
}
