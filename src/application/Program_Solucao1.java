package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental_Solucao1;
import model.entities.Vehicle_Solucao1;
import model.services.BrasilTaxServices_Solucao1;
import model.services.RentalService_Solucao1;

public class Program_Solucao1 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.print("Car model:");
		String carModel = sc.nextLine();
		
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental_Solucao1 cr = new CarRental_Solucao1(start, finish, new Vehicle_Solucao1(carModel));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService_Solucao1 rentalService = new RentalService_Solucao1(pricePerDay, pricePerHour, new BrasilTaxServices_Solucao1());

		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		sc.close();

	}

}
