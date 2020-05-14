package clientesWB;

import java.util.Scanner;

public class Cadastro {
	private static Scanner scanner;
	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int sair = 0;
		int opc = 0;
		while(sair == 0) {
			switch(opc) {
			//Exibir Opções
			case 0:{
				agenda.exibirOpcoes();
				opc = scanner.nextInt();
				break;
			}
			
			//Exibir Clientes
			case 1:{
				agenda.exibirClientes();
				opc = 0;
				break;
			}
			case 2:{
				agenda.cadastrarClientes();
				opc = 0;
				break;
			}
			
			//Deletar Cliente
			case 3:{
				
			}
			
			//Exibir por Gênero
			case 4:{
			
			}
			
			//Sair
			case 5:{
				sair = 1;
				System.out.println("\nSystem Close\n");
				break;
			}
			
			//Caso o sistema não encontre o Insert
			default:{
				agenda.exibirOpcoes();
				opc = scanner.nextInt();
				break;
			}
		}

	}
}
}
