package algoritmo;

import java. util.Scanner;

public class Soma {
	
	public static void main(String[] args) {
		
		int A, B, X;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um valor para A: ");
		A = teclado.nextInt();
		System.out.print("Informe um valor para A: ");
		B = teclado.nextInt();
		
		//Pula Linha
		System.out.println("");
		
		X = A + B;
		
		if (X > 10) {
			System.out.println(A + " + " + B + " = " + X );
			System.out.println("X é MAIOR que 10!");
		} else {
			
		}		
		
		teclado.close();
	}
}