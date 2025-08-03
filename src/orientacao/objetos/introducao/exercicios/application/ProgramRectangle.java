package orientacao.objetos.introducao.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import orientacao.objetos.introducao.exercicios.entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		System.out.println(rect);
		
		sc.close();
	}

}
