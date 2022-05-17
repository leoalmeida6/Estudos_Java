package exercicio_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Quarto {
	
	public static void main(String[] args) {
		
		//Local US
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
				
		//Variables
		int numeroFunc, horasTrabalhadas;
		double valorHora, salario;		
		
		System.out.println("");
		System.out.println("========== CALCULA SAL�RIO ==========\n");
		System.out.println("");
		
		System.out.printf("Informe seu n�mero: ");
		numeroFunc = sc.nextInt();
		
		System.out.printf("Informe a quantidade de horas trabalhadas no m�s: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.printf("Informa o valor de sua hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		//Pula Linha
		System.out.println("");
		System.out.println("======================================");
		System.out.println("");
		
		System.out.printf("NUMBER: %d%n", numeroFunc);
		System.out.printf("SALARY: U$ %.2f%n", salario);
				
		sc.close();
	}
}