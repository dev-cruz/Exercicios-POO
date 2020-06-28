package petsitter;

public class Animal {
	private String breed;
	private String gender;
	private int age;
	
	public Animal(String breed, String gender, int age) {
		this.breed = breed;
		this.gender = gender;
		this.age = age;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
