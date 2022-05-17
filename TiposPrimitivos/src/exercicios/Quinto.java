package exercicios;

import java.util.Scanner;

public class Quinto {
	
	public static void main(String[] args) {
		
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		nome = teclado.nextLine();
		
		int tamanhoString = nome.length();
		
		System.out.println("Seu nome tem " + tamanhoString + " letras.");
		
		teclado.close();
	}
}