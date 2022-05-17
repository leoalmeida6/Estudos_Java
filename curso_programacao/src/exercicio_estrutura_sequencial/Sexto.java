package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sexto {
	
	public static void main(String[] args) {
		
		//Local US
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double A, B, C;
		double pi = 3.14159;
		double ATR; //Area Tri�ngulo Ret�ngulo
		double AC; //Area C�rculo
		double AT; //Area Trap�zio
		double AQ; //Area Quadrado
		double AR; //Area Ret�ngulo
		
		
		System.out.println("||===========================================||");
		System.out.println("||              CALCULO DAS �REAS            ||");
		System.out.println("||===========================================||");
		
		//Pula Linha
		System.out.println("");
		System.out.println("");
		
		System.out.printf("Informe o valor de (A): ");
		A = sc.nextDouble();
		System.out.printf("Informe o valor de (B): ");
		B = sc.nextDouble();
		System.out.printf("Informe o valor de (C): ");
		C = sc.nextDouble();
		
		ATR = (A * C) / 2;
		AC = pi * (C * C);
		AT = ((A + B) * C) / 2;
		AQ = B * B;
		AR = A * B;
		
		//Pula Linha
		System.out.println("");
		System.out.println("");
		
		System.out.println("||===========================================||");
		System.out.println("||                 RESULTADOS                ||");
		System.out.println("||===========================================||");
				
		System.out.printf("TRI�NGULO: %.3f%n", ATR);
		System.out.printf("C�RCULO: %.3f%n", AC);
		System.out.printf("TRAP�ZIO: %.3f%n", AT);
		System.out.printf("QUADRADO: %.3f%n", AQ);
		System.out.printf("RETANGULO: %.3f%n", AR);
		
		sc.close();
	}
}