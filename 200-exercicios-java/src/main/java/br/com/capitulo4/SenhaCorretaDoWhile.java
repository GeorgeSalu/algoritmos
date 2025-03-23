package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Escreva um programa que peça ao usuário para digitar uma senha. Continue pedindo a senha até que a senha correta seja digitada.
 * 
 * 
 * */
public class SenhaCorretaDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senhaCorreta = "1234";
		String senhaDigitada;
		
		do {
			System.out.println("digite a senha : ");
			senhaDigitada = scanner.nextLine();
			if(!senhaDigitada.equals(senhaCorreta)) {
				System.out.println("senha incorreta, tente novamente");
			}
		}while(!senhaDigitada.equals(senhaCorreta));
		
		System.out.println("senha correta! acesso concedido");
		
		scanner.close();
	}
}
