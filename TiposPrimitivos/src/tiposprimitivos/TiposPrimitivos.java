package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		//float nota = 8.5f;
		//float nota = (float) 8.5;		TYPECAST
		//Float nota = new Float (8.5); WRAPPER CLASS
		
		//System.out.println("A nota de "+ nome + " é " + nota + ".");
		//System.out.printf("A nota de %s é %.1f", nome, nota);
		System.out.format("A nota de %s é %.1f", nome, nota);
		
		teclado.close();	
		
	}
}