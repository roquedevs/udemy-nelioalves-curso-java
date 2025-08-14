package logica.programacao.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Ler um texto
		sc.next();
		
		// Para ler um caractere
		sc.next().charAt(0);
		
		// Para ler vários dados na mesma linha
		sc.next();
		sc.nextInt();
		sc.nextDouble();
		
		// Ler um número inteiro
		sc.nextInt();
		
		// Ler um número decimal
		sc.nextDouble();
		
		// Para ler um texto até a quebra de linha
		sc.nextLine();
		
		/* Atenção: quebra de linha pendente!
		 * 
		 * Quando você usa um comando de leitura diferente do nextLine() e dá alguam quebra de linha,
		 * essa quebra de linha fica pendente no buffer de entrada. Se você você fizer um nextLine() extra,
		 * a quebra de linha será absorvida pelo nextLine() e limpará o buffer de entrada.
		 */
		sc.next(); // ou sc.nextInt() ou sc.nextDouble()
		sc.nextLine(); // Limpar o buffer de entrada, com a quebra de linha pendente
		sc.nextLine(); // nextLine() do seu interesse
		
		sc.close();
	}

}
