package exercicios;

import java.util.Random;

public class PrimeiroB {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		float numero = gerador.nextFloat();
		
		System.out.printf("N�mero inteiro aleat�rio de 0 at� 1: %.2f", numero);
		
	}
}