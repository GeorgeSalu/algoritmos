package br.com.capitulo2;

/*
 * 
 * Desenvolva um programa que declare duas variáveis int e realize as operações de soma, subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados de cada operação.
 * 
 * */
public class OperacoesAritmeticas {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		int soma = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		int divisao = a / b;
		int modulo = a % b;
		
		System.out.println("Soma : "+soma);
		System.out.println("Subtracao : "+subtracao);
		System.out.println("Multiplicacao : "+multiplicacao);
		System.out.println("Divisao : "+divisao);
		System.out.println("Modulo : "+modulo);
	}
}
