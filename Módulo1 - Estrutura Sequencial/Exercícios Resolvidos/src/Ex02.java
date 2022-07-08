import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        //Locale

        Locale.setDefault(Locale.US);

        //Scanner
        Scanner sc = new Scanner(System.in);


        //Variables
        double raio, area, pi = 3.14159;

        System.out.printf("Informe um n�mero: ");
        raio = sc.nextDouble();

        //Break line
        System.out.println("");

        area = pi * (raio * raio);

        System.out.printf("Area = %.4f", area);

        sc.close();
    }
}
