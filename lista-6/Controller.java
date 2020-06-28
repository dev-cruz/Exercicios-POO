import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Controller {
	private ArrayList<Profissional> petsitters;
	private ArrayList<Cliente> customers;
	private Scanner scanner;
	private ArrayList<Animal> animals;
	
	public Controller() {
		petsitters = new ArrayList<Profissional>();
		customers = new ArrayList<Cliente>();
		scanner = new Scanner(System.in);
		animals = new ArrayList<Animal>();
	}
	
	public void register(String recordType) {
		System.out.println("Nome: ");
		String name = scanner.next();
		
		System.out.println("Email: ");
		String email = scanner.next();
		
		System.out.println("CPF:");
		String cpf = scanner.next();
		
		System.out.println("Endereço: ");
		System.out.println("Rua: ");
		String street = scanner.next();
		
		System.out.println("Numero: ");
		int number = scanner.nextInt();
		
		System.out.println("CEP: ");
		String zipCode = scanner.next();
		
		System.out.println("Bairro: ");
		String neighborhood = scanner.next();
		
		System.out.println("Cidade: ");
		String city = scanner.next();
		
		System.out.println("Estado: ");
		String state = scanner.next();
		
		System.out.println("Telefone: ");
		String phone = scanner.next();
				
		Endereco address = new Endereco(street, number, zipCode, neighborhood, city, state);
			
		if(recordType.toLowerCase() == "cliente") {
			Cliente customer = new Cliente(name, email, cpf, address, phone);
			clientes.add(customer);
			System.out.println("Cadastrado com sucesso.");
		}
		else if(recordType.toLowerCase() == "profissional") {
			Profissional petsitter = new Profissional(name, email, cpf, address, phone);
			petsitters.add(petsitter);
			System.out.println("Cadastrado com sucesso.");

		} else {
			System.out.println("Opção Inválida");
		}
	}
	
	public void delete(String deleteType) {
		System.out.println("Digite o nome e cpf do Profissional.");
		System.out.println("Nome: ");
		String name = scanner.next();
		System.out.println("CPF: ");
		String cpf = scanner.next();
		
		if(deleteType.toLowerCase() == "cliente") {
			customers.remove(new Cliente(name, cpf, null, null, null));
			System.out.println("Removido com sucesso");
		}
		else if(deleteType.toLowerCase() == "profissional") {
			petsitters.remove(new Profissional(name, cpf, null, null));
			System.out.println("Removido com sucesso");
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	public void Consultar() {
		for (Profissional profissional: petsitters) {
			if (profissional != null) {
				System.out.println("Nome: " + profissional.getName()+ 
						"Email: "+profissional.getEmail()+ 
						"CPF: " +profissional.getCpf()+
						"Endereço: " +profissional.getEnd()+
						"Telefone: " +profissional.getTelefone());
			}
		}
	}

	public void registerAnimal(String customerName) {
		Cliente customer = searchCustomerByName(customerName);

		if(customer) {
			System.out.println("Raça do animal: ");
			String breed = input.next();

			System.out.println("Gênero do animal: ");
			String gender = input.next();

			System.out.println("Idade do animal: ");
			int age = input.nextInt();

			Animal animal = new Animal(breed, gender, age)
			customer.addAnimal(animal);
			controller.addAnimal(animal);
		} else {
			System.out.println("Cliente não encontrado.");
		}
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public Cliente searchCustomerByName(String customerName) {
		for(Cliente customer: customers) {
			if(customer.getName() == customerName) {
				return customer;
			}
		}
		return null;
	}

	public void showCommonBreeds() {
		Map<string="", integer> commonBreeds = new HashMap<string="", integer>();
		for(Animal animal: animals) {
			String key = animal.getBreed();
			if(commonBreeds.containsKey(key)) {
				commonBreeds.put(key, commonBreeds.get(key) + 1);
			} else {
				commonBreeds.put(key, 1);
			}
		}

		for (Map.Entry<String, String> entry : commonBreeds.entrySet()) {
    		System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
