package br.com.capitulo3;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o numero base : ");
		int base = scanner.nextInt();
		
		System.out.println("digite o expoente : ");
		int expoente = scanner.nextInt();
		
		double resultado = Math.pow(base, expoente);
		
		System.out.println("O resultado de "+base+" elevado a "+expoente+" é "+resultado);
		scanner.close();
	}
}
