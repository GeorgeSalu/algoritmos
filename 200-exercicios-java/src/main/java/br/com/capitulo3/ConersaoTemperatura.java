package br.com.capitulo3;

import java.util.Scanner;

public class ConersaoTemperatura {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite a temparatura em graus celsius : ");
		double celcius = scanner.nextDouble();
		
		double fahrenheit = (celcius * 9/5)+32;
		
		System.out.println("a temperatura em fahrenheit é : "+fahrenheit);
		scanner.close();
	}
}
