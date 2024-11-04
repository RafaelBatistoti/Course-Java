package model.entities;

public class Invoice {
	
	private Double basicPaymment;
	private Double tax;
	
	public Invoice(Double basicPaymment, Double tax) {
		this.basicPaymment = basicPaymment;
		this.tax           = tax;
	}

	public Double getBasicPaymment() {
		return basicPaymment;
	}

	public Double getTax() {
		return tax;
	}

	public void setBasicPaymment(Double basicPaymment) {
		this.basicPaymment = basicPaymment;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double totalPaymment() {
		return getBasicPaymment() + getTax();
		
	}
	
}
