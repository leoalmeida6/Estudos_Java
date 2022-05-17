package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
				
		System.out.println("Informe o valor do RAIO:");
		raio = teclado.nextDouble();

		double area = pi * (raio * raio);
		
		System.out.printf("O valor da área deste círculo é de %.4f metros.", area);
		

		teclado.close();
	}

}
