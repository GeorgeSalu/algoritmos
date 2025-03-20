package br.com.capitulo3;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é bissexto se for divisível por 4, mas não por 100, exceto se for divisível por 400.
 * 
 * */
public class VerficacaoAnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um ano : ");
		int ano = scanner.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("o ano é bissexto");
		} else {
			System.out.println("o ano nao é bissexto");
		}
		
		scanner.close();
	}
}
