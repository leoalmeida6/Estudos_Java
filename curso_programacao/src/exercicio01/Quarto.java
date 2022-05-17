package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHorasTrabalhadas, salario;
		
		System.out.println("Informe o número do funcionário:");
		numeroFuncionario = teclado.nextInt();
		
		System.out.println("Informe as horas trabalhadas:");
		horasTrabalhadas = teclado.nextInt();
		
		System.out.println("Informe o valor que recebe por hora: ");
		valorHorasTrabalhadas = teclado.nextDouble();
		
		salario =  horasTrabalhadas * valorHorasTrabalhadas;
		
		System.out.println("Funcionário: " + numeroFuncionario);
		System.out.printf("Salário = U$ %.2f", salario);
		
		teclado.close();
	}

}
