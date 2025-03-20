package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que leia a temperatura atual em graus Celsius e exiba uma mensagem dizendo se o clima está "Frio" 
 * (abaixo de 15ºC), "Agradável" (entre 15ºC e 30ºC) ou "Quente" (acima de 30ºC).
 * 
 * */
public class AvaliacaoTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a temperatura em graus celsius : ");
		double temperatura = scanner.nextDouble();
		
		if(temperatura < 15) {
			System.out.println("clima esta frio");
		} else if(temperatura <= 30) {
			System.out.println("clima esta agradavel");
		} else {
			System.out.println("clima quente");
		}
		
		scanner.close();
	}
}
