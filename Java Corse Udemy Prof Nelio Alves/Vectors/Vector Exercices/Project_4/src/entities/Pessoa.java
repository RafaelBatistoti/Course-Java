package entities;

public class Pessoa {

	private String name;
	private int age;
	private double higher;

	public Pessoa(String name, int age, double higher) {
		this.name   = name;
		this.age    = age;
		this.higher = higher;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHigher() {
		return higher;
	}

}
