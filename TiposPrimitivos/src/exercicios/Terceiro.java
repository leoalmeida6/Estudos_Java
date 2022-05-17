package exercicios;

import java.util.Scanner;

public class Terceiro {
	
	public static void main(String[] args) {
		
		String nome, sobrenome;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--------------- NOME E SOBRENOME ---------------");
		
		System.out.print("Informe seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("--------------- ---------------");
		
		System.out.println("Nome completo: " + nome + " " + sobrenome);
		
		teclado.close();
	}
}