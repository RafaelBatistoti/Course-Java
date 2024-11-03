package entities;

public class Produto {

	private String name;
	private Double unitPrice;
	private Integer quantity;

	public Produto(String name, Double unitPrice, Integer quantity) {
		this.name      = name;
		this.unitPrice = unitPrice;
		this.quantity  = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double totalPrice() {
		return quantity * unitPrice;
	}

}
