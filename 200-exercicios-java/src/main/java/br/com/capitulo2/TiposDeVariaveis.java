package br.com.capitulo2;

/*
 * 
 *	Escreva um programa que declare variáveis locais e globais (dentro de uma classe). Inicialize e exiba o valor de ambas as variáveis no console. 
 * 
 * */
public class TiposDeVariaveis {

	// variavel global
	static int variavelGlobal = 10;
	
	public static void main(String[] args) {
		
		// variavel local
		int variavelLocal = 5;
		
		System.out.println("Valor da variavel global : "+variavelGlobal);
		System.out.println("Valor da variavel local : "+variavelLocal);
		
	}
}
