package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract_Problema2;
import model.services.Parcela_Problema2;
import model.services.Paypal_Problema2;

public class Program_Problema2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insert Contract Data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Contract Date (dd/MM/yyyy): ");
		Date start = sdf.parse(sc.next());
		
		System.out.print("Contracts´s value: ");
		double valorContrato = sc.nextDouble();

		System.out.print("Number of Installments: ");
		int qtdparcelas = sc.nextInt();
		
		System.out.println("---------------------------------------");
		System.out.println("Installments: ");
		
		//start = sdf.parse("25/06/2018");
		//valorContrato = 600.00;
		//number = 8383;
		//qtdparcelas = 3;
		
		Contract_Problema2 contrato = new Contract_Problema2(start, number, new Parcela_Problema2( qtdparcelas, valorContrato, new Paypal_Problema2() ) );
		contrato.imprimirValoresContratados();
		
		sc.close();
	}

}
