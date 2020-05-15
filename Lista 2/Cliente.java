package br.com.auto;

public class Cliente {
	
	  
	  public String nome;
	  private String cpf;
	  public String telefone;
	  public String rua;
	  public int numero;
	  public String bairro;
	  public String cidade;
	  public String dia;
	  public String mes;
	  public String ano;
	  public String hora;
	  public String minuto;
	  public String placa;
	  public static String ano2;
	  public  String modelo;
	  public  String valor;
	  public String relatorio;
	  public Cliente(String nome, String cpf,String telefone, String mes, String ano, String dia, String rua, int numero, String bairro, String cidade, String hora, String minuto, String relatorio,String placa,String ano2,String modelo,String valor) { 
			this.nome = nome;
			this.cpf = cpf;
			this.telefone = telefone;
			this.rua = rua;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.hora = hora;
			this.minuto = minuto;
			this.relatorio = relatorio;
			this.placa=placa;
			this.ano2=ano2;
			this.modelo=modelo;
			this.valor=valor;
			}
	 
	  public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public static String getAno2() {
		return ano2;
	}

	public static void setAno2(String ano2) {
		Cliente.ano2 = ano2;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNome() {
	    return nome;
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

	public String getAno(){
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public void setNome(String nome) {
	    this.nome = nome;
	  }
	 
	 
	 
	  @Override
	  public String toString() {
	    String t=  "Nome: "+nome+"" +"\n"
	    		+"Endereço: " + "\n"+
	    			"Rua: "+rua+"Número:" +numero+"Bairro:"+bairro+"\n"+
	    			"Cidade: "+cidade +"\n"+
	    			"Placa:"+ placa +"\n"+
	    			"Ano de Fabricação:" + ano2 +"\n"+
	    			"Modelo:" + modelo +"\n"+
	    			"Valor:"+ valor +"\n"+
	    					"+++++++++++++++++++++++++++++++++++++\n";
		    	
		return t;
	  }


		 
		  
	  }
