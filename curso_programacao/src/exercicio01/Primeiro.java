package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
	
	public static void main(String[] args ) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a largura do terreno?");
		double largura = sc.nextDouble();
		
		System.out.println("Qual o comprimento do terreno?");
		double comprimento = sc.nextDouble();
		
		System.out.println("Qual o metro quadrado do terreno?");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		//System.out.println("PREÇO = " + area);
		
		
		sc.close();
	}
}