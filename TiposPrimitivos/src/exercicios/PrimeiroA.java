package exercicios;

import java.util.Random;

public class PrimeiroA {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int numero = gerador.nextInt(2);
		
		System.out.println("N�mero inteiro aleat�rio de 0 at� 1: " + numero);
		
	}
}