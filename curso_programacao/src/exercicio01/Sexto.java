package exercicio01;


import java.util.Locale;
import java.util.Scanner;

public class Sexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

//		System.out.println("Informe a base do Triangulo:");
//		A = teclado.nextDouble();
//		System.out.println("Informe a altura do Triangulo: ");
//		C = teclado.nextDouble();
//		
//		System.out.println("--------------------------------");
//		
//		System.out.println("Informe o raio da Circunfer�ncia: ");
//		C = teclado.
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		
		areaTriangulo = (A * C) / 2;
		areaCirculo = pi * (C * C);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;

		
		System.out.printf("TRI�NGULO: %.3f%n", areaTriangulo);
		System.out.printf("C�RCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAP�ZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RET�NGULO: %.3f", areaRetangulo);
		
		
		teclado.close();
	}
}
