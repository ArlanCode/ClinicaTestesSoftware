package entities;

import java.util.ArrayList;

public class FichaAtendimento {
	
	private Integer id;
	private String motivoConsulta;
	private String detalhes;
	private ArrayList<String> procedimentos = new ArrayList<>();;
	private Boolean atendido = false;
	
	public FichaAtendimento(String motivoConsulta, Integer id) {
		this.motivoConsulta = motivoConsulta;
		this.id = id;
	}

	public FichaAtendimento() {
		
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMotivoConsulta() {
		return motivoConsulta;
	}

	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public ArrayList<String> getProcedimentos() {
		return procedimentos;
	}

	public void addProcedimentos(String procedimento) {
		this.procedimentos.add(procedimento);
	}

	public Boolean getAtendido() {
		return atendido;
	}

	public void setAtendido(Boolean atendido) {
		this.atendido = atendido;
	}
	
	
}
