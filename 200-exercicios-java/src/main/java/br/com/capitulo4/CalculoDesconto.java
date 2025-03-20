package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia o valor de uma compra e aplique um desconto de 10% se o valor for superior a R$100,00. Exiba o valor final com ou sem desconto.
 * 
 * */
public class CalculoDesconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o valor da compra");
		double valorCompra = scanner.nextDouble();
		
		if(valorCompra > 100.00) {
			valorCompra *= 0.90;
			System.out.println("Desconto aplicado! valor final R$ : "+valorCompra);
		} else {
			System.out.println("sem desconto, valor final : "+valorCompra);
		}
		
		scanner.close();
	}
}
