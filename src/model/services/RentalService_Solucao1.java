package model.services;

import model.entities.CarRental_Solucao1;
import model.entities.Invoice_Solucao1;

public class RentalService_Solucao1 {
	
	private Double pricePerDay, pricePerHour;
	private BrasilTaxServices_Solucao1 taxService;

	public RentalService_Solucao1(Double pricePerDay, Double pricePerHour, BrasilTaxServices_Solucao1 taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	public void processInvoice(CarRental_Solucao1 carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double) ((((t2-t1) / 1000) / 60) / 60);
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice_Solucao1(basicPayment, tax));
		
		
	}
}
