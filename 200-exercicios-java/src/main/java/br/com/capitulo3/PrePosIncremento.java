package br.com.capitulo3;

/*
 * 
 * Desenvolva um programa que leia cinco números inteiros do usuário, um por vez, e acumule a soma deles usando o 
 * operador de atribuição +=. Exiba o total acumulado ao final.
 * 
 * 
 * */
public class PrePosIncremento {
	public static void main(String[] args) {
		int valorPrePos = 10;
		
		System.out.println("valor inicial : "+valorPrePos);
		
		int preIncremento = ++valorPrePos;
		System.out.println("apos pre-incremento (++valor) : "+preIncremento);
		
		int posIncremento = valorPrePos++;
		System.out.println("apos pos-incremento (valor++) : "+posIncremento);
		
		System.out.println("valor final apos pos-incremento"+valorPrePos);
	}
}
