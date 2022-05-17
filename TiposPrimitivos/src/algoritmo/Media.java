package algoritmo;

import java.util.Scanner;

public class Media {
	
	public static void main (String[] args) {
		
		float n1, n2, n3, n4, media;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe a primeira nota: ");
		n1 = teclado.nextFloat();
		System.out.println("Informe a segunda nota: ");
		n2 = teclado.nextFloat();
		System.out.println("Informe a terceira nota: ");
		n3 = teclado.nextFloat();
		System.out.println("Informe a quarta nota: ");
		n4 = teclado.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Média do " + nome + (":") + media);
		
		if (media >= 7) {
			System.out.println("APROVADO!");
		} else if (media < 7) {
			System.out.println("EXAME!");			
		} else {
			System.out.println("REPROVADO!");
		}
		
		teclado.close();
	}
		
}