package entities;

public class Individual extends TaxPayer {

	private Double healthExpeditures;

	public Individual(String name, Double anualIncome, Double healthExpeditures) {
		super(name, anualIncome);
		this.healthExpeditures = healthExpeditures;
	}

	public Double getHealthExpeditures() {
		return healthExpeditures;
	}

	public void setHealthExpeditures(Double healthExpeditures) {
		this.healthExpeditures = healthExpeditures;
	}

	@Override
	public double tax() {

		double incomeTaxRate       = getAnualIncome() < 20000.00 ? 0.15 : 0.25;
		double healthDeductionRate = getAnualIncome() < 20000.00 ? 0.15 : 0.50;

		return getAnualIncome() * incomeTaxRate - healthExpeditures * healthDeductionRate;
	}

}
