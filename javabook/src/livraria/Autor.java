package livraria;

public class Autor {
	private String nome, email, cpf;
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do autor:");
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("CPF: " + getCpf());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
