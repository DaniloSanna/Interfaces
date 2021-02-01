package model.services;

public class BrasilTaxServices_Solucao1 implements TaxServices_Solucao1 {
	
	public double tax(double amount) {
		if(amount <= 100.00) {
			return amount*0.2;
		}else
			return amount*0.15;
	}
}
