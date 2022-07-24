package dio.me.model;

import java.util.Objects;

public class Gato {

	private String raca;
	private String nome;
	private String cor;
	private String idade;

	public Gato() {
	}

	/*
	 * CTRL + 3 para criar o a estrutura do constructor, selecionar na caixa de
	 * opções quais propriedades definadas na classe, o constructor será incluínda
	 * no constructor
	 */

	public Gato(String raca, String nome, String cor, String idade) {
		super();
		this.raca = raca;
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	// get and setter CTRL +3 ggas
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	// equals
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome, raca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(raca, other.raca);
	}

	// toString just with Fields
	@Override
	public String toString() {
		return "Gato [raca=" + raca + ", nome=" + nome + ", cor=" + cor + ", idade=" + idade + ", getRaca()="
				+ getRaca() + ", getNome()=" + getNome() + ", getCor()=" + getCor() + ", getIdade()=" + getIdade()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

}
