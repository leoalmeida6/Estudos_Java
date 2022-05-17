package exercicios;

import java.util.Random;

public class PrimeiroA {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int numero = gerador.nextInt(2);
		
		System.out.println("Número inteiro aleatório de 0 até 1: " + numero);
		
	}
}