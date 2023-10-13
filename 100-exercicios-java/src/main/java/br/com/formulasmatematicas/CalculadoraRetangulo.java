package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que calcule o perimetro e a 
 * area de um retangulo, utilizando as formulas P = 2(l + c)
 * e A = lc onde l é a largura e c o comprimento
 *
 */
public class CalculadoraRetangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a largura do retangulo : ");
		double largura = scanner.nextDouble();
		
		System.out.println("Digite o comprimento do retangulo : ");
		double comprimento = scanner.nextDouble();
		
		double perimetro = 2 * (largura + comprimento);
		double area = largura * comprimento;
		
		System.out.println("O perimentro do retangulo é : "+perimetro);
		System.out.println("A area do retangulo é : "+area);
		
		scanner.close();
	}
}
