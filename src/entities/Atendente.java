package entities;

import java.time.LocalDate;

import application.Sistema;

public class Atendente extends User {
	
	private String turno;
	
	public Atendente(Long id, Long cpf, LocalDate nascimento, String nome, String turno ) {
		super(id, cpf, nascimento, nome);
		this.turno = turno;
	}
	
	public Atendente() {
		
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void inserirFicha(Paciente p, String motivoConsulta, String detalhes, Sistema sistema, Integer id) {
		
		FichaAtendimento ficha = new FichaAtendimento(motivoConsulta, id);
		p.adicionarHistorico(ficha);
		sistema.addFichasChamadas(ficha);
				
	};
	
	public void cadastrarPaciente ( Sistema sistema, Long id, Long cpf, LocalDate nascimento, String nome) {
		
		Paciente p = new Paciente( id,  cpf,  nascimento,  nome );
		sistema.addPacientes(p);
		
	};
	
	public boolean consultarCadastro (Long cpf, Sistema sistema) {
		return sistema.verificarCadastroPaciente(cpf);
	}
	

}
