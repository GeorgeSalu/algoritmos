package br.com.capitulo4;

/*
 * 
 * Desenvolva um programa que conte quantos números entre 1 e 100 são múltiplos de 3.
 * 
 * 
 * */
public class ContagemMultiplosDeTres {
	public static void main(String[] args) {
		int contagem = 0;
		
		for(int i = 1;i <= 100;i++) {
			if(i % 3 == 0) {
				contagem++;
			}
		}
		
		System.out.println("quantidade de multiplos de 3 entre 1 a 100 : "+contagem);
	}
}
