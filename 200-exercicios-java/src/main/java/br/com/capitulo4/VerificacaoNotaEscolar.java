package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia uma nota escolar (de 0 a 10) e classifique-a 
 * como "Insuficiente" (menor que 5), "Suficiente" (entre 5 e 7) ou "Bom" (maior que 7).
 * 
 * 
 * */
public class VerificacaoNotaEscolar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite sua noa escolar (0 a 10) : ");
		double notaEscolar = scanner.nextDouble();
		
		if(notaEscolar < 5) {
			System.out.println("classificacao : insuficiente");
		} else if (notaEscolar <= 7) {
			System.out.println("classificacao : suficiente");
		} else {
			System.out.println("classificacao : bom");
		}
		
		scanner.close();
	}
}
