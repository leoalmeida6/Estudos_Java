import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        int numero1, numero2, soma;

        System.out.printf("Informe um n�mero: ");
        numero1 = sc.nextInt();
        System.out.printf("Informe outro n�mero: ");
        numero2 = sc.nextInt();

        //Break line
        System.out.println("");

        soma = numero1 + numero2;

        System.out.printf("%d + %d = %d", numero1, numero2, soma);

        sc.close();
    }
}
