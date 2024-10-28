package entities;

public class OutedSurced extends Employee {

	private Double additionaCharge;

	public OutedSurced() {
		super();

	}

	public OutedSurced(String name, Integer hours, Double valuePerHour, Double additionaCharge) {
		super(name, hours, valuePerHour);
		this.additionaCharge = additionaCharge;
	}

	public Double getAdditionaCharge() {
		return additionaCharge;
	}

	public void setAdditionaCharge(Double additionaCharge) {
		this.additionaCharge = additionaCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionaCharge * 1.1;
	}

}
