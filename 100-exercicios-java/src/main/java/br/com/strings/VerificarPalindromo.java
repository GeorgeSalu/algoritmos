package br.com.strings;

import java.util.Scanner;

/**
 * 
 * @author george
 * 
 * Faça um programa que leia uma palavra e verifique se a mesma
 * é um palindromo (se pode ser lida da mesma forma de trás pra frente)
 *
 */
public class VerificarPalindromo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		// removendo os espaços em brnaco e convertendo para letras minusculas
		String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
		boolean palindromo = true;
		
		// percorrendo a palavra verificando se os caracteres conicidem
		for(int i = 0;i < palavraFormatada.length() / 2; i++) {
			char a = palavraFormatada.charAt(i);
			char b = palavraFormatada.charAt(palavraFormatada.length() - i - 1);
			if(a != b) {
				palindromo = false;
				break;
			}
		}
		
		if (palindromo) {
			System.out.println("a palavra é um palindromo");
		} else {
			System.out.println("a palavra não é um palindromo");
		}
		scanner.close();
	}
}
