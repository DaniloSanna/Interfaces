package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Carro_Problema1;

public class Program_Problema1 {

	public static void main(String[] args) throws ParseException{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.print("Entre o modelo: ");
		String modelo = sc.nextLine();

		System.out.print("Entre com horário de entrada (dd/mm/yyyy hh:mm): ");
		Date dataentrada = sdf.parse(sc.nextLine());
		
		System.out.print("Entre com horário de saída (dd/mm/yyyy hh:mm): ");
		Date datasaida = sdf.parse(sc.nextLine());
		*/
		String modelo = "A";
		Date dataentrada = sdf.parse("31/01/2021 14:00");
		Date datasaida = sdf.parse("31/01/2021 14:00");
		
		Calendar entrada = Calendar.getInstance();
		Calendar saida = Calendar.getInstance();
		
		entrada.setTime(dataentrada);
		saida.setTime(dataentrada);
				
		saida.add(Calendar.HOUR_OF_DAY, 1);
		saida.add(Calendar.MINUTE, 30);
		
		Carro_Problema1 carro = new Carro_Problema1(modelo, entrada, saida);
		System.out.println("Detalhamento: "+ "\n" + carro.toString());
		double preco = carro.geraPagamento();
		System.out.println("Total R$: "+ preco);
		
		sc.close();
		
		
	}
}
