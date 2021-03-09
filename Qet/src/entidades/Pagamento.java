package entidades;

import java.util.Date;

public class Pagamento {

	public enum tipoDePagamento
	{
		BOLETO
	}
	public double valorTotalPago;
	public Date data;
	
	public double getValorTotalPago() {
		return valorTotalPago;
	}
	
	public void setValorTotalPago(double valorTotalPago) {
		this.valorTotalPago = valorTotalPago;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Pagamento() {};
	
	public Pagamento(double valorTotalPago, Date data) {
		super();
		this.valorTotalPago = valorTotalPago;
		this.data = data;
	}
	
	
}
