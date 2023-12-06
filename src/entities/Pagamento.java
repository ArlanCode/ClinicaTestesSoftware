package entities;

import java.util.ArrayList;
import java.util.Random;

public class Pagamento {
	
	private String tipoPagamento;
	private Double valor;
	private Long nf;
	private Boolean pago = false;

	public Pagamento(FichaAtendimento ficha) {

		this.valor = calcularValorConsulta(ficha.getProcedimentos());
		
		Random rand = new Random();
		this.nf = (long) rand.nextInt(100);

	}

	public Pagamento() {
		
	}

	public Double calcularValorConsulta(ArrayList<String> procedimentos) {

		Double valor = 0.0;

		for (String procedimento : procedimentos) {

			if (procedimento == "obturacao") {
				valor += 100;
			} else if (procedimento == "limpeza") {
				valor += 120;
			} else if (procedimento == "extracao") {
				valor += 150;
			}

		}

		return valor;

	}
	
	public String realizarPagamento(String tipoPagamento) {
		
		String texto = "seu pagamento no valor de: " + valor + " foi recebido via " + tipoPagamento;
		pago = true;
		this.tipoPagamento = tipoPagamento;
		
		return texto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Long getNf() {
		return nf;
	}

	public void setNf(Long nf) {
		this.nf = nf;
	}

	public String getTipo() {
		return tipoPagamento;
	}

	public void setTipo(String tipo) {
		this.tipoPagamento = tipo;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	

	
}
