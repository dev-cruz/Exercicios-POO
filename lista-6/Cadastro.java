package petsitter;

public class Cadastro {
	private String name;
	private String email;
	private String cpf;
	public Endereco end;
	private String telefone;
	private Animal ani;
	
	public Cadastro(String name, String email, String cpf, Endereco end, String telefone) {
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.end = end;
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Endereco getEnd() {
		return end;
	}
	
	public void setEnd(Endereco end) {
		this.end = end;
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

	public Animal getAni() {
		return ani;
	}

	public void setAni(Animal ani) {
		this.ani = ani;
	}


}
