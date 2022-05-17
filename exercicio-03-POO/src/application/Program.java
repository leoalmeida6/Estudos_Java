package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		System.out.printf("Nome do aluno: ");
		aluno.nome = sc.nextLine();

		// Pula Linha
		System.out.println();

		System.out.printf("Informe a nota do primeiro trimeste de 0 à 30: ");
		aluno.nota1 = sc.nextDouble();

		System.out.printf("Informe a nota do primeiro trimeste de 0 à 35: ");
		aluno.nota1 = sc.nextDouble();

		System.out.printf("Informe a nota do primeiro trimeste de 0 à 35: ");
		aluno.nota1 = sc.nextDouble();
		
		aluno.pass();
	}

}
