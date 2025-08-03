package orientacao.objetos.introducao.exercicios.utils;

public class CurrencyConverter {

	public static final double IOF = 6.0 / 100.0;
	
	public static double convert(double amount, double rate) {
		double base = amount * rate;
		return base * (1 + IOF);
	}
}
