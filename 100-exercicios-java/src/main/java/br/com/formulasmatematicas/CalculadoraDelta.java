package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que calcule o delta de 
 * uma equação do segundo grau (delta = b² - 4ac)
 *
 */
public class CalculadoraDelta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de a : ");
		double a = scanner.nextDouble();
		
		System.out.println("Digite o valor de b : ");
		double b = scanner.nextDouble();
		
		System.out.println("Digite o valore de c : ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("O delta da equação é : "+delta);
		
		scanner.close();
	}
}
