package entities;

public class ImportedProduct extends Product {

	private Double costomsFee;

	public ImportedProduct(String name, Double price, Double costomsFee) {
		super(name, price);
		this.costomsFee = costomsFee;
	}

	public Double getCostomsFee() {
		return costomsFee;
	}

	public void setCostomsFee(Double costomsFee) {
		this.costomsFee = costomsFee;
	}

	public double totalPrice() {
		return getPrice() + costomsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Costoms fee: $" + String.format("%.2f", costomsFee) + ")";
	}

}
