package model.services;

public class Paypal_Problema2 implements Credor_Problema2{

	private double jurosMes = 1.0, jurosPagamento = 2.0;
	private double juroTotais;
	@Override
	public double jurosParcela(double parcelaAtual, double valorParcela) {
		
		double jurosMesCorrente = (jurosMes/100) * parcelaAtual;
		double jurosPagamentoCorrente = jurosPagamento/100;
		
		double alicotaJuros = (valorParcela*jurosMesCorrente) + valorParcela ;
		double alicotaPagamento = (alicotaJuros*jurosPagamentoCorrente);

		return alicotaJuros + alicotaPagamento;
	}
	
	public double getJuroTotais() {
		return juroTotais;
	}
	public void setJuroTotais(double juroTotais) {
		this.juroTotais = juroTotais;
	}
	
	

}
