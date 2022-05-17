package exercicios;

import java.util.Random;

public class PrimeiroB {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		float numero = gerador.nextFloat();
		
		System.out.printf("Número inteiro aleatório de 0 até 1: %.2f", numero);
		
	}
}