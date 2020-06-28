package petsitter;
import java.util.ArrayList;

public class Cliente extends Cadastro {
	private List<Animal> animals = new ArrayList<Animal>();

	public Cliente(String name, String email, String cpf, Endereco address, String phone) {
		super(name, email, cpf, address, phone);
	}

	public void addAnimal(Animal animal) {
		if(animals.length >= 5) {
			System.out.println("Você possui o limite de animais para serem cadastrados!");
		} else {
			animals.add(animal);
			System.out.println("Animal adicionado com sucesso.");
		}
	}

	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}
}
