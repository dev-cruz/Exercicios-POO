package clientesWB;

import java.util.Scanner;

public class Agenda {
	private Clientes[] clientes;
	private Scanner scanner;
	
	public Agenda() {
		clientes = new Clientes[10];
		scanner = new Scanner(System.in);
		
	}
	
	public void cadastrarClientes() {
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				System.out.println("\nNome: ");
				String nome = scanner.next();
				System.out.println("\nTelefone: ");
				String telefone = scanner.next();
				System.out.println("\nEmail: ");
				String email = scanner.next();
				System.out.println("\nGenero: ");
				String genero = scanner.next();
				Clientes novo = new Clientes(nome, telefone,email, genero);
				clientes[i] = novo;
				System.out.println("\nNovo cliente adcionado");
				break;
			}
		}
	}
	
	public void exibirOpcoes() {
		System.out.println("\nSelecione uma Opção: \n");
		System.out.println("1 - Exibir Clientes \n");
		System.out.println("2 - Adicionar Cliente \n");
		System.out.println("3 - Excluir Cliente \n");
		System.out.println("4 - Exibir por Gênero \n");
		System.out.println("5 - Sair \n");
	}
	
	public void exibirClientes() {
		for(Clientes clientes: clientes) {
			if(clientes != null) {
				System.out.println("\nNome: "+clientes.getNome()+"\nTelefone: "+clientes.getTelefone()+
						"\nEmail: "+clientes.getEmail()+"\nGênero:"+clientes.getGenero());
			}
		}
	}
	
	public Clientes[] getClientes() {
		return clientes;
	}
	
	public void setClientes(Clientes[] clientes) {
		this.clientes = clientes;
	}
	

}
