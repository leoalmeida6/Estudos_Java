package exercicios;

import java.util.Scanner;

public class Quarto {
	
	public static void main(String[] args) {
		
		//TYPECASTING
		
		double numero;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número real: ");
		numero = teclado.nextFloat();
		
		int num = (int) numero;
		
		System.out.println(num);
		
		teclado.close();
		
		
//-------------------------------------------//
//OPÇÃO 2 - Double.intValue() methodm
//-------------------------------------------//
		
//		Double numero;		
//		Scanner teclado = new Scanner(System.in);
//		
//		System.out.print("Digite um número real: ");
//		numero = (double) teclado.nextFloat();
//		
//		int valor = numero.intValue();
//		
//		
//		System.out.println(v);
//		
//		teclado.close();
		
	}
}

