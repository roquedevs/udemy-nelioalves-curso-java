package orientacao.objetos.introducao.exercicios.entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private static final double FEE = 5.0;

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public void deposit(double amount) {
		if (amount > 0.0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (getBalance() >= 0 && amount > 0 && amount < getBalance()) {
			balance -= amount + FEE;
		}
	}

	@Override
	public String toString() {
		String template = "%nAccount %d, Holder: %s, Balance: $ %.2f%n";
		return String.format(template, number, holder, getBalance());
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
}
