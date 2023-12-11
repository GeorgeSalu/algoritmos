package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia as notas de duas provas
 * e informe se o aluno foi aprovado (nota maior ou igual 6)
 * ou reprovado (nota menor que 6) em casa umas das provas
 *
 */
public class VerificaAprovacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a nota da primeira prova : ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("digite a nota da segunda prova : ");
		double nota2 = scanner.nextDouble();
		
		if(nota1 >= 6) {
			System.out.println("aluno aprovado na primeira prova");
		} else {
			System.out.println("aluno reprovado na primeira prova");
		}
		
		if(nota2 >= 6) {
			System.out.println("aluno aprovado na segunda prova");
		} else {
			System.out.println("aluno reprovado na segunda prova");
		}
		
		scanner.close();
	}
}
