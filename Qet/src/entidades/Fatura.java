package entidades;

import java.util.Date;

public class Fatura {
	
	public enum statusDoPagamento
	{
		VALOR_PAGO, VALOR_NAO_PAGO
	}
	
	public Date data;
	public double valorTotal;
	public String nomeDoCliente;
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public Fatura() {};
	
	public Fatura(Date data, double valorTotal, String nomeDoCliente) {
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeDoCliente = nomeDoCliente;
	}
	
}
