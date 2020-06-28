package petsitter;

public class Endereco {
	public String street;
	public int number;
	public String zipCode;
	public String neighborhood;
	public String city;
	public String state;
	
	public Endereco(String street, int number, String zipCode, String neighborhood, String city, String state) {
		this.street = street;
		this.number = number;
		this.zipCode = zipCode;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}
}
