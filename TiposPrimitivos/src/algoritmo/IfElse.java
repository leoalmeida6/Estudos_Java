package algoritmo;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		int A, B, X;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um valor para A: ");
		A = teclado.nextInt();
		System.out.print("Informe um valor para B: ");
		B = teclado.nextInt();
		
		X = A + B;
		
		//Pula Linha
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("");
		
		System.out.println("X = " + X);
		
		//Pula Linha
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("");
		
		if (X >= 10) {
			System.out.println(X + " + 5 = " + (X + 5));			
		} else {
			System.out.println(X + " - 7 = " + (X - 7));
		}
		teclado.close();
	}
}