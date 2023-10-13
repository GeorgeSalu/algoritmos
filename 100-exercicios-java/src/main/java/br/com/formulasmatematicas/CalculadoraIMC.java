package br.com.formulasmatematicas;

import java.util.Scanner;

/*
 * Escreva um programa que calcule o IMC de um individuo
 * utilizando a formula IMC = peso / altura²  
 * 
 * */
public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso em quilogramas : ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura em metros : ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC é : "+imc);
		
		scanner.close();
	}
}
