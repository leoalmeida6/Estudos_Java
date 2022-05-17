package entities;

public class Student {
	
	public String nome;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public void pass() {
		
		double pisoNota = 60.00;
		double media = this.nota1 + this.nota2 + this.nota3;
		double pontos = media - pisoNota;
		
		if (media < 60) {
			System.out.printf("FINAL GRADE = %.2f", media);
			System.out.println("FAILED");
			System.out.println("MISSING " + pontos + " POINTS");
		} else {
			System.out.println("FINAL GRADE = " + media);
			System.out.println("PASS");
		}
	}

}
