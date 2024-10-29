package entities;

public class Compani extends TaxPayer {

	private Integer numberOfEmployees;

	public Compani(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getnumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setnumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double incomeTaxRate = numberOfEmployees < 10 ? 0.16 : 0.14;
		return  getAnualIncome() * incomeTaxRate;

	}

}
