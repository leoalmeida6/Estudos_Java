import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        //Locale
        Locale.setDefault(Locale.US);

        //Scanner
        Scanner sc = new Scanner(System.in);

        ///Variables
        int numeroFunc, horasTrabalhadas;
        double valorHora, salario;

        System.out.printf("Informe o número do funcionário: # ");
        numeroFunc = sc.nextInt();
        System.out.printf("Informe quantas horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.printf("Informe o valor da hora trabalhada: U$ ");
        valorHora = sc.nextDouble();

        //Break line
        System.out.println("");

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Number = %d%n", numeroFunc);
        System.out.printf("Salary: U$ %.2f", salario);

        sc.close();
    }
}
