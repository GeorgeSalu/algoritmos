package br.com.capitulo2;

/*
 * 
 * Escreva um programa que converta um valor double em int e outro valor int em double. Exiba os resultados das conversões e explique a diferença entre conversão explícita e implícita
 * 
 * */
public class ConversaoDeTipos {
	public static void main(String[] args) {
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble; // conversao explicita de double para int
		
		int numero = 10;
		double numeroConvertido = numero; // conversao implicita de int para double
		
		System.out.println("valor double : "+valorDouble);
		System.out.println("valor convertido para int : "+valorInt);
		System.out.println("numero int : "+numero);
		System.out.println("numero convertido para double : "+numeroConvertido);
	}
}
