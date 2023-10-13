package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que calcule a energia 
 * cinetica de um objeto em movimento, utilizando a 
 * formula E = (mv²)/2, onde E é a energia cinetica, 
 * m é a massa do objeto e v é a velocidade
 *
 */
public class CalculadoraEnergiaCinetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a massa do objeto : ");
		double massa = scanner.nextDouble();
		
		System.out.println("Digite a velocidade do objeto : ");
		double velocidade = scanner.nextDouble();
		
		double energiaCinetica = (massa * Math.pow(velocidade, 2)) / 2;
		
		System.out.println("A energia cinetica do objeto é : "+energiaCinetica);
		
		scanner.close();
	}
}
