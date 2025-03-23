package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que exiba um menu de opções e permita ao usuário escolher uma ação (como somar dois números, subtrair, etc.). 
 * O menu deve continuar sendo exibido até o usuário escolher a opção de sair.
 * 
 * 
 * */
public class MenuOpcoesDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao ;
		
		do {
			System.out.println("Menu de opcoes: ");
			System.out.println("1. somar dois numeros");
			System.out.println("2. subtrair dois numeros");
			System.out.println("3. multiplicar dois numeros");
			System.out.println("4. dividir dois numeros");
			System.out.println("5. sair");
			System.out.println("escolha uma opção");
			opcao = scanner.nextInt();
			
			if(opcao >= 1 && opcao <= 4) {
				System.out.println("digite o primeiro numero");
				double num1 = scanner.nextDouble();
				
				System.out.println("digite o segundo numero");
				double num2 = scanner.nextDouble();
				
				switch(opcao) {
					case 1:
						System.out.println("resultado : "+(num1+num2));
						break;
					case 2:
						System.out.println("resultado : "+(num1-num2));
						break;
					case 3:
						System.out.println("resultado : "+(num1*num2));
						break;
					case 4:
						System.out.println("resultado : "+(num1/num2));
						break;
				}
			} else if(opcao != 5) {
				System.out.println("opcao invalida, tente novamente");
			}
			
		} while(opcao != 5);
		
		System.out.println("programa encerrado");
		scanner.close();
	}
}
