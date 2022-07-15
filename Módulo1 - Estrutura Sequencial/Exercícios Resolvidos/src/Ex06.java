import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        //Locale
        Locale.setDefault(Locale.US);

        //Scanner
        Scanner sc = new Scanner(System.in);

        ///Variables
        double A, B, C, AREA, pi = 3.14159;

        System.out.printf("Informe o valor de A: ");
        A = sc.nextDouble();

        System.out.printf("Informe o valor de B: ");
        B = sc.nextDouble();

        System.out.printf("Informe o valor de C: ");
        C = sc.nextDouble();

        //Break line
        System.out.printf("%n");

        //TRIANGULO
        AREA = (A * C) / 2;
        System.out.printf("TRIANGULO = %.3f%n", AREA);
        //CIRCULO
        AREA = pi * C * C;
        System.out.printf("CIRCULO = %.3f%n", AREA);
        //TRAPEZIO
        AREA = (A + B) * C / 2;
        System.out.printf("TRAPEZIO = %.3f%n", AREA);
        //QUADRADO
        AREA = B * B;
        System.out.printf("QUADRADO = %.3f%n", AREA);
        //RETANGULO
        AREA = A * B;
        System.out.printf("RETANGULO = %.3f%n", AREA);

        sc.close();
    }
}