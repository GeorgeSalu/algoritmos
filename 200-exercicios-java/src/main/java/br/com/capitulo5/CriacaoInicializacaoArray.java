package br.com.capitulo5;

/*
 * 
 * Crie um programa que declare um array de 5 números inteiros. Atribua valores a esse array e, em seguida, exiba os valores no console.
 * 
 * 
 * */
public class CriacaoInicializacaoArray {
	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		
		for(int i = 0;i < numeros.length;i++) {
			System.out.println("elemento "+i+" : "+numeros[i]);
		}
	}
}
