package estrutura.dados.vetores.exercicios;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Double altura;
	private Character genero;

	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(Double altura, Character genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return String.format("""
				-- Dados Pessoa --
				Nome: %s
				Idade: %d
				Altura: %.1f
				Gênero: %c
				""", nome, idade, altura, genero);
	}
}
