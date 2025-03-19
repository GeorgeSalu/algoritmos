package br.com.capitulo3;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a largura do retangulo : ");
		double largura = scanner.nextDouble();
		
		System.out.println("digite a altura do retangulo : ");
		double altura = scanner.nextDouble();
		
		double area = largura * altura;
		
		System.out.println("a area do retangulo : "+area);
		scanner.close();
	}
}
