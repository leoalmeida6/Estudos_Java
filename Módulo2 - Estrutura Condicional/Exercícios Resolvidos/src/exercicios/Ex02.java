package exercicios;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int numero;

        System.out.println("=============================");
        System.out.println("        PAR ou ÍMPAR         ");
        System.out.println("=============================");

        //Pula Linha
        System.out.println("");

        System.out.printf("Informe um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            //Pula Linha
            System.out.println("");

            System.out.printf("%d É PAR!", numero);
        } else {
            //Pula Linha
            System.out.println("");

            System.out.printf("%d É ÍMPAR!", numero);
        }
        
        sc.close();
    }
}
