package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código da peça: ");
		int cod1 = teclado.nextInt();
		System.out.println("Informe o número da peça: ");
		int numero1 = teclado.nextInt();
		System.out.println("Informe o valor da peça: ");
		double valorUnit1 = teclado.nextDouble();
		
		System.out.println("Informe o código da peça: ");
		int cod2 = teclado.nextInt();
		System.out.println("Informe o número da peça: ");
		int numero2 = teclado.nextInt();
		System.out.println("Informe o valor da peça: ");
		double valorUnit2 = teclado.nextDouble();
		
		double valorTotal = ((numero1 * valorUnit1) + (numero2 * valorUnit2));  
		
		System.out.println();
		System.out.println();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		teclado.close();

	}

}
