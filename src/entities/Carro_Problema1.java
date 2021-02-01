package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Carro_Problema1 {
	private String modelo;
	private Calendar entrada, saida;
	private Pagamento_Problema1 pagamento = new Pagamento_Problema1();
	private boolean impressao;
	private SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	
	public Carro_Problema1(String modelo, Calendar entrada, Calendar saida) {
		this.modelo = modelo;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public String getModelo() {
		return modelo;
	}
	public Calendar getEntrada() {
		return entrada;
	}
	public Calendar getSaida() {
		return saida;
	}
	@Override
	public String toString() {
		return "Model: " + modelo +"\n" +
				 "Entrada: " + date_format.format(entrada.getTime()) +"\n" +
				 "Saída: " + date_format.format(saida.getTime());
	}
	
	public double geraPagamento() {
	
		long permanencia = saida.getTimeInMillis() - entrada.getTimeInMillis();
		long hora = 3600000;
		long diaria = hora*12;
		
		System.out.printf( "Tempo total de Permanencia: %.2f horas" , ((float) permanencia/(float) hora));
		System.out.println();
		
		if(permanencia >= diaria) {
			if( (permanencia % diaria) == 0) {
				return pagamento.geraPagamentoDiaria( permanencia/diaria );
			}
			else {
				return pagamento.geraPagamentoDiaria( (int) (permanencia/diaria)+1 );
			}
		}else {
			if(permanencia >= hora) {
				if( (permanencia % hora) == 0) {
					return pagamento.geraPagamentoHora((double) permanencia/hora) ;
				}else {
					return pagamento.geraPagamentoHora(  (int) (permanencia/hora)+1 );
				}
			}else {
				return pagamento.geraPagamentoHora(permanencia/hora);
			}
		}
	}
	
}
