package br.com.capitulo3;

/*
 * 
 * Crie um programa que declare uma variável inteira, atribua um valor a ela e, em seguida, modifique o valor utilizando os 
 * operadores de atribuição (+=, -=, *=, /=, %=). Exiba o resultado após cada operação.
 * 
 * 
 * */
public class AtribuicaoSimples {
	public static void main(String[] args) {
		
		int valor = 10;
		
		valor += 5;
		System.out.println("apos valor += 5 : "+valor);
		
		valor -= 3;
		System.out.println("apos valor -= 3 : "+valor);
		
		valor *= 2;
		System.out.println("apos valor *= 2 : "+valor);
		
		valor /= 4;
		System.out.println("apos valor /=4 : "+valor);
		
		valor %= 3;
		System.out.println("apos valor %=3 : "+valor);
		
	}
}
