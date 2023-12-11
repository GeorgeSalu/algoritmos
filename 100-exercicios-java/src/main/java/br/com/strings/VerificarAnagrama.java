package br.com.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * crie um programa que leia duas palavras e verifique 
 * se a segunda palavra é um anagrama da primeira
 *
 */
public class VerificarAnagrama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primiera palavra : ");
		String palavra1 = scanner.nextLine();
		System.out.println("Digite a segunda palavra : ");
		String palavra2 = scanner.nextLine();
		
		// removendo os espacos em branco e convertendo para letras minusculas
		palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
		palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();
		
		// verificamos se as duas palavras tem o mesmo tamanho
		if(palavra1.length() != palavra2.length()) {
			System.out.println("a segunda palavra não e um anagrama da primeira");
		} else {
			// convertemos as palavras para arrays de caracteres
			char[] arr1 = palavra1.toCharArray();
			char[] arr2 = palavra2.toCharArray();
			
			// ordenando os arrays de caracteres
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			// verificando se os arrays ordenados são iguais
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("a segunda palavra é um anagrama da primeira");
			} else {
				System.out.println("a segunda palvra não é um anagrama da primeira");
			}
		}
		scanner.close();
	}
}

