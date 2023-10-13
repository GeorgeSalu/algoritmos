package br.com.formulasmatematicas;

import java.util.Scanner;

/*
 * Crei um programa que calcule e exiba o perimetro
 * de um circulo, solicitando o raio ao usuario
 * 
 * */
public class CalcularPerimetroCirtulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo : ");
		double raio = scanner.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		
		System.out.println("O perimetro do cirulo é : "+perimetro);
		
		scanner.close();
	}
}
