package br.com.capitulo2;

import java.util.Scanner;

/*
 * 
 * Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O programa deve exibir uma mensagem de boas-vindas concatenando o nome e o sobrenome do usuário. 
 * 
 * */
public class ConcatenarStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome : ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o seu sobrenome : ");
		String sobrenome = scanner.nextLine();
		
		String mensagem = "Bem vindo ,"+nome+" "+sobrenome+" !";
		
		System.out.println(mensagem);
		scanner.close();
	}
}
