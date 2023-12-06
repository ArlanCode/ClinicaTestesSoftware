package entities;

import java.time.LocalDate;

import application.Sistema;

public class Dentista extends User {
	
	private Integer cfo;
	private String especialidade;
	
	public Dentista(Long id, Long cpf, LocalDate nascimento, String nome, Integer cfo, String especialidade) {
		super(id, cpf, nascimento, nome);
		this.cfo = cfo;
		this.especialidade = especialidade;
	}		
	
	public Dentista() {
		
	}
	
	public void adicionarDetalhe(String detalhe, FichaAtendimento f) {
		f.setDetalhes(detalhe);
	}
	
	public void adicionarProcedimento(String procedimento, FichaAtendimento f) {
		f.addProcedimentos(procedimento);
	}
	
	public FichaAtendimento proximoPaciente(Sistema sistema) {
		return sistema.chamarProximo();
	}
	
	public void concluirAtendimento(Sistema sistema) {
		sistema.concluirAtendimento();
	}

	public Integer getCfo() {
		return cfo;
	}

	public void setCfo(Integer cfo) {
		this.cfo = cfo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
		
	

}
