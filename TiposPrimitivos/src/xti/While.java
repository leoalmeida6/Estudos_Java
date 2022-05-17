package xti;

import java.util.ArrayList;
import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
//		int i = 0;
//		
//		do {
//			System.out.println(i);
//		} while(i < 2);
		
//		while(i < 2) {
//			System.out.println(i);
//			i++;
		
//		for(int i=0; i<11; i++) {
//			System.out.println(i);
		
		//FLUXO DE REPETIÇÃO
		ArrayList<String> produtos = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		produto = s.nextLine();
		
		while(!"FIM".equals(produto)) {
			produtos.add(produto);
		}
		
		System.out.println(produtos.toString());
		
		s.close();
	}
}