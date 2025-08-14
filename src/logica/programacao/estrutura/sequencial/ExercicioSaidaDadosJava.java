package logica.programacao.estrutura.sequencial;

public class ExercicioSaidaDadosJava {

	public static void main(String[] args) {
		
		String produto1 = "Notebook";
		String produto2 = "Computador Desktop";
		
		byte idade = 30;
		short codigo = 5290;
		char genero = 'F';
		
		float preco1 = 2100.0f;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, custando no valor de: R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, custando no valor de: R$ %.2f%n", produto2, preco2);
		System.out.println();
		
		System.out.printf("Registro: %d anos, código %d e gênero: %c%n", idade, codigo, genero);
		System.out.println();
		
		System.out.printf("Medição com 8 casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (três casa decimais): %.3f%n", medida);
		System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);
	}

}
