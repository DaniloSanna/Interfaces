package model.services;

public class Parcela_Problema2 {
	private int qtdparcelas;
	private double valorContrato;
	private Credor_Problema2 juros;
	
	private double jurosTotais;
	
	
	public int getQtdparcelas() {
		return qtdparcelas;
	}
	public double getValorContrato() {
		return valorContrato;
	}
	public Credor_Problema2 getJuros() {
		return juros;
	}
	public Parcela_Problema2(int qtdparcelas, double valorContrato, Credor_Problema2 juros) {
		this.qtdparcelas = qtdparcelas;
		this.valorContrato = valorContrato;
		this.juros = juros;
	}
	
	public Parcela_Problema2() {}

	public double parcelamentoValor(double parcelaAtual) {
		return juros.jurosParcela(parcelaAtual,(double) (valorContrato/qtdparcelas));
	}
	
	public void jurosFinal(double valorFinal) {
		juros.setJuroTotais((valorFinal-valorContrato)/valorContrato);
		
		jurosTotais = juros.getJuroTotais();
	}
	public double getJurosTotais() {
		return jurosTotais;
	}
}
