package model.entities;

import java.util.Date;

public class CarRental_Solucao1 {
	private Date start, finish;
	
	private Vehicle_Solucao1 vehicle;
	private Invoice_Solucao1 invoice;
	
	public CarRental_Solucao1() {}

	public CarRental_Solucao1(Date start, Date finish, Vehicle_Solucao1 vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle_Solucao1 getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle_Solucao1 vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice_Solucao1 getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice_Solucao1 invoice) {
		this.invoice = invoice;
	}
	
	
	
}
