package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que calcule a velocidade
 * media de um objeto, utilizando a formula 
 * v = delta s/ delta t, onde v é a velocidade media,
 * (delta s) é a variacao de espaco e (delta t ) 
 * é a variação de tempo 
 *
 */
public class CalculadoraVelocidadeMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a variação de espaco (As) : ");
		double variacaoEspaco = scanner.nextDouble();
		
		System.out.println("Digite a variacao de tempo (At) : ");
		double variavaoTempo = scanner.nextDouble();
		
		double velocidadeMedia = variacaoEspaco / variavaoTempo;
		
		System.out.println("A velocidade media é : "+velocidadeMedia);
		
		scanner.close();
	}
}
