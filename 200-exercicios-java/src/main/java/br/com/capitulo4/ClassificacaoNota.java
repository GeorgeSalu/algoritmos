package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia uma nota de 0 a 10 e classifique a nota de acordo com as seguintes categorias: 
 * 		10: Excelente 
 * 		8 e 9: Muito bom 
 * 		6 e 7: Bom 
 * 		5: Regular 
 * 		0 a 4: Insuficiente
 * 
 * */
public class ClassificacaoNota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite uma nota de 0 a 10: ");
		int nota = scanner.nextInt();
		
		switch(nota) {
			case 10:
				System.out.println("excelente");
				break;
			case 9:
			case 8:
				System.out.println("muito bom");
				break;
			case 7:
			case 6:
				System.out.println("bom");
				break;
			case 5:
				System.out.println("regular");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("insuficiente");
				break;
			default:
				System.out.println("nova invalida");
		}
		
		scanner.close();
	}
}
