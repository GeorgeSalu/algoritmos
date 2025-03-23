package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Enunciado: Desenvolva um programa que leia um número e multiplique esse número por 2 repetidamente até o valor exceder 1000.
 * 
 * 
 * */
public class MultipliacacaoAcumuladaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero : ");
		int numero = scanner.nextInt();
		
		while(numero <= 1000) {
			numero *= 2;
			System.out.println("valor apos multiplicacao : "+numero);
		}
		
		System.out.println("valor final apos multiplicacao acumulada : "+numero);
		
		scanner.close();
	}
}
