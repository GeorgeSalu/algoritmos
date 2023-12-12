package br.com.condicionais;

import java.util.Scanner;

/***
 * 
 * Faça um programa que leia as notas de duas provas, calcule
 * a media aritmetica simples, e informe se o aluno foi aprovado
 * (media maior ou igual a 6) ou reprovado (media menor que 6)
 *
 */
public class VerificaAprovacaoMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a nota da primeira prova : ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("digite a nota da segunda prova : ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("media : "+media);
		
		if(media >= 6) {
			System.out.println("aluno aprovado");
		} else {
			System.out.println("aluno reprovado");
		}
		
		scanner.close();
	}
}
