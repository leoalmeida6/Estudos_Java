package exercicios;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int A, B;

        System.out.println("=============================");
        System.out.println("   MULTIPLO ou NÃO MULTIPLO  ");
        System.out.println("=============================");

        //Pula Linha
        System.out.println("");

        System.out.printf("Informe um número: ");
        A = sc.nextInt();
        System.out.printf("Informe outro número: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            //Pula Linha
            System.out.println("");

            System.out.printf("%d e %d sÃ£o MULTIPLOS!", A, B);
        } else {
            //Pula Linha
            System.out.println("");

            System.out.printf("%d e %d NÃƒO sÃ£o MULTIPLOS!", A, B);
        }

        sc.close();
    }
}
