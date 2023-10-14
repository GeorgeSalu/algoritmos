package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Esreva um programa que calcule o trabalho
 * realizado por uma força que atua sobre um objeto,
 * utilizando a formula T = F * d, onde T é o trabalho,
 * F é a força realizada e d é a distancia percorrida 
 *
 */
public class CalculadoraTrabalho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a força aplicada : ");
		double forca = scanner.nextDouble();
		
		System.out.println("Digite a distancia percorrida : ");
		double distancia = scanner.nextDouble();
		
		double trabalho = forca * distancia;
		
		System.out.println("O trabalho realizado é : "+trabalho);
		
		scanner.close();
	}
}
