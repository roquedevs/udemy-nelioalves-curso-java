package logica.programacao.estrutura.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// Fórmula para calcular área do triângulo retângulo: A = (base * altura) / 2
		triangulo = A * C / 2;
		
		// Fórmula para calcular área do círculo de raio: A = π.r²
		circulo = Math.PI * Math.pow(C, 2.0);
		
		// Fórmula para calcular área do trapezio: A = (B + b) * h / 2
		trapezio = (A + B) * C / 2.0;
		
		// Fórmula para calcular área do quadrado: A = lado²
		quadrado = Math.pow(B, 2.0);
		
		// Fórmula para calcular área do retângulo: A = b x h
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
