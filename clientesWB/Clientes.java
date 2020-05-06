package clientesWB;

public class Clientes {
	private String nome;
	private String telefone;
	private String email;
	private String genero;
	
	public Clientes (String nome, String telefone, String email, String genero) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}
