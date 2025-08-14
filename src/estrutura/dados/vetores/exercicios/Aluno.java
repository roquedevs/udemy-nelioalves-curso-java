package estrutura.dados.vetores.exercicios;

public class Aluno {

	private String nome;
	private Double nota1;
	private Double nota2;
	private static final Double MEDIA_APROVACAO = 6.0;
	
	public Aluno(String nome, Double nota1, Double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double media() {
		return (nota1 + nota2) / 2.0;
	}
	
	public boolean aprovado() {
		return media() >= MEDIA_APROVACAO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

}
