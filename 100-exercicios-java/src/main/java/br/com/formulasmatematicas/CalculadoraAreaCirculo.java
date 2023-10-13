package br.com.formulasmatematicas;

import java.util.Scanner;

/*
 * Escreva um programa que calcule a area de um 
 * circulo a partir do raio, utilizando a formula A = pi*r²
 * 
 * */
public class CalculadoraAreaCirculo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo : ");
		double raio = scanner.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é : "+area);
		
		scanner.close();
	}
}
