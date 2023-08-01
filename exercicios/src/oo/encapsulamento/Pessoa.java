package oo.encapsulamento;

public class Pessoa {
	private int idade; // mudamos de public para private
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome,int idade) {
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}
	
	// Se existirem validações a serem feitas, realizar dentro do setter, 
	// uma vez feito isso, não é necessário modificar todo código
	// Essa é a vantagem do encapsulamento
	
	// Gerado automaticamente
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	// Getter feito a mão
	public int getIdade() {
		return this.idade;
	}
	
	// Atributo calculado -> get sem atributo
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Setter feito a mão
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}

	@Override
	public String toString() {
		return "Olá, eu sou " + getNome() + " e tenho " + getIdade() + " anos";
	}
	
	
}
