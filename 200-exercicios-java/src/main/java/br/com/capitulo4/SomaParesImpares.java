package br.com.capitulo4;

/*
 * 
 * Escreva um programa que some todos os números pares de 1 a 100 e, separadamente, todos os números ímpares de 1 a 100.
 * 
 * 
 * */
public class SomaParesImpares {
	public static void main(String[] args) {
		int somaPares = 0, somaImpares = 0;
		
		for(int i = 1;i <= 100; i++) {
			if(i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}
		
		System.out.println("soma dos numeros pares : "+somaPares);
		System.out.println("soma dos numeros impares : "+somaImpares);
	}	
}
