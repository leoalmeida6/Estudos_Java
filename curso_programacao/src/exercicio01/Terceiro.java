package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		System.out.println("Informe o valor de A: ");
		A = teclado.nextInt();
		
		System.out.println("Informe o valor de B: ");
		B = teclado.nextInt();
		
		System.out.println("Informe o valor de C: ");
		C = teclado.nextInt();
		
		System.out.println("Informe o valor de D: ");
		D = teclado.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.printf("A diferença do produto de (%dx%d - %dx%d) = %d", A, B, C, D, DIFERENCA);
		
		teclado.close();
	}

}
