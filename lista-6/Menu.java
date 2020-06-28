import java.util.Scanner;

public class Menu {
	public static void renderOptions() {
		System.out.println("Cadastro: ");
		System.out.println("1 - Cadastar");
		System.out.println("2 - Cadastrar animal");
		System.out.println("3 - Excluir");
		System.out.println("4 - Raças mais comuns");
		System.out.println("5 - Sair");
		System.out.println(" - Opcao: ");
	}

	public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		String operationType;
		Controller controller = new Controller();
		
		do {
			renderOptions();
			option = input.nextInt();
			
			switch(option) {
				case 1:
					System.out.print("Deseja cadastrar cliente ou profissional? ");
					operationType = input.next();
					controller.register(operationType);
					break;
				case 2:
					System.out.print("Nome do cliente: ");
					String customerName = input.next()\;
					controller.registerAnimal(customerName);
					break;
				case 3:
					System.out.print("Deseja deletar cliente ou profissional? ");
					operationType = input.next();
					controller.delete(operationType);
					break;
				case 4:
					controller.showCommonBreeds();
					break;
				case 5:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opcao invalida");
			}
			
		} while(option != 5);
		input.close();
	}
}
