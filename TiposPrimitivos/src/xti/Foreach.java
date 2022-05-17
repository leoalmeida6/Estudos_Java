package xti;

import java.util.ArrayList;

public class Foreach {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
			System.out.println(list);
		}
		for(Integer numero : list) {
			System.out.println(numero);
		}
			
		
	}
}