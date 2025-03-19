package br.com.capitulo2;

/*
 * 
 * Desenvolva um programa que exiba o valor de uma variável double com duas casas decimais. Utilize formatação para garantir que o valor seja exibido corretamente.
 * 
 * */
public class FormatacaoSaida {
	public static void main(String[] args) {
		double valor = 123.456789;
		
		System.out.printf("valor formatado : %.2f%n", valor);
	}
}
