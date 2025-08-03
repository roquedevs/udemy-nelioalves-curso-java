package orientacao.objetos.introducao.exercicios;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public final double MINIMUM_APPROVED = 60.0;

	public double totalGrade() {
		return grade1 + grade2 + grade3;
	}

	public boolean isApproved() {
		return (totalGrade() >= MINIMUM_APPROVED);
	}

	public double remainingPoints() {
		return MINIMUM_APPROVED - totalGrade();
	}

	public void printResult() {
		System.out.printf("FINAL GRADE = %.2f%n", totalGrade());
		System.out.println(status());
	}

	public String status() {
		return isApproved() ? "PASS" : String.format("FAILED%nMISSING %.2f POINTS", remainingPoints());

	}
}
