package br.com.capitulo2;

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
