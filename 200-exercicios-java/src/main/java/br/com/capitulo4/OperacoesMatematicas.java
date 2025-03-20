package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia dois números e um operador (+, -, *, /) e realize a operação correspondente. Exiba o resultado no console.
 * 
 * */
public class OperacoesMatematicas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("digite o segundo numero : ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("digite o operador (+,-,*,/) : ");
		char operador = scanner.next().charAt(0);
		
		switch(operador) {
			case '+':
				System.out.println("o resultado : "+(numero1+numero2));
				break;
			case '-':
				System.out.println("o resultado : "+(numero1-numero2));
				break;
			case '*':
				System.out.println("o resultado : "+(numero1*numero2));
				break;
			case '/':
				if(numero2 != 0) {
					System.out.println("o resultado : "+(numero1/numero2));
				} else {
					System.out.println("divisao por zero nao é permitido");
				}
				break;
			default:
				System.out.println("operador invalido");
		}
		
		scanner.close();
	}
}
