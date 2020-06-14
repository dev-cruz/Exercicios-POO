package br.com.auto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio{
 
  public static void main(String[] args) {
		System.out.println("AUTO");
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
				cliente = new Cliente(null, null, null, null, null, null, null, op, null, null, null, null, null, null, null, null, null);
				System.out.println("Você entrou no Inserir Cliente.");
				System.out.println("Digite o Nome:");
				cliente.setNome(sc.next());
				System.out.println("Digite a CPF:");
				cliente.setCpf(sc.next());
				System.out.println("Digite Telefone:");
				cliente.setTelefone(sc.next());
				System.out.println("Digite Endereço");
				System.out.println("Rua:");
				cliente.setRua(sc.next());
				System.out.println("Número:");
				cliente.setNumero(sc.nextInt());
				System.out.println("Bairro:");
				cliente.setBairro(sc.next());
				System.out.println("Cidade");
			    cliente.setCidade(sc.next());
			    System.out.println("Carro");
		        System.out.println("Placa:");
				cliente.setPlaca(sc.next());
			    System.out.println("Ano:");
				cliente.setAno2(sc.next());
			    System.out.println("Modelo:");
				cliente.setModelo(sc.next());
				System.out.println("Valor");
			    cliente.setValor(sc.next());
			    
						          
			    listaPessoas.add(cliente);
			    

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
				System.out.println("Você entrou no Agendar Revisão");
				System.out.print("Digite o Nome: ");
			    var nome = sc.next();
				for(int i = 0; i < listaPessoas.size(); i++)
				 { 
					if(cliente.nome.equals(nome)) {
				System.out.println("Agendar Revisão");
			    System.out.println("Digite a data");
		        System.out.println("Dia");
		        cliente.setDia(sc.next());
		        System.out.println("Mes");
		        cliente.setMes(sc.next());
		        System.out.println("Ano");
		        cliente.setAno(sc.next());
		        System.out.println("Hora");
		        cliente.setHora(sc.next());
		        System.out.println("Minuto");
		        cliente.setMinuto(sc.next());
		        System.out.println("Relatório");
		        cliente.setRelatorio(sc.next());
				 } }
			    listaPessoas.add(cliente);
			    System.out.println("Agendado ");
    			System.out.println("Nome:"+cliente.getNome());
    			System.out.println("Carro3"+"\n"+"Placa:"+cliente.getPlaca()+"\n"+"Modelo:"+cliente.getModelo());
    			System.out.println("Dia:"+cliente.getDia()+"/"+cliente.getMes()+"/"+cliente.getBairro());
    			System.out.println("Hora:"+cliente.getHora()+":"+cliente.getMinuto());
			    System.out.println();
			break;
			case 4:
				System.out.println("Você entrou no Reagendar Revisão");
				System.out.print("Digite o Nome: ");
			    var nome1 = sc.next();
				for(int i = 0; i < listaPessoas.size(); i++)
			 { 
					if(cliente.nome.equals(nome1))    	{
						System.out.print("Dia:");
		    	        String Dia = sc.next();
		    	        System.out.print("Mes:");
		    	        String Mes =sc.next();
		    	        System.out.print("Hora:");
		    	        String Hora = sc.next();
		    	        System.out.print("Minuto");
		    	        String Minuto = sc.next();
		    	        cliente.setDia(Dia);
		    	        cliente.setMes(Mes);
		    	        cliente.setHora(Hora);
		    	        cliente.setMinuto(Minuto);}}
		    			System.out.print("\n");
		    			System.out.print("Agendado \n");
			    	    System.out.println("Nome:"+cliente.getNome());
			    		System.out.println("Carro:"+"\n"+"Placa:"+cliente.getPlaca()+"\n"+"Modelo:"+cliente.getModelo());
			    		System.out.println("Data:"+cliente.getDia()+"/"+cliente.getMes()+"/"+cliente.getAno());
			    		System.out.println("Hora:"+cliente.getHora()+":"+cliente.getMinuto());

						

           	   
	      
				break;
			case 5:
				System.out.println("Você entrou no Cancelar Revisão");
				System.out.print("Pessoas cadastradas:\n");
			    System.out.print(listaPessoas.toString());
			    System.out.print("Digite o Nome: ");
		        var nome2 = sc.next();
		        for(int i = 0; i < listaPessoas.size(); i++)
	    {
			            if (cliente.nome.equals(nome2)) {

			    	        String Dia = ("--");
			    	        String Mes = ("--");
			    	        String Hora = ("--");
			    	        String Ano = ("--");
			    	        String Minuto = ("--");
			    	        String Relatorio = ("--");
			    	        cliente.setDia(Dia);
			    	        cliente.setMes(Mes);
			    	        cliente.setAno(Ano);
			    	        cliente.setHora(Hora);
			    	        cliente.setMinuto(Minuto);
			    	        cliente.setRelatorio(Relatorio);}}
			                
			                System.out.println("Hora:"+cliente.getHora()+":"+cliente.getMinuto());
			                System.out.println("Data:"+cliente.getDia()+"/"+cliente.getMes()+"/"+cliente.getAno());
			                System.out.println("Relatório:"+cliente.getRelatorio());
			            
			        
				
				break;
				
			case 6:
				System.out.println("Você entrou no Relatórios");
				System.out.println(listaPessoas.toString());
				System.out.print("Agendado ");
	    	    System.out.println("Nome:"+cliente.getNome());
	    		System.out.println("Carro:"+"\n"+"Placa:"+cliente.getPlaca()+"\n"+"Modelo:"+cliente.getModelo());
	    		System.out.println("Data:"+cliente.getDia()+"/"+cliente.getMes()+"/"+cliente.getAno());
	    		System.out.println("Hora:"+cliente.getHora()+":"+cliente.getMinuto());
	    		System.out.println("Relatório:"+cliente.getRelatorio());


				break;
			
			
				default:
						menu.imprimirMenu();
						break;
				

			}
		}
		sc.close();
		}}