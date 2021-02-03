package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import model.services.Parcela_Problema2;

public class Contract_Problema2 {
	private Date start;
	private int number;
	private Parcela_Problema2 parcelas;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date getStart() {
		return start;
	}
	public int getNumber() {
		return number;
	}
	public Parcela_Problema2 getParcelas() {
		return parcelas;
	}
	public Contract_Problema2(Date start, int number, Parcela_Problema2 parcelas) {
		this.start = start;
		this.number = number;
		this.parcelas = parcelas;
	}
	
	public Contract_Problema2() {}
	
	
	public ArrayList<String> geraParcelas() {
		ArrayList<String> retorno = new ArrayList<>();
		
		Calendar start = Calendar.getInstance();
		start.setTime(getStart());
		//double valorParcela = parcelas.getValorContrato()/parcelas.getQtdparcelas();
		double valorAgregado = 0.0;
		for (int x=1;x<=parcelas.getQtdparcelas();x++) {
			start.add(Calendar.MONTH, +1);
			valorAgregado += parcelas.parcelamentoValor(x);
			retorno.add(""+ sdf.format(start.getTimeInMillis()) + " - $: " + String.format("%.2f", parcelas.parcelamentoValor(x)) + "(Agregado: " +  String.format("%.2f)", valorAgregado));
		}
		
		parcelas.jurosFinal(valorAgregado);
		
		retorno.add("Juros Totais: " + String.format("%.3f", parcelas.getJurosTotais()*100) + "%");
		
		return retorno;
	}
	
	public void imprimirValoresContratados() {
		
		ArrayList<String> impressao = geraParcelas();
		
		for(String p : impressao) {
			System.out.println(p);
		}
	}
	
}
