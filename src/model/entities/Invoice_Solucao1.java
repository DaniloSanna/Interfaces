package model.entities;

public class Invoice_Solucao1 {

	private Double basicPayment, tax;

	public Invoice_Solucao1(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Invoice_Solucao1() {
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotalPayment() {
		return getBasicPayment()+getTax();
	}
}
