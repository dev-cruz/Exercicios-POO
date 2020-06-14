package br.com.wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {
 
  public static void main(String[] args) {
		System.out.println("WB");
		List<Cliente> listaPessoas = new ArrayList<Cliente>();
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);
		Cliente cliente = null;
		int op = 1000;
		while(op != 0) {
			menu.imprimirMenu();
			op = sc.nextInt();
			switch(op) {
			case 1:
				cliente = new Cliente(null, null, null, null, null, op, null, null);
				System.out.println("Você entrou no Inserir Cliente.");
				System.out.print("Digite o Nome: ");
		        cliente.setNome(sc.next());
		        System.out.print("Digite o Telefone: ");
		        cliente.setTelefone(sc.next());
		        System.out.print("Digite a Idade:");
		        cliente.setIdade(sc.nextInt());
		        System.out.println("Digite a data de nascimento");
		        System.out.println("Dia");
		        cliente.setDia(sc.next());
		        System.out.println("Mes");
		        cliente.setMes(sc.next());
		        System.out.println("Ano");
		        cliente.setAno(sc.next());
		        System.out.println("Digite o seu genero:M OU F");
		        cliente.setGenero(sc.next());
		        System.out.println("Digite o serviço que vc já usou:");
		        cliente.setServico(sc.next());
		        
		          
		          listaPessoas.add(cliente);
		        

				System.out.println();

				break;
				
			case 2:
				System.out.println("Você entrou no Lista de Cliente.");
				if(listaPessoas.isEmpty()){
		              System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar!");
		              sc.nextLine();
		            }else{
		              System.out.println(listaPessoas.toString());}
				break;
			case 3:
				System.out.println("Você entrou no Excluir Cliente");
				System.out.print("Pessoas cadastradas:\n");
			    System.out.print(listaPessoas.toString());
		        for(int i = 0; i < listaPessoas.size(); i++)
	    {
			    	System.out.print("Digite o Nome: ");
			        var nome = sc.next();
			            if (cliente.nome.equals(nome)) {
			                listaPessoas.remove(nome);
			            }
			        }
			    System.out.print("Pessoas cadastradas após remoção:\n");
			    System.out.print(listaPessoas.toString());
				break;
			case 4:
				System.out.println("Você entrou no Editar Cliente");
				for(int i = 0; i < listaPessoas.size(); i++)
			 {
			    System.out.print("Digite o Nome: ");
			    var nome = sc.next();
				
           	   if(cliente.getNome() == nome)    	{
           	   
           	System.out.print("Digite o Telefone: ");
	        String Telefone =sc.next();
	        System.out.print("Digite a Idade:");
	        int Idade= sc.nextInt();
	        System.out.println("Digite a data de nascimento");
	        System.out.println("Dia");
	        String Dia= sc.next();
	        System.out.println("Mes");
	        String Mes= sc.next();
	        System.out.println("Ano");
	        String Ano= sc.next();
	        System.out.println("Digite o seu genero:M OU F");
	        String Genero=sc.next();
	        System.out.println("Digite o serviço que vc já usou:");
	        String Servico = sc.next();
                
                cliente.setTelefone(Telefone);
                cliente.setIdade(Idade);
                cliente.setDia(Dia);
                cliente.setMes(Mes);
                cliente.setAno(Ano);
                cliente.setGenero(Genero);
                cliente.setServico(Servico);
						    System.out.print("Pessoas cadastradas após atualização:\n");
						    System.out.print(listaPessoas.toString());}}
				break;
			case 5:
				System.out.println("Você entrou no Listagem");	
				System.out.println("Listagem de somente os clientes de um determinado gênero em ordem alfabética.");

				for(int i = 0; i < listaPessoas.size(); i++)
				 {
					System.out.println("Digite o seu genero:M OU F");
				    String genero = sc.next();
            	   if(cliente.getGenero().equals(genero)){
            		   System.out.print("Nome: " + cliente.getNome());
            	   }} 
				System.out.println("Para cada cliente a lista dos serviços e/ou produtos que este consumiu");
				for(int i = 0; i < listaPessoas.size(); i++)
				 {
				  System.out.print("Nome: " + cliente.getNome());
				  System.out.println("Serviço:"+cliente.getServico());}
				
				break;
				
			case 6:
				System.out.println("Você entrou no Relatórios");
				System.out.println("Qual é a idade média de todo o público de uma unidade.");
				System.out.println((cliente.getIdade()/2));
				for(int i = 0; i < listaPessoas.size(); i++)
				System.out.println("Qual é a idade média do público para um determinado gênero");	
				 {System.out.println("Digite o seu genero:M OU F");
				    String genero = sc.next();
	            	   if(cliente.getGenero().equals(genero)){
	            		   System.out.println((cliente.getIdade()/2));;
	            	   }}
				 System.out.println("Qual é o serviço mais procurado para todo o público");
				 System.out.println((cliente.getServico()));
				 for(int i = 0; i < listaPessoas.size(); i++)
						System.out.println("Qual é o seriço mais procurado para um determinado gênero.");	
						 {System.out.println("Digite o seu genero:M OU F");
						    String genero = sc.next();
			            	   if(cliente.getGenero().equals(genero)){
			            		   System.out.println((cliente.getServico()));;
			            	   }}
				 

				
				default:
						menu.imprimirMenu();
						break;
				

			}
		}
		sc.close();}
}