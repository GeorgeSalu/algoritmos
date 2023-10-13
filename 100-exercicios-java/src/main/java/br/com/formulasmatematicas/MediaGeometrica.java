package br.com.formulasmatematicas;

import java.util.Scanner;

/*
 * escreva um programa que calcule a media geometrica
 * entre tres numeros informados pelo usuario
 * 
 * */
public class MediaGeometrica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero : ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero : ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("Digite o terceiro numero : ");
		double numero3 = scanner.nextDouble();
		
		double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);
		
		System.out.println("A media geometrica dois numeros é "+mediaGeometrica);
		
		scanner.close();
	}
}
