package br.com.capitulo2;

import java.util.Scanner;

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
