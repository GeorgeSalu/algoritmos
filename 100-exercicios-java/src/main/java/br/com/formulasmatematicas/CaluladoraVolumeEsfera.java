package br.com.formulasmatematicas;

import java.util.Scanner;

/**
 * 
 * Crei um programa que solicite ao usuario o valor
 * do raio de uma esfera e calcule e exiba o seu volume
 *
 */
public class CaluladoraVolumeEsfera {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio de esfera : ");
		double raio = scanner.nextDouble();
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume da esfera é : "+volume);
		
		scanner.close();
	}
}
