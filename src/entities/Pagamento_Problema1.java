package entities;

public class Pagamento_Problema1 {

	
	private double custoHora = 10.00;
	private double custoDiaria = 130.0;
	
	protected double geraPagamentoDiaria(double tempo) {
		System.out.println( "Permanencia (Di�rias): " + (tempo) + " -> Custo di�ria: " +  custoDiaria);
		System.out.println( "Permanencia Pre�o: " + (tempo*custoDiaria) );
		return (tempo*custoDiaria) + Imposto_Problema1.calculaImposto(tempo*custoDiaria);
	}
	protected double geraPagamentoHora(double tempo) {
		System.out.println( "Permanencia Horas: " + (tempo) + " -> Custo hora: " +  custoHora);
		System.out.println( "Permanencia Pre�o: " + (tempo*custoHora) );
		return (tempo*custoHora) + Imposto_Problema1.calculaImposto(tempo*custoHora);
	}
	
}
