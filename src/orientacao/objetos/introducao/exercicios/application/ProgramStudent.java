package orientacao.objetos.introducao.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import orientacao.objetos.introducao.exercicios.entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		st.printResult();
		
		sc.close();
	}

}
