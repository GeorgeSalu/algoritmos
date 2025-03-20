package br.com.capitulo3;

/*
 * 
 * Escreva um programa que declare uma variável inteira, aplique o operador de incremento (++) e decremento (--), 
 * e exiba o valor da variável antes e depois de cada operação.
 * 
 * 
 * */
public class IncrementoDecremento {
	public static void main(String[] args) {
		int numero = 15;
		
		System.out.println("valor inicial : "+numero);
		
		numero++;
		System.out.println("apos incremento (++numero) : "+numero);

		numero--;
		System.out.println("apos decremento (--numero) : "+numero);
	}
}
