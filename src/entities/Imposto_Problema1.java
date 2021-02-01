package entities;

public class Imposto_Problema1 {
	
	private static Double imposto1 = 0.20;
	private static Double imposto2 = 0.15;
	
	protected static Double calculaImposto(double aluguel) {

		if(aluguel <=100.00) {
			System.out.println( "Imposto Horas: " + (imposto1*aluguel) + "(" + imposto1*100 + "%)");
			return imposto1*aluguel;	
		}else {
			System.out.println( "Imposto Horas: " + (imposto2*aluguel) + "(" + imposto2*100 + "%)");
			return imposto2*aluguel;	
		}
		
	}
}
