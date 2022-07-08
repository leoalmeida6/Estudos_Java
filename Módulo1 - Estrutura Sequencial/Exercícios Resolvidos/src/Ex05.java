import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        //Locale
        Locale.setDefault(Locale.US);

        //Scanner
        Scanner sc = new Scanner(System.in);

        ///Variables
        int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
        double precoPeca1, precoPeca2, total;

        System.out.printf("Informe o código da peça: ");
        codPeca1 = sc.nextInt();
        System.out.printf("Informe a quantidade de peças: ");
        qtdPeca1 = sc.nextInt();
        System.out.printf("Informe o preço da peça: R$ ");
        precoPeca1 = sc.nextDouble();

        //Break line
        System.out.println("");

        System.out.printf("Informe o código da peça: ");
        codPeca2 = sc.nextInt();
        System.out.printf("Informe a quantidade de peças: ");
        qtdPeca2 = sc.nextInt();
        System.out.printf("Informe o preço da peça: R$ ");
        precoPeca2 = sc.nextDouble();

        //Break line
        System.out.println("");

        total = qtdPeca1 * precoPeca1 + qtdPeca2 * precoPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
