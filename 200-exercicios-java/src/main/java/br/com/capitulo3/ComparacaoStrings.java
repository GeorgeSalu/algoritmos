package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Desenvolva um programa que leia duas strings do usuário e verifique se elas são iguais. Exiba uma mensagem informando o resultado da comparação.
 * 
 * 
 * */
public class ComparacaoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a primeiro string : ");
		String string1 = scanner.nextLine();
		
		System.out.println("digite a segunda string : ");
		String string2 = scanner.nextLine();
		
		if(string1.equals(string2)) {
			System.out.println("as strings sao iguais");
		} else {
			System.out.println("as strings sao diferentes");
		}
		
		scanner.close();
	}
}
