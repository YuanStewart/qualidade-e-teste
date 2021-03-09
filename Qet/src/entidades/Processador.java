package entidades;

import java.util.List;

public class Processador {
	
	public List<Boleto> boletos;

	public List<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(List<Boleto> boletos) {
		this.boletos = boletos;
	}

	public Processador() {};
	
	public Processador(List<Boleto> boletos) {
		super();
		this.boletos = boletos;
	}

	
}
