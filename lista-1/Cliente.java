package br.com.wb;



public class Cliente {


	public String nome;
	public String telefone;
	public String dia;
	public String mes;
	public String ano;
	public String getGenero() {
		return genero;
	}

	public int idade;
	public String genero;
	public String servico;

	
	public Cliente(String nome,String telefone, String dia, String mes, String ano,int idade,String genero,String servico) { 
		this.nome= nome;
		this.telefone = telefone;
		this.dia= dia;
		this.mes = mes;
		this.ano = ano;
		this.idade= idade;
		this.genero = genero;
		this.servico = servico;
		}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
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
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		String t = "+++++++++++++++++++++\n";
		t = t + "Nome: " + nome + "\n";
		t = t + "Telefone: " + telefone + "\n";
		t = t + "Data de nascimento: "+ dia +"/"+mes+"/"+ano +"\n";
		t = t + "Idade"+idade+"\n";
		t = t + "Genero:"+genero+"\n";
		t = t + "Serviço:"+servico+"\n";
		t = t + "++++++++++++++++++++++++++\n";
		return t;
}

	}
