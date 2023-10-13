package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Escreva um programa que calcule o perimetro
 * e a area de um triangulo, utilizando as fromulas 
 * P = a + b + c e A = (b *h)/2, onde a,b e c são os lados
 * do triangulo e h é a alguta relativa ao lado b
 *
 */
public class CalculadoraTriangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o lado a do triangulo : ");
		double ladoA = scanner.nextDouble();
		
		System.out.println("Digite o lado b do triangulo : ");
		double ladoB = scanner.nextDouble();
		
		System.out.println("digite o lado c do triangulo : ");
		double ladoC = scanner.nextDouble();
		
		System.out.println("Digite a altura h relativa ao lado b do triangulo : ");
		double altura = scanner.nextDouble();
		
		double perimentro = ladoA + ladoB + ladoC;
		double area = (ladoB + altura) / 2;
		
		System.out.println("O perimetro do triangulo é : "+perimentro);
		System.out.println("A area do triangulo é "+area);
		
		scanner.close();
	}
}
