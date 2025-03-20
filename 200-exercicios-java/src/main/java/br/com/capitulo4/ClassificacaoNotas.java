package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Classificação de Notas Enunciado: Crie um programa que leia uma nota de 0 a 100 e exiba uma mensagem 
 * de aprovação se a nota for maior ou igual a 60. Caso contrário, exiba uma mensagem de reprovação.
 * 
 * */
public class ClassificacaoNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a sua nota (0 a 100) : ");
		int nota = scanner.nextInt();
		
		if(nota >= 60) {
			System.out.println("vc esta aprovado");
		} else {
			System.out.println("voce esta reprovado");
		}
		
		scanner.close();
	}
}
