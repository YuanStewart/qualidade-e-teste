package entidades;

import java.util.Date;

public class Boleto {
	
	public String codigoDoBoleto;
	public Date data;
	public double valorPago;
	
	
	public String getCodigoDoBoleto() {
		return codigoDoBoleto;
	}

	public void setCodigoDoBoleto(String codigoDoBoleto) {
		this.codigoDoBoleto = codigoDoBoleto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public Boleto() {};

	public Boleto(String codigoDoBoleto, Date data, double valorPago) {
		super();
		this.codigoDoBoleto = codigoDoBoleto;
		this.data = data;
		this.valorPago = valorPago;
	}
	
	

}
