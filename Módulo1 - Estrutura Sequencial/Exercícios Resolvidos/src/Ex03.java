import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Varivables
        int A, B, C, D, DIFERENCA;

        System.out.printf("Informe o valor de A: ");
        A = sc.nextInt();
        System.out.printf("Informe o valor de B: ");
        B = sc.nextInt();
        System.out.printf("Informe o valor de C: ");
        C = sc.nextInt();
        System.out.printf("Informe o valor de D: ");
        D = sc.nextInt();

        DIFERENCA = (A * B - C * D);

        //Break line
        System.out.println("");

        System.out.printf("DIFERENCA = %d", DIFERENCA);

        sc.close();
    }
}
