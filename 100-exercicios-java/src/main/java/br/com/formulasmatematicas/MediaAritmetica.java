package br.com.formulasmatematicas;

import java.util.Scanner;

/*
 * Escreva um programa que calcule a media
 * aritmetica de dois numeros 
 * 
 * */
public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o primeiro numero: ");
		double numero2 = scanner.nextDouble();
		
		double media = (numero1 + numero2) / 2;
		
		System.out.println("A media dos numero é: "+media);
		
		scanner.close();
	}
}
