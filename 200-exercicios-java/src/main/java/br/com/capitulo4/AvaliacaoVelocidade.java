package br.com.capitulo4;

import java.util.Scanner;

/*
 * 
 * Crie um programa que leia a velocidade de um veículo e exiba uma mensagem dizendo se o veículo está dentro do limite de 
 * velocidade (até 60 km/h), acima do limite (entre 61 km/h e 80 km/h) ou muito acima do limite (acima de 80 km/h).
 * 
 * */
public class AvaliacaoVelocidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a velocidade do veiculo (km/h) : ");
		int velocidade = scanner.nextInt();
		
		if(velocidade <= 60) {
			System.out.println("velocidade esta dentro do limite de velocidade");
		} else if(velocidade <= 80) {
			System.out.println("veiculo esta acima do limite de velocidade");
		} else {
			System.out.println("veiculo esta muito acima do limete de velocidade");
		}
		
		scanner.close();
	}
}
